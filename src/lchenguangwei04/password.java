package lchenguangwei04;

import java.util.Scanner;

public class password {
    public static void main(String[] args) {
        Scanner a1 = new Scanner(System.in);
        mm m1 = new mm("admin", 111111);         //创建对象,并构造初始信息
        mm m2 = new mm("admin1", 123456);
        while (true) {                                           //无限循环
            System.out.print("请输入用户名(输入'n'退出)：");         //提示
            String a = a1.next();                               //接收
            if (a.equals("n"))                                  //判断接收的值并调用相应的语句
                break;
            else if (a.equals(m1.admin)) {
                m1.pe();                                        //调用m1对象的pe方法
            } else if (a.equals(m2.admin)){
                m2.pe();                                        //调用m2对象的pe方法
            }else{
                System.out.println("没有改用户，请重新输入");
            }
        }
    }
}
