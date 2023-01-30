package com.mikotokoruk.ex;

public class Dog {
    private int age;
    private String color;

    public Dog() {
    }

    public Dog(int age, String color) {
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
        return "Dog{age = " + age + ", color = " + color + "}";
    }
    public void eat(String something){
        System.out.println("狗正在吃"+something);
    }
    public void lookHome(){
        System.out.println("狗在看家");
    }
}
