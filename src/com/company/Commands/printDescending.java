package com.company.Commands;

import com.company.Command;
import com.company.Main;
import com.company.Models.Worker;

public class printDescending implements Command {
    @Override
    public void Execute(String command) throws Exception {
        Main.arrayWorker.getWorkers().toArray(new Worker[0]);
        for (Worker worker : Main.arrayWorker.getWorkers()){
            System.out.println(worker.toString());
        }
    }

    @Override
    public String getName() {
        return getClass().getSimpleName();
    }
}
