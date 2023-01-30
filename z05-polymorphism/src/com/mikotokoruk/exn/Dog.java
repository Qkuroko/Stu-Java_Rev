package com.mikotokoruk.exn;

public class Dog extends Animal{
    public Dog() {
    }

    public Dog(int age, String color) {
        super(age, color);
    }

    @Override
    public void eat(String something) {
        System.out.println("狗两只前腿死死的抱住骨头猛吃");
    }

    public void lookHome(){
        System.out.println("狗在看家");
    }
}
