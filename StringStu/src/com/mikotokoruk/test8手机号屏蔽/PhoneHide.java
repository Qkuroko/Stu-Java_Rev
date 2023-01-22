package com.mikotokoruk.test8手机号屏蔽;

import java.util.Scanner;

/*
需求：以字符串的形式从键盘接受一个手机号，将中间四位号码屏蔽
最终效果为：`131****9468`
 */
public class PhoneHide {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入手机号");
        String result = "";
        while (true) {
            String phoneNumber = sc.next();

            if(phoneNumber.length()==11){//课写一个方法来判断是否为手机号 boolean类型
                for(int i = 0 ; i<3; i++){
                    //第1-3位正常输出
                    result = result + phoneNumber.charAt(i);
                }
                for(int i = 3 ; i<7; i++){
                    //第4-7位输出*
                    result = result + "*";
                }
                for(int i = 7 ; i<11; i++){
                    result = result + phoneNumber.charAt(i);
                }
                break;
            }else{
                System.out.println("输入有误,请重新输入");
            }
        }
        System.out.println(result);
    }
}
