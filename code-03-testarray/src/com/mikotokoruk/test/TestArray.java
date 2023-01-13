package com.mikotokoruk.test;

import java.util.Arrays;

public class TestArray {
    public static void main(String[] args) {
        //数组静态初始化
        //一般格式 int name = new int[]{元素1,元素2...};
        //简化格式 int[] name ={元素1,元素2...};
        int[] age = {18,19,20};
        String[] studentName  = {"张三","李四"};
        System.out.println(Arrays.toString(age));//这里输出的是数组的地址值
        System.out.println(age[1]);
        System.out.println(studentName[1]);
    }
}
