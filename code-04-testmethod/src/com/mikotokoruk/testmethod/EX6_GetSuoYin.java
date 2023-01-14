package com.mikotokoruk.testmethod;

import java.util.Scanner;

public class EX6_GetSuoYin {
    public static void main(String[] args) {
        //定义一个方法获取数字，在数组中的索引位置，将结果返回给调用处，
        // 如果有重复的，只要获取第一个即可。
        int[] arr = {1,2,3,4,7,6,3};
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入数字,将查询其索引位置(-1代表数组中无此元素):");
        int x = sc.nextInt();
        System.out.println(getSuoYin(arr,x));
    }
    public static int getSuoYin(int[] arr, int x){
        int result = -1;
        for(int i =0; i<arr.length; i++){
            if(arr[i]==x){
                result = i;
                break;
            }
        }
        return result;
    }
}
