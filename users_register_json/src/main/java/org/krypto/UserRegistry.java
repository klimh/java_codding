package org.krypto;

import com.google.gson.reflect.TypeToken;
import com.google.gson.*;

import java.io.*;
import java.util.ArrayList;
import java.util.List;


public class UserRegistry {
    private List<User> users = new ArrayList<>();
    private static final String FILE_NAME = "users.json";
    private Gson gson = new Gson();

    public void addUser(User user) {
        users.add(user);
        saveToFile();
    }

    public void loadFromFile() {
        try(Reader reader = new FileReader(FILE_NAME)) {
            users = gson.fromJson(reader, new TypeToken<List<User>>(){}.getType());
            if (users == null) {
                users = new ArrayList<>();
            }
        }catch(IOException e){
            users = new ArrayList<>();
        }
    }

    public void saveToFile() {
        try(Writer writer = new FileWriter(FILE_NAME)) {
            gson.toJson(users, writer);
        }catch(IOException e){
            e.printStackTrace();
        }
    }

    public void printUsers() {
        users.forEach(user -> System.out.println(user.getName() + " - " + user.getEmail()));
    }

}
