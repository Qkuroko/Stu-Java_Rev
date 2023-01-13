package com.mikotokoruk.test;

import java.util.Random;

public class Ex5_Count2 {
    public static void main(String[] args) {
        //需求：生成10个1~100之间的随机数存入数组。
        //1）求出所有数据的和
        //2）求所有数据的平均数
        //3）统计有多少个数据比平均值小

        //int[] = {};静态数组不好实现要用动态数组
        int[] arr = new int[10];//后来往里面填东西用动态数组
        Random r = new Random();
        for(int i = 0; i < 10; i++){
            int number = r.nextInt(1,101);
            arr[i] = number;
        }

        //求sum
        int sum = 0;
        for(int i = 0; i < 10; i++){
         sum += arr[i];
        }
        double avg = sum/10.0;
        System.out.println("总和为:"+sum);
        System.out.println("平均数为:"+avg);

        //3）统计有多少个数据比平均值小
        int cnt = 0;
        for(int i = 0; i < 10; i++){
            if (arr[i] < avg) {
                cnt++;
            }
        }
        System.out.println("小于平均数"+avg+"的个数是"+cnt);

        for(int i = 0; i < 10; i++){
            System.out.println(arr[i]);
        }

    }
}
