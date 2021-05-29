package com.company.Commands;

import com.company.Command;
import com.company.Main;
import com.company.Models.Worker;

public class Show implements Command {


    @Override
    public void Execute(String command) {
        for (Worker worker : Main.arrayWorker.getWorkers()) {
            System.out.println(worker.toString());
        }

    }

    @Override
    public String getName() {
        return getClass().getSimpleName();
    }

}
