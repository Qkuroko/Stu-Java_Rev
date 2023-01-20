package com.mikotokoruk.test6;

/*
定义一个长度为3的数组，数组存储1~3名学生对象作为初始数据，学生对象的学号，姓名各不相同。
学生的属性：学号，姓名，年龄。
要求1：再次添加一个学生对象，并在添加的时候进行学号的唯一性判断。
要求2：添加完毕之后，遍历所有学生信息。
要求3：通过id删除学生信息如果存在，则删除，如果不存在，则提示删除失败。
要求4：删除完毕之后，遍历所有学生信息。
要求5：查询数组id为“heima002”的学生，如果存在，则将他的年龄+1岁
 */
public class StudentTest {
    public static void main(String[] args) {
        //定义一个长度为3的数组，数组存储1~3名学生对象作为初始数据
        Student[] students = new Student[3];
        //要求1：再次添加一个学生对象，并在添加的时候进行学号的唯一性判断。
        Student s1 = new Student(001, "小张", 18);
        Student s2 = new Student(002, "小王", 19);
        Student s3 = new Student(003, "小李", 20);

        students[0] = s1;
        students[1] = s2;
        students[2] = s3;

        //要求1：再次添加一个学生对象，并在添加的时候进行学号的唯一性判断。
        Student s4 = new Student(004, "小赵", 18);

        //重复直接返回
        //不重复:1.数组满->数组扩大一个空间塞入   2.数组未满直接塞入(arr[length]=s4)
        //1.
        boolean flag = contains(students, s4.getId());

        if (flag == true) {
            //已重复
            System.out.println("已存在");
        } else {
            //不重复
            int count = getCount(students);//统计数组中多少元素
            if (count==students.length){
                //此时数组已满 需扩大数组再加入
                Student[] newStudents = createNewArr(students);
                newStudents[count] = s4;
                //要求2：添加完毕之后，遍历所有学生信息。
                printArr(newStudents);

            }else{
                //没有存满
                students[count]=s4;
                //要求2：添加完毕之后，遍历所有学生信息。
                printArr(students);
            }

        }

    }

    //判断是否重复 是否在里面
    public static boolean contains(Student[] students, int id) {
        for (int i = 0; i < students.length; i++) {
            if (students[i].getId() == id) {
                return true;
            }
        }
        return false;
    }
    //判断数组中存了几个元素的方法
    public static int getCount(Student[] arr){
        int cnt=0;
        for(int i = 0; i<arr.length; i++){
            if(arr[i] != null);
            cnt ++;
        }
        return cnt;
    }

    //创建一个新数组 长度为老数组加一
    //之前元素拷贝到新数组中 最后一个放新元素
    public static Student[] createNewArr(Student[] arr){
        Student[] newArr = new Student[arr.length+1];
        for(int i = 0; i<arr.length; i++){
            newArr[i] = arr[i];
        }
        return newArr;
    }

    public static void printArr(Student[] arr){
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]!=null){
                System.out.println(arr[i].getId()+","+arr[i].getName()+","+arr[i].getAge());
            }
        }
    }
}
