package com.mikotokoruk.test;

import java.util.ArrayList;

public class TestArrayListMethod {
    //public boolean add(要添加的元素)将指定的元素追加到此集合的末尾
    // public boolean remove(要删除的元素)删除指定元素,返回值表示是否删除成功
    // public E remove(int index)删除指定索引处的元素，返回被删除的元素
    // public E set(int index,E element)修改指定索引处的元素，返回被修改的元素
    // public E get(int index)返回指定索引处的元素
    // public int size()返回集合中的元素的个数
    public static void main(String[] args) {

        ArrayList<String> list = new ArrayList<>();
        boolean a = list.add("aaa");
        System.out.println(a);
        System.out.println(list);

        String str = list.remove(0);
        System.out.println(str);
        System.out.println(list);

        list.add("aaa");
        System.out.println(list);
        list.set(0,"bb");
        System.out.println(list);
    }
}
