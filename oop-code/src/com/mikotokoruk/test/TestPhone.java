package com.mikotokoruk.test;

public class TestPhone {
    public static void main(String[] args) {
        Phone xiaomi = new Phone();
        xiaomi.name = "xiaomi";
        xiaomi.price = 1999;
        xiaomi.call(xiaomi.name);
    }
}
