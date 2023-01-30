package com.mikotokrouk.ex1;

public class EmployeeTest {
    public static void main(String[] args) {
        Manager manager1 = new Manager("001","hah",234.2,222);
        System.out.println(manager1.toString());
        manager1.eat();
        manager1.work();
        System.out.println(manager1);//toString 方法的好处可以不用写方法名
        Cooker cooker1 = new Cooker();
        cooker1.setId("hh");
        System.out.println(cooker1.toString());
        cooker1.eat();
        cooker1.work();
    }
}
