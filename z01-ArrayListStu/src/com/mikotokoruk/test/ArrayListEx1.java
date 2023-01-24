package com.mikotokoruk.test;

import java.util.ArrayList;

public class ArrayListEx1 {
    /*
    创建一个存储字符串的集合，存储3个字符串元素，使用程序实现在控制台遍历该集合
     */
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("aaa");
        list.add("bbb");
        list.add("ccc");

        System.out.println(list);

        for(int i = 0; i<list.size(); i++){
            System.out.println(list.get(i));
        }
    }
}
