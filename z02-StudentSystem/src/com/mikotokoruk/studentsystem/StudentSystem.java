package com.mikotokoruk.studentsystem;

import org.w3c.dom.ls.LSOutput;

import java.util.ArrayList;
import java.util.Scanner;

public class StudentSystem {
    public static void main(String[] args) {
        ArrayList<Student> list = new ArrayList<>();

        loop:  while (true) {//起名跳出到外面循环
            System.out.println("-----------------欢迎来到mikotokoruk学生管理系统-------------------");
            System.out.println("1:添加学生");
            System.out.println("2:删除学生");
            System.out.println("3:修改学生");
            System.out.println("4:查询学生");
            System.out.println("5:退出");
            System.out.println("请输入您的选择：");
            Scanner sc = new Scanner(System.in);
            String choose = sc.next();
            switch(choose){
                case "1" -> addStudent(list);
                case "2" -> deleteStudent(list);
                case "3" -> updateStudent(list);
                case "4" -> queryStudent(list);
                case "5" -> {
                    System.out.println("退出");
                    break loop;//起名跳出到外面循环
                }
                default -> System.out.println("无此选项");
            }
        }
    }

    //添加学生
    public static void addStudent(ArrayList<Student> list){
//        System.out.println("添加学生");
        Scanner sc = new Scanner(System.in);
        Student s = new Student();

//        System.out.println("请输入学生id:");
//        String id = sc.next();
//        for (int i = 0; i < list.size(); i++) {
//            if(id.equals(list.get(i).getId())){
//                System.out.println("已存在");
//                return;
//            }
//        }
//        s.setId(id);
        while (true) {
            System.out.println("请输入学生id:");
            String id = sc.next();
            if(idContains(list,id)){
                System.out.println("已存在,请重新输入");
            }else{
                s.setId(id);
                break;
            }
        }

        System.out.println("请输入学生姓名:");
        s.setName(sc.next());

        System.out.println("请输入学生年龄:");
        s.setAge(sc.nextInt());

        System.out.println("请输入学生地址:");
        s.setAddress(sc.next());

        list.add(s);

        System.out.println("添加成功");
    }
    //删除学生
    public static void deleteStudent(ArrayList<Student> list){
//        System.out.println("删除学生");
        Scanner sc = new Scanner(System.in);
        System.out.println("要删除的id");
        String id = sc.next();
        //获取要删除元素的索引
        int index = getIndex(list,id);
        if(index >= 0){
            list.remove(index);
            System.out.println("删除成功");
        }else{
            System.out.println("不存在,即将返回初始菜单");
        }
    }
    //查询学生
    public static void updateStudent(ArrayList<Student> list){
//        System.out.println("查询学生");
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入要修改的学生id:");
        String id = sc.next();
        if(getIndex(list,id) >= 0){
            Student s = new Student();
            s.setId(id);
            System.out.println("请输入修改后学生姓名:");
            s.setName(sc.next());

            System.out.println("请输入修改后学生年龄:");
            s.setAge(sc.nextInt());

            System.out.println("请输入修改后学生地址:");
            s.setAddress(sc.next());
            list.set(getIndex(list,id),s);
        }else{
            System.out.println("不存在,即将返回初始菜单");
        }
    }
    //查询学生
    public static void queryStudent(ArrayList<Student> list){
//        System.out.println("查询学生");
        if(list.size()==0){
            System.out.println("当前无学生信息，请添加后再查询");
        }else{
            System.out.println("id+\t\t姓名\t年龄\t地址");
            for (int i = 0; i < list.size(); i++) {
                Student s = list.get(i);
                System.out.println(s.getId()+"\t"+s.getName()+"\t"+s.getAge()+"\t"+s.getAddress());
            }

        }
    }

    public static boolean idContains(ArrayList<Student> list, String id){
        for (int i = 0; i < list.size(); i++) {
            if(id.equals(list.get(i).getId())){
                return true;
            }
        }
        return false;
    }

    public static int getIndex(ArrayList<Student> list, String id){
        for (int i = 0; i < list.size(); i++) {
            if(id.equals(list.get(i).getId())){
                return i;
            }
        }
        return -1;
    }
}
