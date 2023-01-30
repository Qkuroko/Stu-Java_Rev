package com.mikotokoruk.exn;

public class Cat extends Animal{
    public Cat() {
    }

    public Cat(int age, String color) {
        super(age, color);
    }

    @Override
    public void eat(String something) {
        System.out.println(this.getAge()+"岁的"+this.getColor()+"的猫眯着眼睛侧着头吃鱼");
    }

    public void catchMouse() {
        System.out.println("猫在抓老鼠");
    }
}
