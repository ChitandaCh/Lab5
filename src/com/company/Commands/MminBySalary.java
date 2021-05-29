package com.company.Commands;

import com.company.Command;
import com.company.Main;
import com.company.Models.Worker;

public class MminBySalary implements Command {

    @Override
    public void Execute(String command) {
        double salary = Double.MAX_VALUE;

        for(Worker worker : Main.arrayWorker.getWorkers()){
            if(worker.getSalary() < salary){
                salary = worker.getSalary();
            }
        }
        System.out.println(salary);
    }

    @Override
    public String getName() {// получает имя класса getClass().getName() этот метод не подходит, так как вернет com.company.Commands.Add
        return getClass().getSimpleName();
    }
}