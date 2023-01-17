package com.mikotokoruk.test;

public class GameTest {
    public static void main(String[] args) {
        //创建第一个角色
        Role r1= new Role();
        r1.setName("小明");
        r1.setBlood(100);
        //第二个角色
        Role r2 = new Role();
        r2.setName("小红");
        r2.setBlood(110);

        while(true){
            r1.attack(r2);
            if(r2.getBlood()==0){
                System.out.println(r1.getName()+"K.O"+r2.getName());
                break;
            }

            r2.attack(r1);
            if(r1.getBlood()==0){
                System.out.println(r2.getName()+"K.O"+r1.getName());
                break;
            }
        }

//        xiaoming.attack(xiaoming);
//        xiaoming.attack(xiaoming);
    }
}
