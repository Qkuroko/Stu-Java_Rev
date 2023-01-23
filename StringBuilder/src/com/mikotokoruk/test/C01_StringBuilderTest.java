package com.mikotokoruk.test;

public class C01_StringBuilderTest {
    /*
 StringBuilder 可以看成是一个容器，创建之后里面的内容是可变的。
当我们在拼接字符串和反转字符串的时候会使用到
     */
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("abc");
//        sb.append(1);
//        sb.append(true);
//        sb.append("哈哈哈");

        sb.append(1).append("aaa");//链式编程
        System.out.println(sb);
        sb.reverse();
        System.out.println(sb);


    }
}
