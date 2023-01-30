package com.mikotokoruk.exn;

public class Cat extends Animal{
    public Cat() {
    }

    public Cat(int age, String color) {
        super(age, color);
    }

    @Override
    public void eat(String something) {
        System.out.println("狗两只前腿死死的抱住骨头猛吃");
    }

    public void catchMouse() {
        System.out.println("猫在抓老鼠");
    }
}
