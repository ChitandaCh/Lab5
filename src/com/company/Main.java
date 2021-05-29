package com.company;

import com.company.Models.*;

import java.time.LocalDateTime;
import java.util.Scanner;

public class Main {
    public static Scanner scanner = new Scanner(System.in);
    public static LocalDateTime create;
    public static ArrayWorker arrayWorker = new ArrayWorker();


    public static void main(String[] ar) throws Exception {

        create = LocalDateTime.now();
        arrayWorker = Converter.getInstance().GetJson();
        if(arrayWorker == null){
            arrayWorker = new ArrayWorker();
        }
        while (true){
            Printer.getInstance().writeLine("введите команду");
            String next = scanner.nextLine();
            boolean isCommand = false;
            for (Command command : CommandFactory.getInstance().getCommands()) {
                if (next.startsWith(command.getName())||next.toLowerCase().startsWith(command.getName().toLowerCase())){
                    command.Execute(next);
                    isCommand = true;
                }
            }
            if(!isCommand){
                Printer.getInstance().writeLine("нет такой команды");
            }
        }
    }
}

