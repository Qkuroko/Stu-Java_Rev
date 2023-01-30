package com.mikotokoruk.exn;

public class Person {
    private String name;
    private int age;

    public Person() {
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    /**
     * 获取
     * @return name
     */
    public String getName() {
        return name;
    }

    /**
     * 设置
     * @param name
     */
    public void setName(String name) {
        this.name = name;
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

    public String toString() {
        return "Person{name = " + name + ", age = " + age + "}";
    }

//    public void keepPet(Dog dog , String something){
//        System.out.println("人在喂狗"+something);
//    }
//    public void keepPet(Cat cat , String something){
//        System.out.println("人在喂猫"+something);
//    }
    public void keepPet(Animal animal,String something){
        if (animal instanceof Dog){
            Dog dog = (Dog) animal;
            System.out.println("人在喂狗"+something);
        }else if(animal instanceof  Cat){
            Cat cat = (Cat) animal;
            System.out.println("人在喂猫"+something);
        }else{
            System.out.println("没有这种动物");
        }
    }

}
