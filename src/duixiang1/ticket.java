package duixiang1;
public class ticket {
    String name;
    int age;
    public void p(){
        int[] Price = {0,10,20};                            //创建一个门票价格的数组并初始化
        if (age <= 12)                                      //判断age的大小并输出相应的门票价格
            System.out.println("门票价格:" + Price[0]);
        else if (age <= 18)
            System.out.println("门票价格:" + Price[1]);
        else if (age <= 65)
            System.out.println("门票价格:" + Price[2]);
        else
            System.out.println("门票价格:" + Price[0]);
    }
}