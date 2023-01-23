package com.mikotokoruk.test;

public class Test2_ConnectStr {
    /*
需求：定义一个方法，把 int 数组中的数据按照指定的格式拼接成一个字符串返回。
调用该方法，并在控制台输出结果。
例如：数组为int[] arr = {1,2,3};
执行方法后的输出结果为：[1, 2, 3]
*/
    public static void main(String[] args) {
        int[] arr = {1,2,3};
        System.out.println(strConnect(arr));
    }
    public static String strConnect(int[] arr){
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        for (int i = 0; i < arr.length; i++) {
            if(i!=arr.length-1){
                //不是最后一个元素 加逗号
                sb.append(arr[i]).append(",");
            }else{
                sb.append(arr[i]);
            }
        }
        sb.append("]");
        return sb.toString();
    }
}
