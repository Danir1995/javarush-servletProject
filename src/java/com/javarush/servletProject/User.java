package com.javarush.servletProject;

import lombok.Data;

import java.util.ArrayList;
import java.util.List;

@Data
public class User {
    private String userName;
    private List<String> items = new ArrayList<>();
    private int attempts;
    public void addItems(String item){
        items.add(item);
    }
}
