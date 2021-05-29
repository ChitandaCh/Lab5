package com.company;

import com.company.Models.*;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.io.*;
import java.time.LocalDateTime;

public class Converter {
    private static String path = "";
    private static Converter instance;
    private final Gson gson;
    private Converter(){
        gson = new GsonBuilder().registerTypeAdapter(LocalDateTime.class, new DeSerialize()).registerTypeAdapter(LocalDateTime.class, new Serialize()).setPrettyPrinting().create();
        path = System.getenv("laba");
    }

    public synchronized static Converter getInstance()  {
            if (instance == null) {
                instance = new Converter();
            }
            return instance;
    }

    public ArrayWorker GetJson(){
        try {
            File file = new File (path);
            InputStreamReader inputStreamReader = new InputStreamReader(new FileInputStream(file));
            char[] chars = new char[(int)file.length()];
            inputStreamReader.read(chars, 0, (int)file.length());
            return gson.fromJson(String.copyValueOf(chars), ArrayWorker.class);
        }
        catch (Exception w){
            System.out.println(w.getMessage());
            return null;
        }
    }

    public void SetJson(ArrayWorker worker){
        try {
            System.out.println(path);
            OutputStreamWriter outputStreamWriter = new OutputStreamWriter(new FileOutputStream(path));
            String string = gson.toJson(worker);
            outputStreamWriter.write(string, 0, string.length());
            outputStreamWriter.close();

        }
        catch (Exception ignored){

        }
    }
}
