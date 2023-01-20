package com.mikotokoruk.test5;
/*
定义数组存储3部手机对象。
手机的属性：品牌，价格，颜色。
要求，计算出三部手机的平均价格
 */
public class Phone {
    private String brand;
    private int price;
    private String color;

    public Phone(){
    }

    public Phone(String brand,int price,String color){
        this.brand = brand;
        this.price = price;
        this.color = color;
    }

    public String getBrand(){
        return brand; //return this.brand;
    }
    public void setBrand(String brand){
        this.brand = brand;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
