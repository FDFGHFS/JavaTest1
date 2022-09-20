package chenguangwei04;

import java.util.Scanner;

public class change {
    String[] names = new String[5];                     //创建一个字符串数组

    public void aname(String name) {
        for (int i = 0; i < names.length; i++) {        //循环
            if (names[i] == null) {                     //当names[i]为空时
                names[i] = name;                        //传参
                break;                                  //跳出循环
            }
        }
    }

    public void show() {
        System.out.println("--------------------");
        for (int i = 1; i < names.length + 1; i++) {        //循环
            if (names[i - 1] != null) {                     //把所有名字输出
                System.out.println("第" + i + "个客户姓名为:" + names[i - 1]);
            }
        }
    }

    public int edit(String name) {
        Scanner scanner = new Scanner(System.in);
        for (int n = 0; n < names.length; n++) {            //遍历
            if (name.equals(names[n])) {                    //查找名字
                System.out.println("请输入新客户名:");
                names[n] = scanner.next();                  //修改
                System.out.println("修改成功");
                System.out.println("==================");
                return 1;
            }
        }
        return 2;
    }
}
