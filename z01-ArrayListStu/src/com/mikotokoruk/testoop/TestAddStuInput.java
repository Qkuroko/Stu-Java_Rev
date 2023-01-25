package com.mikotokoruk.testoop;

import java.util.ArrayList;
import java.util.Scanner;

public class TestAddStuInput {
    //创建一个存储学生对象的集合，键盘录入存储3个学生对象，使用程序实现在控制台遍历该集合
    public static void main(String[] args) {
        ArrayList<Student> students = new ArrayList<>();

        Scanner sc = new Scanner(System.in);
        int flag = 0;

        for (int i = 0; i < 3; i++) {
            Student s = new Student();//创建学生对象不能写在循环外面
            System.out.println("请输入第"+(i+1)+"个学生姓名:");
            s.setName(sc.next());
            System.out.println("请输入第"+(i+1)+"个学生年龄:");
            s.setAge(sc.nextInt());
            students.add(s);
        }
        for (int i = 0; i < students.size(); i++) {
            System.out.println(students.get(i).getName()+","+students.get(i).getAge());

        }

    }

}
