package com.mikotokrouk.supertest;

public class Zi extends Fu{
    String name = "Zi";
    String hobby = "游戏";

    public void show(){
        //1如何打印Zi
        System.out.println(name);//相当于this.name
        //如何打印Fu
        System.out.println(super.name);
        //如何打印游戏
        System.out.println(this.hobby);
        //如何打印喝茶
        System.out.println(super.hobby);
    }
}
