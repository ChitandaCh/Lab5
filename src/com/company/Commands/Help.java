package com.company.Commands;

import com.company.Command;
import com.company.CommandFactory;
import com.company.Printer;

public class Help implements Command {


    @Override
    public void Execute(String command) {
        for (Command c: CommandFactory.getInstance().getCommands()) {
            Printer.getInstance().writeLine("команда: " + c.getName());
        }
    }

    @Override
    public String getName() {
        return getClass().getSimpleName();
    }
}
