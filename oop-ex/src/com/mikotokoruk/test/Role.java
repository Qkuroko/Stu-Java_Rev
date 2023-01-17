package com.mikotokoruk.test;

import java.util.Random;

public class Role {
    //格斗游戏 血量姓名 k o
    private String name;
    private int blood;

    public Role() {
    }

    public Role(String name, int blood) {
        this.name = name;
        this.blood = blood;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getBlood() {
        return blood;
    }

    public void setBlood(int blood) {
        this.blood = blood;
    }


    //定义一个方法用于攻击别人
    //Role r1 = new Role();
    //Role r2 = new Role();
    //r1.攻击(r2);  方法的调用着攻击参数
    public void attack(Role role){
        //计算造成伤害 //加一表示1-20
        Random r = new Random();
        int hurt = r.nextInt(20)+1;
//        role.blood = role.blood-hurt;
        int remainBlood = role.getBlood()-hurt;

        remainBlood = remainBlood < 0 ? 0 :remainBlood;

        //修改挨揍人的血量 改要用set方法不能直接改
        role.setBlood(remainBlood);


        //this 表示方法的调用者
        //A打了B一下造成XX点伤害,B还剩XX血
        //这里用this.getName
        //System.out.println(this.name + "打了" + role+"一下,造成"+""+"点伤害"+role+"还剩"+""+"血");
        System.out.println(this.getName() + "打了" + role.getName()+"一下,造成"+hurt+"点伤害"+role.getName()+"还剩"+remainBlood+"血");



    }
}
