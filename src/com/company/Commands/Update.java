package com.company.Commands;

import com.company.Command;
import com.company.Main;
import com.company.Models.ArrayWorker;
import com.company.Models.Worker;
import com.company.Printer;

import java.util.ArrayList;

public class Update implements Command {
    @Override
    public void Execute(String command) {
        String[] s = command.split(" ",2);
        int i = Integer.parseInt(s[1]);
        if(i >= Main.arrayWorker.getWorkers().size()){
            Printer.getInstance().writeLine("id слишком большой");
        }
        else{
            ArrayList<Worker> h = new ArrayList<>(Main.arrayWorker.getWorkers());
            Main.arrayWorker.getWorkers().clear();
            Printer.getInstance().writeLine("введите 1 доп");
            h.set(i, ArrayWorker.SetFields());
            Main.arrayWorker.getWorkers().addAll(h);
        }
    }

    @Override
    public String getName() {
        return getClass().getSimpleName();
    }

}
