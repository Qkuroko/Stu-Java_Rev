package com.mikotokoruk.eg2;

public class Test {
    public static void main(String[] args) {
        Animal a = new Dog();
        //调用成员变量:编译看左边,运行也看左边
        System.out.println(a.name);//动物

        //调用成员方法:编译看左边,运行也看右边
        a.show();//dog show

    }
}

class Animal{
    String name = "动物";
    public void show(){
        System.out.println("animal show");
    }
}

class Dog extends Animal{
    String name = "狗";
    public void show(){
        System.out.println("dog show");
    }
}