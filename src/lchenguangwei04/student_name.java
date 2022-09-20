package lchenguangwei04;

import java.util.Scanner;

public class student_name {
    public static void main(String[] args) {
        Scanner st = new Scanner(System.in);
        aa a1 = new aa();                           //new一个aa的对象
        for (int i = 0; i < 5; i++) {               //循环
            System.out.print("输入学生名字：");
            String name = st.next();                //接受一个字符串
            a1.aname(name);                         //调用a1对象里的anme方法并把name变量传进去
        }
        a1.show();                                  //调用a1对象中的show方法
    }
}