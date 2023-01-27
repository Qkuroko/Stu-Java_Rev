package com.mikotokoruk.a01staticdemo1;

public class Student {
    //写一个JavaBean来描述这个班级的学生 属性姓名 年龄 性别 行为 学习
    private String name;
    private int age;
    private String gender;

    public static String teacherName; //加static后是共享的 只需要给一个对象的teacherName赋值其他也是 调用方式可用 Student.teacherName = "";

    public Student(){

    }
    public Student(String name, int age , String gender){
        this.name = name;
        this.age = age;
        this.gender = gender;

    }

    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public void study(){
        System.out.println(name+"正在学习");
    }

    public void show(){
        System.out.println(name+","+age+","+gender);
    }
}
