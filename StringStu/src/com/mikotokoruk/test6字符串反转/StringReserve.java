package com.mikotokoruk.test6字符串反转;

import java.util.Scanner;

/*
定义一个方法，实现字符串反转。键盘录入一个字符串，调用该方法后，在控制台输出结果
例如，键盘录入 abc，输出结果 cba
 */
public class StringReserve {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入字符:");
        String str = sc.next();
        String str1 = stringReverse(str);
        System.out.println(str1);
    }

    public static String stringReverse(String str){
        /*
        1 2 3 4 5
        0 1 2 3 4
        a[4] a[3]
        a[length-1] ...  a[0]
         */
        String result = "";
        for (int i = str.length()-1; i >= 0; i--) {
            result = result + str.charAt(i);
        }
        return result;
    }
}
