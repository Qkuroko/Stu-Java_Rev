package com.mikotokoruk.test;

import java.util.Scanner;

public class Test1_IsSymmetry {
    /*
    键盘接受一个字符串，程序判断出该字符串是否是对称字符串，并在控制台打印是或不是
    对称123321  非对称1123
     */
    public static void main(String[] args) {
        //借助StringBuilder中的reverse方法
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入字符串");
        String str = sc.next();

        StringBuilder sb = new StringBuilder(str);
        if(str.equals( sb.reverse().toString()) ){//不可用==  判断的是地址值
            System.out.println("对称");
        }else{
            System.out.println("不对称");
        }
    }

}
