package com.company.Commands;

import com.company.Command;
import com.company.Main;
import com.company.Models.ArrayWorker;
import com.company.Models.Worker;

public class Add implements Command {

    @Override
    public void Execute(String command) {
        Worker w = ArrayWorker.SetFields();
        Main.arrayWorker.getWorkers().add(w);
    }

    @Override
    public String getName() {// получает имя класса getClass().getName() этот метод не подходит, так как вернет com.company.Commands.Add
        return getClass().getSimpleName();
    }

}
