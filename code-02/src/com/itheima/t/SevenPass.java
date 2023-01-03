package com.itheima.t;

import java.util.Scanner;

public class SevenPass {
    public static void main(String[] args) {
        //包含7或七的倍数 过
        System.out.println("请输合法数字x");
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        while (x <= 0 || x >= 100) {
            System.out.println("请输合法数字x(0-100)");
            Scanner sc1 = new Scanner(System.in);
            x = sc1.nextInt();
        }
        for (int i = 0; i <= x; i++) {
            if (i % 7 == 0 || i / 10 == 7 || i % 10 == 7) {
                System.out.println("过");
            } else {
                System.out.println(i);
            }
        }
    }
}