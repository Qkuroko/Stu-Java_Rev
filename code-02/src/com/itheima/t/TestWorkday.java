package com.itheima.t;

import java.util.Scanner;

public class TestWorkday {
    public static void main(String[] args) {
        //输入日期
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入日期");
        int week = sc.nextInt();
        switch (week){
//            case 1 :{
//                System.out.println("工作日");
//                break;
//            }
//            case 1 -> {
//                System.out.println("工作日");
//            }
//            case 3 -> System.out.println("工作日");
//            case 4 -> System.out.println("工作日");
//            case 5 -> System.out.println("工作日");
//            case 6 -> System.out.println("休息日");
//            case 7 -> System.out.println("休息日")
            //利用case穿透
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
                System.out.println("工作日");
                break;
            case 6:
            case 7:
                System.out.println("休息日");
                break;
            default:
                System.out.println("输入有误");
                break;


        }
    }
}
