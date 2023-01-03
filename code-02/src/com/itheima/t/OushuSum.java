package com.itheima.t;

import java.util.Scanner;

public class OushuSum {
    public static void main(String[] args) {
        System.out.println("输入x,计算0-x的偶数和");
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int sum = 0;
        for(int i=0; i<=x; i+=2){
            sum += i ;
        }
        System.out.println(sum);
    }
}
