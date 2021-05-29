package com.company.Commands;

import com.company.Command;
import com.company.Main;
import com.company.Models.ArrayWorker;
import com.company.Models.Worker;
import com.company.Printer;

public class removeGreater implements Command {

    @Override
    public void Execute(String command) {
        Worker w = ArrayWorker.SetFields();
        if(Main.arrayWorker.getWorkers().removeIf(u -> u.compareTo(w) < 0)){
            Printer.getInstance().writeLine("успешно");
        }
        else{
            Printer.getInstance().writeLine("неудача");
        }
    }

    @Override
    public String getName() {// получает имя класса getClass().getName() этот метод не подходит, так как вернет com.company.Commands.Add
        return getClass().getSimpleName();
    }

}