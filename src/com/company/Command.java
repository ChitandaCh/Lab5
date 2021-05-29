package com.company;

public interface Command {// интерфейс, который обьединяет все команды
    public void Execute(String command) throws Exception;// метод который вызвает комнаду
    public String getName();// имя команды
}
