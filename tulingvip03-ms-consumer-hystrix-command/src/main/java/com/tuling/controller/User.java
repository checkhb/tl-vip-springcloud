package com.tuling.controller;

import lombok.Data;

@Data
public class User {
    private int id;
    private String name;

    public User(int id, String name) {

    }
}
