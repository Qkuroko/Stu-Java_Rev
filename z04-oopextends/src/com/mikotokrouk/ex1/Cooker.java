package com.mikotokrouk.ex1;

public class Cooker extends Employee{
    public Cooker() {
    }

    public Cooker(String id, String name, double salary) {
        super(id, name, salary);
    }

    @Override
    public void work() {
        System.out.println("厨师在做饭");
    }

    @Override
    public void eat() {
        System.out.println("厨师在吃米饭");
    }
}
