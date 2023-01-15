package com.mikotokoruk.test;

public class User {
    //属性
    private String name;
    private String password;
    private String email;
    private String gender;
    private int age;

    //空参
    public User(){
        System.out.println("空参构造哦");
    }

    //带全部参的构造
    public User(String name, String password, String email, String gender, int age){
        this.name = name;
        this.password = password;
        this.email = email;
        this.gender = gender;
        this.age = age;
    }

    //get()和set()方法
    public void setName(String name){
        this.name = name;
    }
    public String getName(){
        return name;
    }
    //idea 快捷键 alt + insert

}
