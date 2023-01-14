package com.mikotokoruk.testmethod;

public class Ex4_Bianli {
    //需求：设计一个方法用于数组遍历，要求遍历的结果是在一行上的。例如：[11, 22, 33, 44, 55]
    public static void main(String[] args) {
        int[] arr = {11, 22, 33, 44, 55};
        printArr(arr);
    }
    public static void printArr(int[] arr){
//        for(int i = 0; i<arr.length; i++){
//            System.out.print(arr[i]+",");
//        }
        //上面输出结果为 11,22,33,44,55,
        System.out.print("[");
        for(int i = 0; i<arr.length; i++){
            if(i!= arr.length-1){
                System.out.print(arr[i]+",");
            }else{
                System.out.print(arr[i]+"]");
            }
        }
    }

}
