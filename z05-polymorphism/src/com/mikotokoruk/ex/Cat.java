package com.mikotokoruk.ex;

public class Cat {
    private int age;
    private String color;

    public Cat() {
    }

    public Cat(int age, String color) {
        this.age = age;
        this.color = color;
    }

    /**
     * 获取
     * @return age
     */
    public int getAge() {
        return age;
    }

    /**
     * 设置
     * @param age
     */
    public void setAge(int age) {
        this.age = age;
    }

    /**
     * 获取
     * @return color
     */
    public String getColor() {
        return color;
    }

    /**
     * 设置
     * @param color
     */
    public void setColor(String color) {
        this.color = color;
    }

    public String toString() {
        return "Cat{age = " + age + ", color = " + color + "}";
    }
    public void eat(String something){
        System.out.println("猫正在吃"+something);
    }
    public void catchMouse() {
        System.out.println("猫在抓老鼠");
    }
}
