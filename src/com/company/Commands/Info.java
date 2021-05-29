package com.company.Commands;

import com.company.Command;
import com.company.Main;
import com.company.Printer;

public class Info implements Command {
    public final String name = getClass().getSimpleName();


    @Override
    public void Execute(String command) {
        Printer.getInstance().writeLine("дата создания: " + Main.create.toString() + "\r\nколичество элментов: " + Main.arrayWorker.getWorkers().size());
    }

    @Override
    public String getName() {
        return name;
    }


}
