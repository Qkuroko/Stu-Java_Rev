package com.mikotokoruk.test;

public class Ex6_ChangeData {
    public static void main(String[] args) {
        //需求：定义一个数组，存入1,2,3,4,5。按照要求交换索引对应的元素。
        //交换前：1,2,3,4,5
        //交换后：5,2,3,4,1
        int[] arr = {1,2,3,4,5,6,7};

        // 4 3 2 1 0 下标
        //0 1 2 3 4 5 6
        //第0个和第n-1-0个索引换 第1个和第n-1-1个索引换 1,2,3直到n/2
        for (int i = 0; i<=arr.length/2; i++){
            int temp = arr[i];
            arr[i] = arr[arr.length-1-i];
            arr[arr.length-1-i] = temp;
        }
        for (int i = 0; i<arr.length; i++){
            System.out.println(arr[i]);
        }
    }
}
