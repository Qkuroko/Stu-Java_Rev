package com.mikotokoruk.testmethod;

import java.util.Scanner;

public class Ex1_GetMax {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入第一个数的值:");
        int a = sc.nextInt();
        System.out.println("请输入第二个数的值:");
        int b = sc.nextInt();
        System.out.println("最大数为"+getMax(a,b));
    }

    public static int getMax(int a, int b) {
        if (a > b) {
            return a;
        }else{
            return b;
        }
    }
}
