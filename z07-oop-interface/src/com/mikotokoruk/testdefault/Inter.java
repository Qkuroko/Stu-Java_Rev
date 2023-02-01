package com.mikotokoruk.testdefault;

public interface Inter {
    public abstract void show();  //实现这个接口的类必须强制重写此方法

    public default void show1(){
        System.out.println("Inter接口中的show1方法(default修饰)");
    }//实现这个接口的类不必强制重写此方法


}
