package com.mikotokoruk.ex;

public class BasketballSport extends Sporter{
    public BasketballSport() {
    }

    public BasketballSport(String name, int age) {
        super(name, age);
    }

    @Override
    public void study() {
        System.out.println("篮球运动员在学习打篮球");
    }
}
