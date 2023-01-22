package com.mikotokoruk.test7金额转换;

import java.util.Scanner;
/*
把2135变成：零佰零拾零万贰仟壹佰叁拾伍元
把789变成：零佰零拾零万零仟柒佰捌拾玖元
 */
public class StringMoneyChange {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int money;
        while (true) {
            System.out.println("请输入金额");
            money = sc.nextInt();
            if(money>=0&&money<=9999999){

               break;
            }else{
                System.out.println("输入不合法");
            }
        }


        //得到money中每一位数字  eg 123 从右获取 3 2 1
        /*
        123 第一次 ge = 3 moeny =12
            第二次 ge = 2 moeny =1
            第三次 ge = 1 moeny =0 跳出循环
         */
        String moneyStr = "";
        while(true){
            int ge = money % 10;//123%10 = 3     12%10 = 2
//            System.out.println(ge);   //第一次输出3 第二次输出2 第三次
            String capitalNumber = getCapitalNumber(ge);
//            System.out.println(capitalNumber);
            moneyStr =  capitalNumber + moneyStr ;
            money = money / 10;  //但是当其等于0的时候没有必要再除
            if(money == 0){
                break;
            }
        }
        System.out.println(moneyStr);


        //在前面补 0
        int count = 7 - moneyStr.length();
        for (int i = 0; i < count; i++) {
            moneyStr = "零" + moneyStr;
        }
        System.out.println(moneyStr);  //零零零贰叁肆肆

        //格式化输出  零零零贰叁肆肆 利用查表法
        String[] arr = {"佰","拾","万","仟","佰","拾","元"};
        //遍历moneyStr，依次得到 零    零   零   贰   壹   叁   伍
        //然后把arr的单位插入进去

        String result = "";
        for (int i = 0; i < moneyStr.length(); i++) {
            char c = moneyStr.charAt(i);
//            System.out.println(c);
            result = result +  c + arr[i];
        }
        System.out.println(result);

    }




    //查表法
    //1 -- 1 -- 壹
    public static String getCapitalNumber(int number){
        String[] arr = {"零", "壹", "贰", "叁", "肆", "伍", "陆", "柒", "捌", "玖"};
        return arr[number];
    }
}
