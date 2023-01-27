package com.mikotokoruk.a01staticdemo2;

import java.util.ArrayList;

import static com.mikotokoruk.a01staticdemo2.StudentUtil.getMaxAge;

public class StudentTest {
    public static void main(String[] args) {
        ArrayList<Student> list = new ArrayList<>();
        Student s1 = new Student("s1",18,"女");
        Student s2 = new Student("s2",20,"女");
        Student s3 = new Student("s3",19,"女");
        list.add(s1);
        list.add(s2);
        list.add(s3);
        System.out.println(getMaxAge(list));
    }

}
