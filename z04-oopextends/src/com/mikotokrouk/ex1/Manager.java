package com.mikotokrouk.ex1;

public class Manager extends Employee{

    private double bouns;//奖金

    public Manager() {
    }

    public Manager(String id, String name, double salary, double bouns) {
        super(id, name, salary);
        this.bouns = bouns;
    }

    @Override
    public void work() {
        System.out.println("经理在管理其他人");
    }

    @Override
    public void eat() {
        System.out.println("经理在吃米饭");
    }
}
