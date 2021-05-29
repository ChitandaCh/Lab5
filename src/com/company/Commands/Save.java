package com.company.Commands;

import com.company.Command;
import com.company.Converter;
import com.company.Main;

public class Save implements Command {


    @Override
    public void Execute(String command) throws Exception {
        Converter.getInstance().SetJson(Main.arrayWorker);
    }

    @Override
    public String getName() {
        return getClass().getSimpleName();
    }

}
