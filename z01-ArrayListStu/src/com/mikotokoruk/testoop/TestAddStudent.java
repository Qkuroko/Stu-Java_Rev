package com.mikotokoruk.testoop;

import java.util.ArrayList;

public class TestAddStudent {
    //创建一个存储学生对象的集合，存储3个学生对象，使用程序实现在控制台遍历该集合
    public static void main(String[] args) {
        ArrayList<Student> students = new ArrayList<>();

        Student stu1 = new Student("stu1",18);
        Student stu2 = new Student("stu2",19);
        Student stu3 = new Student("stu3",20);


        students.add(stu1);
        students.add(stu2);
        students.add(stu3);

        for (int i = 0; i < students.size(); i++) {
            System.out.println(students.get(i).getName()+" "+students.get(i).getAge());
        }
    }

}
