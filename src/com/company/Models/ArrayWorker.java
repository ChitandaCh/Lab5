package com.company.Models;

import com.company.Main;
import com.company.Printer;
import com.company.Validator;

import java.util.ArrayDeque;
import java.util.Date;


public class ArrayWorker {
    public static int ids = 0;
    private final ArrayDeque<Worker> workers;

    public ArrayDeque<Worker> getWorkers() {
        return workers;
    }
    public ArrayWorker(){
        workers = new ArrayDeque<>();
    }
    public static  Worker SetFields(){

        String name = getString("name");
        while (Validator.validName(name)) {
            Printer.getInstance().invalidValue();
            name = getString("name");
        }

        Float x = getFloat("x");
        while (Validator.validFloat(x)) {
            Printer.getInstance().invalidValue();
            x = getFloat("x");
        }

        long y = getLong("y");

        double salary = getFloat("salary");
        while (Validator.validFloat((float)salary)) {
            Printer.getInstance().invalidValue();
            salary = getFloat("salary");
        }

        Position type = null;
        while (true){
            try{
                Printer.getInstance().writeLine("Введите Position");
                for (Position position: Position.values()) {
                    System.out.print("\t\t\t\t" + position);
                }
                Printer.getInstance().writeLine("\n");
                String next = Main.scanner.nextLine();
                if(next.equals("null") || next.equals("")){
                    break;
                }
                type = Position.valueOf(next);
                break;
            }
            catch (Exception ignored){

            }
        }

        Status Status = null;
        while (true){
            try{
                Printer.getInstance().writeLine("Введите Status");
                for (Status status: com.company.Models.Status.values()) {
                    System.out.print("\t\t\t\t" + status);
                }
                Printer.getInstance().writeLine("\n");
                String next = Main.scanner.nextLine();
                if(next.equals("null") || next.equals("")){
                    break;
                }
                Status = com.company.Models.Status.valueOf(next);
                break;
            }
            catch (Exception ignored){

            }
        }


        String fullname = getString("fullname");
        while (Validator.validName(fullname)) {
            Printer.getInstance().invalidValue();
            fullname = getString("fullname");
        }

        int annualTurnover = getInt("annualTurnover");
        while (Validator.validInt(annualTurnover)) {
            Printer.getInstance().invalidValue();
            annualTurnover = getInt("annualTurnover");
        }

        int employeesCount = getInt("employeesCount");
        while (Validator.validInt(annualTurnover)) {
            Printer.getInstance().invalidValue();
            employeesCount = getInt("employeesCount");
        }

        return new Worker(ArrayWorker.ids, name, new Coordinates(x, y), salary, new Date() , type, Status, new Organization(fullname, annualTurnover, employeesCount));
    }



    public static String getString(String name){
        String str = "";
        while (str.equals("")){
            Printer.getInstance().writeLine("Введите поле " + name);
            str = Main.scanner.nextLine();
        }
        return str;
    }
    public static int getInt(String name){
        int str;
        while (true){
            try {
                Printer.getInstance().writeLine("Введите поле " + name);
                str = Integer.parseInt(Main.scanner.nextLine());
                break;
            }
            catch (Exception ignored){

            }
        }
        return str;
    }
    public static Float getFloat(String name){
        float str;
        while (true){
            try {
                Printer.getInstance().writeLine("Введите поле " + name);
                str = Float.parseFloat(Main.scanner.nextLine());
                break;
            }
            catch (Exception ignored){

            }
        }
        return str;
    }
    public static long getLong(String name){
        long str;
        while (true){
            try {
                Printer.getInstance().writeLine("Введите поле " + name);
                str = Long.parseLong(Main.scanner.nextLine());
                break;
            }
            catch (Exception ignored){

            }
        }
        return str;
    }
}
