package wzs;

public class Test {
    public static void main(String[] args) {

        one a1 = new one();
        a1.setMoney(10000);
        a1.setName("小白");
        a1.pay(1000);
        System.out.println("余额是：" + a1.getMoney());

        System.out.println("--------------------------------------------------------------------");

        two a2 = new two();
        a2.setMoney(12000);
        a2.setName("小黑");
        a2.pay(1200);

        System.out.println("余额是：" + a2.getMoney());

    }
}

