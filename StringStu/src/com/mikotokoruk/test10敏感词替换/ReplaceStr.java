package com.mikotokoruk.test10敏感词替换;

import java.util.Scanner;

//需求：键盘录入一个 字符串，如果字符串中包含（TMD），则使用***替换
public class ReplaceStr {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入:");
        String talk = sc.next();
        System.out.println("替换前:"+talk);

        String[] arr = {"TMD","GDX","ctmd","ZZ","lj","FW","nt"};

        for (int i = 0; i < arr.length; i++) {
            String star = "";
            for (int i1 = 0; i1 < arr[i].length(); i1++) {
                star = star + "*";
            }
            talk = talk.replace(arr[i],star);
        }
        System.out.println("替换后:"+talk);
    }
}
