package com.itheima.t;

import java.util.Scanner;

public class Tigerweight {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入第一只老虎体重");
        int a = sc.nextInt();
        System.out.println("请输入第二只老虎体重");
        int b = sc.nextInt();
        if(a==b){
            System.out.println("体重相同");
        }else{
            System.out.println("体重不同");
        }
    }
}
