package com.tuling.controller;

public class JvmDemo {

    public int math(){
        int a = 1;
        int b = 2;
        int c = a*b+3;
        return c;
    }

    public static void main(String[] args) {
        JvmDemo jvmDemo = new JvmDemo();
        System.out.println(jvmDemo.math());
    }
}
