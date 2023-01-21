package com.mikotokoruk.test3;

import java.util.Scanner;

//键盘录入一个字符串，使用程序实现在控制台遍历该字符串
public class StringPrintEvery {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个字符:");
        String str = sc.next();
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            System.out.println(c);
        }
    }
}
