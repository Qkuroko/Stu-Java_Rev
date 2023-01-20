package com.mikotokoruk.test5;

import java.util.Scanner;

/*
定义数组存储3部手机对象。
手机的属性：品牌，价格，颜色。
要求，计算出三部手机的平均价格
 */
public class PhoneTest {
    public static void main(String[] args) {
        Phone[] phones = new Phone[3];

        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < 3; i++) {
            Phone phone = new Phone();

            System.out.println("请输入第" + (i + 1) + "个手机的品牌:");
            phone.setBrand(sc.next());
            System.out.println("请输入第" + (i + 1) + "个手机的价格:");
            phone.setPrice(sc.nextInt());
            System.out.println("请输入第" + (i + 1) + "个手机的颜色:");
            phone.setColor(sc.next());

            phones[i] = phone;
        }

        int sumPrice = 0;
        for (int i = 0; i < phones.length; i++) {
            System.out.println(phones[i].getBrand() + "," + phones[i].getPrice() + "," + phones[i].getColor());
            sumPrice += phones[i].getPrice();
        }
        System.out.println("平均价格为" + sumPrice / phones.length);


    }

}
