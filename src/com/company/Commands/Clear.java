package com.company.Commands;

import com.company.Command;
import com.company.Main;

public class Clear implements Command {
    @Override
    public void Execute(String command) {
        Main.arrayWorker.getWorkers().clear();
    }

    @Override
    public String getName() {
        return getClass().getSimpleName();
    }

}
