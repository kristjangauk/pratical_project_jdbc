package com.service;

import com.VendingMachine;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.io.*;
import java.nio.charset.StandardCharsets;

public class DatabaseService {

    private static final String FILE_PATH = "src/main/resources/vendingMachine.json";

    private Gson gson;

    public  DatabaseService() {
        this.gson = new GsonBuilder().enableComplexMapKeySerialization().setPrettyPrinting().create();
    }

    public void write(VendingMachine vendingMachine) {
        Writer writer = null;

        try {
            writer = new OutputStreamWriter(new FileOutputStream(FILE_PATH), StandardCharsets.UTF_8);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        gson.toJson(vendingMachine, writer);

        try {
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public VendingMachine read() {
        VendingMachine vendingMachine = null;
        try {
            vendingMachine = gson.fromJson(new FileReader(FILE_PATH), VendingMachine.class);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        return vendingMachine;
    }


}
