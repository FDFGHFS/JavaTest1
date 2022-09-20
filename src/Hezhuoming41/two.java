package Hezhuoming41;

import java.util.Scanner;

 public class two {
    public static void main(String[] args) {
        one st = new one();
        Scanner input = new Scanner(System.in);
        for (int i = 0; i < 5; i++) {
            System.out.print("请输入客户姓名");
            String newName = input.next();
            st.addName(newName);
        }
        st.show();
        System.out.println("请输入要修改的客户名字");
        String oldName = input.next();
        System.out.println("请输入新的客户名字");
        String newName = input.next();
        System.out.println("******修改结果******");
        if (st.editName(oldName, newName)) {
            System.out.println("找到并修改成功");
        } else {
            System.out.println("没有找到");
        }
        st.show();
    }
}