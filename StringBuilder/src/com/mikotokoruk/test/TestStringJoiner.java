package com.mikotokoruk.test;

import java.util.StringJoiner;

public class TestStringJoiner {
    /*
     * StringJoiner跟StringBuilder一样，也可以看成是一个容器，创建之后里面的内容是可变的。
     * 作用：提高字符串的操作效率，而且代码编写特别简洁，但是目前市场上很少有人用。
     * JDK8出现的
     */
    public static void main(String[] args) {
        StringJoiner sj = new StringJoiner(",","[","]");
        String str = sj.add("aaa").add("bbb").toString();
        System.out.println(str);//[aaa,bbb]
    }

}
