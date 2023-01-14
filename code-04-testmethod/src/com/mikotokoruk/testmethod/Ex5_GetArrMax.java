package com.mikotokoruk.testmethod;

public class Ex5_GetArrMax {
    public static void main(String[] args) {
        int[] arr = {1,2,6,88,3,5,3};
        System.out.println(getArrMax(arr));
    }
    public static int getArrMax(int[] arr){
        int max = arr[0];
        for(int i = 1; i<arr.length; i++){
            if(arr[i]>max){
                max = arr[i];
            }
        }
        return max;
    }
}
