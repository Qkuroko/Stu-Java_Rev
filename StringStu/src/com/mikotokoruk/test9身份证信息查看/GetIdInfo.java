package com.mikotokoruk.test9身份证信息查看;

public class GetIdInfo {
    /*身份证的每一位都是有固定的含义：
* 1、2位：省份
* 3、4位：城市
* 5、6位：区县
* 7-14位：出生年、月、日
* 15、16位：所在地派出所
* 17位：性别（奇数男性，偶数女性）
* 18位：个人信息码（随机产生）
要求打印内容方式如下：
人物信息为：
出生年月日：XXXX年X月X日
性别为：男/女
     */
    public static void main(String[] args) {

        String id = "123456200001012222";

        //输出生日
        String year = id.substring(6,10);
        String month = id.substring(10,12);
        String day = id.substring(12,14);

        //获取性别 先将字符转为为整数
        char genderId = id.charAt(16);
//        System.out.println(genderId);
        int num = genderId - 48;
        String gender;
//        System.out.println(num);
        if (num%2==0){
            gender = "女";
        }else{
            gender = "男";
        }

        System.out.println("生日:"+year+"年"+month+"月"+day+"日"+","+"性别:"+gender);
    }
}
