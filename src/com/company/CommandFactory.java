package com.company;

import com.company.Commands.*;

import java.util.ArrayList;

public class CommandFactory {
    private static ArrayList<Command> commands = new ArrayList<>();
    private static CommandFactory Instance;

    public CommandFactory() {
        commands.add(new Add());
        commands.add(new addIfMin());
        commands.add(new Clear());
        commands.add(new executeScript());
        commands.add(new Exit());
        commands.add(new filterContainsName());
        commands.add(new Help());
        commands.add(new Info());
        commands.add(new MminBySalary());
        commands.add(new printDescending());
        commands.add(new removeById());
        commands.add(new removeGreater());
        commands.add(new removeLower());
        commands.add(new Save());
        commands.add(new Update());
        commands.add(new Show());
    }

    public static CommandFactory getInstance() {
        if(Instance == null){
            Instance = new CommandFactory();
        }
        return Instance;
    }

    public ArrayList<Command> getCommands() {
        return commands;
    }
}
