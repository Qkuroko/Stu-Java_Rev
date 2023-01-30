package com.mikotokoruk.exn;

public class Test {
    public static void main(String[] args) {
        Person person1 = new Person("老王",30);
        Dog d = new Dog(2,"黑颜色");
        System.out.println("年龄为"+person1.getAge()+"岁的"+person1.getName()+"养了一只"+d.getColor()+"的"+d.getAge()+"岁的狗");
        String dogFood = "骨头";
        person1.keepPet(d,dogFood);
        d.eat(dogFood);

        Person person2 = new Person("老李",25);
        Cat c = new Cat(3,"灰颜色");
        System.out.println("年龄为"+person2.getAge()+"岁的"+person2.getName()+"养了一只"+c.getColor()+"的"+c.getAge()+"岁的狗");
        String catFood = "鱼🐟";
        person2.keepPet(c,catFood);
        c.eat(catFood);
    }
}
