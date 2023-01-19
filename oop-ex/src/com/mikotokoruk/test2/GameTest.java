package com.mikotokoruk.test2;

public class GameTest {
    public static void main(String[] args) {
        //创建第一个角色
        Role r1 = new Role("小明", 100, '男');
        //第二个角色
        Role r2 = new Role("小红", 100, '女');

        r1.showRoleInfo();
        r2.showRoleInfo();

        while (true) {
            r1.attack(r2);
            if (r2.getBlood() == 0) {
                System.out.println(r1.getFace() + "的" + r1.getName() + "K.O" + r2.getName());
                break;
            }

            r2.attack(r1);
            if (r1.getBlood() == 0) {
                System.out.println(r2.getFace() + "的" +r2.getName() + "K.O" + r1.getName());
                break;
            }
        }

//        xiaoming.attack(xiaoming);
//        xiaoming.attack(xiaoming);
    }
}
