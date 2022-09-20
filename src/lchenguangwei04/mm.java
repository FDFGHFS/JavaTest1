package lchenguangwei04;

import java.util.Scanner;

class mm {
    String admin;                               //创建变量
    int mm;

    public mm(String padmin, int pmm) {         //构造器
        this.admin = padmin;
        this.mm = pmm;
    }

    public void pe() {
        Scanner a1 = new Scanner(System.in);
        System.out.print("\n请输入密码:");                           //提示
        if (a1.nextInt() == mm) {                                  //判断密码是否正确
            System.out.print("\n密码正确，请输入新密码");              //提示
            mm = a1.nextInt();                                     //接受新密码并更换
            System.out.println("\n修改密码成功，你的新密码为" + mm);    //提示
        } else {
            System.out.println("\n密码错误");
        }
    }
}
