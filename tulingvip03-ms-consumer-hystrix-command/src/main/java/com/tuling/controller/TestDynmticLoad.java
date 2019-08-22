package com.tuling.controller;

public class TestDynmticLoad {

    static {
        System.out.println("...............static...........");
    }

    public static void main(String[] args) {
        new A();
        System.out.println(".............loader.test..........");
        new B();
    }
}
class A{
    public A(){
        System.out.println("..........loader A.......");
    }
}
class B{
    public B(){
        System.out.println("..........loader B.......");
    }
}