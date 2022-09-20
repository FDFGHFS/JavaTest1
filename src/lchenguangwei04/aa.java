package lchenguangwei04;

public class aa {
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
            if (names[i -1] != null) {                     //把所有名字输出
                System.out.println("第" + i + "个学生姓名为:" + names[i - 1]);
            }
        }
    }
}