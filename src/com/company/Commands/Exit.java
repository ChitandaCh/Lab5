package com.company.Commands;

import com.company.Command;

public class Exit implements Command {


    @Override
    public void Execute(String command) {
        System.exit(0);
    }

    @Override
    public String getName() {
        return getClass().getSimpleName();
    }

}
