package com.mikotokoruk.eg1;

public class Test {
    public static void main(String[] args) {
        Student student1 = new Student();
        student1.setName("学生1");
        student1.setAge(18);

        Teacher teacher1 = new Teacher();
        teacher1.setName("老师1");
        teacher1.setAge(30);

        Admin admin1 = new Admin();
        admin1.setName("管理员1");
        admin1.setAge(25);

        show(teacher1);
        show(student1);
        show(admin1);
    }

    public static void show(Person person){
        String name = person.getName();
        int age = person.getAge();
        System.out.println(name);
        System.out.println(age);
    }
}
