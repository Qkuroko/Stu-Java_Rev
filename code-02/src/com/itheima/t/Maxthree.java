package com.itheima.t;

import java.util.Scanner;

public class Maxthree {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入第一个数");
        int a = sc.nextInt();
        System.out.println("请输入第二个数");
        int b = sc.nextInt();
        System.out.println("请输入第三个数");
        int c = sc.nextInt();
        int temp = a > b ? a : b;
        System.out.println(temp>c ? temp : c);

    }
}
