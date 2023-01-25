package com.mikotokoruk.testget;

import java.util.ArrayList;
import java.util.Scanner;

public class TestUser {
    /*
    需求：
    1，main方法中定义一个集合，存入三个用户对象。
    用户属性为：id，username，password
    2，要求：定义一个方法，根据id查找对应的学生信息。
    如果存在，返回索引
    如果不存在，返回-1
     */
       public static void main(String[] args) {
           ArrayList<User> list = new ArrayList<>();
           list.add(new User("001","a1","123"));
           list.add(new User("002","a2","1233"));
           list.add(new User("003","a3","1234"));
           for (int i = 0; i < list.size(); i++) {
               System.out.println(list.get(i).getId()+","+list.get(i).getUsername()+","+list.get(i).getPassword());
           }
           System.out.println(search(list,"003"));
           System.out.println(search(list,"004"));
       }
       public static int search(ArrayList<User> list,String id){
           for (int i = 0; i < list.size(); i++) {
               if(list.get(i).getId().equals(id)){
                   return i;
               }
           }
           return -1;
       }
}

