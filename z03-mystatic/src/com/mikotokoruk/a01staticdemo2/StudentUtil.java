package com.mikotokoruk.a01staticdemo2;

import java.util.ArrayList;

public class StudentUtil {
    private StudentUtil(){}

    public static int getMaxAge(ArrayList<Student> list){
        int maxAge = list.get(0).getAge();
        for (int i = 1; i < list.size(); i++) {
            int age = list.get(i).getAge(); //用变量存 方法纸调用一次 提高执行效率
            if(age>maxAge){
                maxAge = age;
            }
        }
        return maxAge;
    }
}
