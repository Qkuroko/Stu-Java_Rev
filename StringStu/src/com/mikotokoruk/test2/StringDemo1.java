package com.mikotokoruk.test2;

import java.util.Scanner;

//已知用户名和密码，请用程序实现模拟用户登录。总共给三次机会，登录之后，给出相应的提示
public class StringDemo1 {
    public static void main(String[] args) {
        String rightUserName = "aaa";
        String rightPassWord = "123456";

        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < 3; i++) {
            System.out.println("请输入用户名");
            String userName = sc.next();
            System.out.println("请输入密码");
            String passWord = sc.next();
            if(userName.equals(rightUserName) && passWord.equals(rightPassWord)){
                System.out.println("用户登录");
                break;
            }else {
                if(i==2){
                    System.out.println("输入错误 账号锁定");
                }else{
                    System.out.println("密码错误"+"你还有"+(2-i)+"次机会");
                }

            }
        }

    }
}
