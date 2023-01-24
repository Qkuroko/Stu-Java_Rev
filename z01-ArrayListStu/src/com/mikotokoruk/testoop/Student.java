package com.mikotokoruk.testoop;
//创建一个存储学生对象的集合属性 性名年龄 ，存储3个学生对象，使用程序实现在控制台遍历该集合
public class Student {
    private String name;
    private int age;
/*
自己联系标准javabean手写的
    public void student(){   //不带void  不带返回属性值
    }

    public Student student(String name, int age){  //不带返回属性值
        this.name = name;
        this.age = age;
    }

    public void setName(String name){
        this.name = name;
    }
    public String getName(){
        return name;
    }

 */

    public Student() {
    }

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
