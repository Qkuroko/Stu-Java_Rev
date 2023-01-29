package com.mikotokrouk.override;

public class HaShi extends Dog{
    public void breakHome(){
        System.out.println("拆家");
    }

    @Override
    public void eat() {
        super.eat();
        System.out.println("吃骨头");
    }
}
