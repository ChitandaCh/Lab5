package com.company.Commands;

import com.company.Command;
import com.company.CommandFactory;
import com.company.Printer;

import java.io.File;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.Scanner;

public class executeScript implements Command {

    @Override
    public void Execute(String command) throws Exception {
        File file = new File (command.split(" ",2)[1]);
        InputStreamReader inputStreamReader = new InputStreamReader(new FileInputStream(file));
        Scanner in = new Scanner(inputStreamReader);
        while (in.hasNext()){
            String next = in.nextLine();
            System.out.println(next);
            boolean isCommand = false;
            for (Command commands : CommandFactory.getInstance().getCommands()) {
                if (next.startsWith(commands.getName())) {
                    commands.Execute(next);
                    isCommand = true;
                }
            }
            if(!isCommand){
                Printer.getInstance().writeLine("ошибка");
            }
        }
    }

    @Override
    public String getName() {
        return getClass().getSimpleName();
    }

}