package com.company.Commands;

import com.company.Command;
import com.company.Main;
import com.company.Printer;

public class removeById implements Command {


    @Override
    public void Execute(String command) {
        int i = Integer.parseInt(command.split(" ")[1]);
        if(i >= Main.arrayWorker.getWorkers().size()){
            Printer.getInstance().writeLine("id слишком большой");
        }
        else{
            Main.arrayWorker.getWorkers().remove(Main.arrayWorker.getWorkers().toArray()[i]);
        }
    }

    @Override
    public String getName() {
        return getClass().getSimpleName();
    }

}
