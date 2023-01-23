package com.mikotokoruk.test;

public class Demo2_ToString {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();

        sb.append("aaa");

        String str = sb.toString();
        System.out.println(str);
    }
}
