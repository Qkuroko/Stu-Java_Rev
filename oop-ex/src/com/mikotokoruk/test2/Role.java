package com.mikotokoruk.test2;

import java.util.Random;

public class Role {
    //格斗游戏 血量姓名 k o
    private String name;
    private int blood;
    private String face;//长相是随机的
    private char gender;

    //无参构造
    public Role() {
    }
    //带参构造

    public Role(String name, int blood, char gender) {
        this.name = name;
        this.blood = blood;
        this.gender = gender;
        //长相随机的
        setFace(gender);
    }

    public String getFace() {
        return face;
    }

    public void setFace(char gender) {
        //长相是随机的
        if (gender == '男') {
            Random r = new Random();
            int index = r.nextInt(boyfaces.length);
            this.face = boyfaces[index];
        } else if (gender == '女') {
            Random r = new Random();
            int index = r.nextInt(girlfaces.length);
            this.face = girlfaces[index];
        } else {
            this.face = "非男非女";
        }
    }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    String[] boyfaces = {"风流俊雅", "气宇轩昂", "相貌英俊", "五官端正", "相貌平平", "一塌糊涂", "面目狰狞"};
    String[] girlfaces = {"美奂绝伦", "沉鱼落雁", "婷婷玉立", "身材娇好", "相貌平平", "相貌简陋", "惨不忍睹"};
    String[] attacks_desc = {
            "%s使出了一招【背心钉】，转到对方的身后，一掌向%s背心的灵台穴拍去。",
            "%s使出了一招【游空探爪】，飞起身形自半空中变掌为抓锁向%s。",
            "%s大喝一声，身形下伏，一招【劈雷坠地】，捶向%s双腿。",
            "%s运气于掌，一瞬间掌心变得血红，一式【掌心雷】，推向%s。",
            "%s阴手翻起阳手跟进，一招【没遮拦】，结结实实的捶向%s。",
            "%s上步抢身，招中套招，一招【劈挂连环】，连环攻向%s。"
    };
    //injured 受伤描述：
    String[] injureds_desc = {
            "结果%s退了半步，毫发无损",
            "结果给%s造成一处瘀伤",
            "结果一击命中，%s痛得弯下腰",
            "结果%s痛苦地闷哼了一声，显然受了点内伤",
            "结果%s摇摇晃晃，一跤摔倒在地",
            "结果%s脸色一下变得惨白，连退了好几步",
            "结果『轰』的一声，%s口中鲜血狂喷而出",
            "结果%s一声惨叫，像滩软泥般塌了下去"
    };


//    public Role(int blood, String face, char gender, String[] boyfaces, String[] girlfaces) {
//        this.blood = blood;
//        this.face = face;
//        this.gender = gender;
//        this.boyfaces = boyfaces;
//        this.girlfaces = girlfaces;
//    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getBlood() {
        return blood;
    }

    public void setBlood(int blood) {
        this.blood = blood;
    }


    //定义一个方法用于攻击别人
    //Role r1 = new Role();
    //Role r2 = new Role();
    //r1.攻击(r2);  方法的调用着攻击参数
    public void attack(Role role) {
        //设定攻击动作
        Random r = new Random();
        int index = r.nextInt(attacks_desc.length);




        //计算造成伤害 //加一表示1-20
        int hurt = r.nextInt(20) + 1;
//        role.blood = role.blood-hurt;
        int remainBlood = role.getBlood() - hurt;

        remainBlood = remainBlood < 0 ? 0 : remainBlood;

        //修改挨揍人的血量 改要用set方法不能直接改
        role.setBlood(remainBlood);





        //this 表示方法的调用者
        //A打了B一下造成XX点伤害,B还剩XX血
        //这里用this.getName
        //System.out.println(this.name + "打了" + role+"一下,造成"+""+"点伤害"+role+"还剩"+""+"血");
        //System.out.println(this.getFace() + "的" + this.getName() + "打了" + role.getName() + "一下,造成" + hurt + "点伤害" + role.getName() + "还剩" + remainBlood + "血");
        System.out.printf(this.getFace()+"的"+attacks_desc[index],this.getName(),role.getName());
        System.out.printf( "造成" + hurt + "点伤害" + role.getName() + "还剩" + remainBlood + "血.");

        if (remainBlood > 90) {
            System.out.printf(injureds_desc[0], role.getName());
        }else if(remainBlood > 80 && remainBlood <= 90){
            System.out.printf(injureds_desc[1], role.getName());
        }else if(remainBlood > 70 && remainBlood <= 80){
            System.out.printf(injureds_desc[2], role.getName());
        }else if(remainBlood > 60 && remainBlood <= 70){
            System.out.printf(injureds_desc[3], role.getName());
        }else if(remainBlood > 40 && remainBlood <= 60){
            System.out.printf(injureds_desc[4], role.getName());
        }else if(remainBlood > 20 && remainBlood <= 40){
            System.out.printf(injureds_desc[5], role.getName());
        }else if(remainBlood > 10 && remainBlood <= 20){
            System.out.printf(injureds_desc[6], role.getName());
        }else{
            System.out.printf(injureds_desc[7], role.getName());
        }
        System.out.println();

    }

    public void injured(){


    }

    public void showRoleInfo() {
        System.out.println("姓名:" + getName());
        System.out.println("血量:" + getBlood());
        System.out.println("性别:" + getGender());
        System.out.println("面貌:" + getFace());
    }
}
