package com.tuling.controller;

import lombok.Data;

@Data
public class User {
    private int id;
    private String name;

    public User(int id, String name) {
        this.id = id;
        this.name = name;
    }
    @Override
    protected void finalize() throws Throwable {
        System.out.println("关闭资源，user"+ id + "即将被回收");
    }

}
