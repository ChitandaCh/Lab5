package com.company.Commands;

import com.company.Command;
import com.company.Main;
import com.company.Models.Worker;
import com.company.Printer;


public class filterContainsName implements Command {

    @Override
    public void Execute(String command) {
        String str = command.split(" ", 2)[1];
        for (Worker w: Main.arrayWorker.getWorkers()) {
            if(w.getName().contains(str)){
                Printer.getInstance().writeLine(w.toString());
            }
            else if(w.getName().contains(str.replace(" ", ""))){
                Printer.getInstance().writeLine(w.toString());
            }
        }
    }

    @Override
    public String getName() {
        return getClass().getSimpleName();
    }
}
