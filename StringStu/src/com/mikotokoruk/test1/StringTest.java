package com.mikotokoruk.test1;

import java.util.Scanner;

public class StringTest {
    public static void main(String[] args) {
        String s1 = new String("abc");
        String s2 = "abc";

        System.out.println(s1.equals(s2));

        String str1 = "abc";
        Scanner sc = new Scanner(System.in);
        String str2 = sc.next();//键盘输入的是new出来的
        System.out.println(str1 == str2);



    }
}
