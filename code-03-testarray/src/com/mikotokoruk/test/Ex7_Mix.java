package com.mikotokoruk.test;

import java.util.Random;

public class Ex7_Mix {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        Random r = new Random();
        for (int i = 0; i<5; i++){
//            int number = r.nextInt(0,5);//生成0-4的随机索引
            int number = r.nextInt(arr.length);//生成0-4的随机索引
            int temp = arr[i];
            arr[i] = arr[number];
            arr[number] = temp;
        }
        for (int j = 0; j<arr.length; j++){
            System.out.print(arr[j]+" ");
        }
    }
}
