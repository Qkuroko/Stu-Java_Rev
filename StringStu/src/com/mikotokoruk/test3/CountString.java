package com.mikotokoruk.test3;

import java.util.Scanner;

/*
键盘录入一个字符串，统计该字符串中大写字母字符，
小写字母字符，数字字符出现的次数(不考虑其他字符)
 */
public class CountString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入字符串:");
        String str = sc.next();

        int bigCnt = 0;
        int smallCnt = 0;
        int numberCnt = 0;

        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if(c >= 'a' && c <= 'z'){
                smallCnt ++;
            } else if (c >= 'A' && c <= 'Z') {
                bigCnt ++;
            } else if (c >= '0' && c <= '9'){
                numberCnt ++;
            }
        }
        System.out.println("大写字母个数为:"+bigCnt+","+"小写字母个数为:"+smallCnt+","+"数字为:"+numberCnt);
    }
}
