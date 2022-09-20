package chenguangwei04;

import java.util.Scanner;

public class editName {
    public static void main(String[] args) {
        Scanner st = new Scanner(System.in);
        change a1 = new change();                           //new一个aa的对象
        for (int i = 0; i < 5; i++) {               //循环
            System.out.print("输入客户名：");
            String name = st.next();                //接受一个字符串
            a1.aname(name);                         //调用a1对象里的anme方法并把name变量传进去
        }
        a1.show();                                  //调用a1对象中的show方法
        while (true) {                             //无限循环
            System.out.print("请输入客户名(输入'n'退出)：");         //提示
            String a = st.next();                               //接收
            if (a.equals("n"))                                  //判断接收的值并调用相应的语句
                break;
            else {
                if (a1.edit(a) == 2) {
                    System.out.println("没有该客户，请重新输入");
                    System.out.println("====================");
                }
            }
        }
    }
}
