package com.company.Commands;

import com.company.Command;
import com.company.Main;
import com.company.Models.ArrayWorker;
import com.company.Models.Worker;
import com.company.Printer;

public class addIfMin implements Command {

    @Override
    public void Execute(String command) {
        Main.arrayWorker.getWorkers().toArray(new Worker[0]);
        Worker w = ArrayWorker.SetFields();
        if(Main.arrayWorker.getWorkers().getFirst().compareTo(w) > 0) {
            Main.arrayWorker.getWorkers().add(w);
            Printer.getInstance().writeLine("успешно");
        }
        else{
            Printer.getInstance().writeLine("ошибка");
        }
    }
    @Override
    public String getName() {// получает имя класса getClass().getName() этот метод не подходит, так как вернет com.company.Commands.Add
        return getClass().getSimpleName();
    }

}
