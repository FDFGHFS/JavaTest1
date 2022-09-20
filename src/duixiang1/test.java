package duixiang1;
import java.util.Scanner;
public class test {
    public static void main(String[] args) {
        Scanner a1 = new Scanner(System.in);
        ticket p1 = new ticket();                                  //new一个对象
        while(true) {                                              //无限循环下面的代码
            System.out.print("请输入姓名(输入”no“退出):");           //提示
            p1.name = a1.next();                                   //用p1对象内的name接收
            if (p1.name.equals("no")){                             //如果name为”no“退出程序
                System.out.println("程序终止");
                break;
            }
            System.out.print("请输入年龄:");                       //提示
            p1.age = a1.nextInt();                                 //用p1对象的age接受
            p1.p();                                                //调用p1下的p方法
        }
    }
}