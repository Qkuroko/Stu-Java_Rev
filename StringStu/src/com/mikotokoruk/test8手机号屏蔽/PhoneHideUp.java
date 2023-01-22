package com.mikotokoruk.test8手机号屏蔽;

public class PhoneHideUp {
    public static void main(String[] args) {
        String phoneNum = "12345678901";

        String start = phoneNum.substring(0,3);

//        String mid = phoneNum.substring(3,7);
        String hide = "****";
        String last = phoneNum.substring(7,11);

        System.out.println(start + hide + last);

    }
}
