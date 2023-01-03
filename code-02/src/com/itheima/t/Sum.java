package com.itheima.t;


import java.util.Scanner;

public class Sum {
    public static void main(String[] args) {
        int sum = 0;
        System.out.println("请输入要计算的n项和");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        for(int i=1; i<=a; i++){
            sum += i;
        }
        System.out.println(sum);
    }


}
