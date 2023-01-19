package com.mikotokoruk.test3;

import java.util.Random;
import java.util.Scanner;

/*需求：
定义数组存储3个商品对象。
商品的属性：商品的id，名字，价格，库存。
创建三个商品对象，并把商品对象存入到数组当中
 */
public class GoodsTest {
    public static void main(String[] args) {
        //创建一个数组 动态初始化
        Goods[] arr = new Goods[3];
        Goods g1 = new Goods("001","商品1",233,3);
        Goods g2 = new Goods("002","商品2",299,1);
        Goods g3 = new Goods("003","商品3",300,6);
//        for(int i = 0; i<arr.length;i++){
//            arr[i]=
//        }
        arr[0]=g1;
        arr[1]=g2;
        arr[2]=g3;
        for(int i = 0; i<arr.length; i++){
            Goods goods = arr[i];
            System.out.println(goods.getId()+','+goods.getName()+','+goods.getPrice()+','+ goods.getCount());
        }
    }


}
