package com.mikotokoruk.test;

public class Ex4_GetMax {
    public static void main(String[] args) {
        //需求：求数组中的最大值
        int[] arr = {33,5,22,44,55};
        int max = arr[0];               //***不要初始化max等于0直接第一个 高效***
        for (int i = 1; i<5; i++){  //***从第二个开始比较提高效率***
            if (max < arr[i]) {
                max = arr[i];
            }
        }
        System.out.println(max);
    }
}
