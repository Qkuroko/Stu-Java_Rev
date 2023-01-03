package com.itheima.t;

import java.util.Scanner;

public class Geshibai {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();

        int ge = number%10;
        int shi = (number/10)%10;
        int bai = number/100;

        System.out.println("个位是"+ge);
        System.out.println("十位是"+shi);
        System.out.println("百位是"+bai);
    }
}
