package com.mikotokoruk.testmethod;

import java.util.Scanner;

public class Ex3_GetMianji {
    //键盘录入两个圆的半径（整数），比较两个圆的面积。
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入第一个数:");
        int r1 = sc.nextInt();
        System.out.println("请输入第二个数:");
        int r2 = sc.nextInt();
        System.out.println("面积最大的为:"+getMaxMianji(r1,r2));
    }

    public static double getMaxMianji(int r1, int r2) {
        double s1 = r1*r1*3.14;
        double s2 = r2*r2*3.14;
        if(r1>r2){
            return s1;
        }else{
            return s2;
        }
    }
}
