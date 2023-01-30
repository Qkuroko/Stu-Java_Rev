package com.mikotokrouk.override;

public class HaShi extends Dog{
    public void breakHome(){
        System.out.println("拆家");
    }

    @Override
    public void eat() {
        super.eat();//加super.方法名() 会执行父类方法
        System.out.println("吃骨头");
    }

    @Override
    public void drink() {
        System.out.println("哈士奇在喝水");
    }
}
