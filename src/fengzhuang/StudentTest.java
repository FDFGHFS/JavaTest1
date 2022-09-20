package fengzhuang;

public class StudentTest {
    /*
    标准的JavaBean格式：
    1。所有的成员变量 private 私有化
    2.提供出【空参】【带参】的构造方法
    3。针对于私有的成员变量，提供setXxx/getXxx 方法
            set：设置/赋值
            get：获取
     */
    /*
    情况：成员变量，没有进行数据的安全校验，有可能会记录一些错误的数据
         比如： age = -18；
    解决：
        1。成员私有化
            错误数据进不来,但同时，正确的也进不来
        2。提供对应的setXxx/getXxx 方法

     */
    public static void main(String[] args) {
        //1。通过无参的构造方法创建对象
        Student stu1 = new Student();
        stu1.setName("Jack");
        stu1.setAge(23);
//        System.out.println(stu1.getName());
//        System.out.println(stu1.getAge());
        stu1.show();


        //2.有参的构造方法创建对象，在创建对象直接赋值
        Student stu2 = new Student(21,"肉丝");
        stu2.show();

        for(int i = 1; i <= stu2.getAge();i++){
            System.out.print("Happy  ");
        }
        if(stu2.getAge() >= 18){
            System.out.println("\n成年");
        }


    }
}

