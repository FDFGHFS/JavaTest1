package wzs;

public class two extends Person{
    public two() {
    }

    public two(String name, double money) {
        super(name, money);
    }

    @Override
    public  void pay(double money){
        double a1 = money * 0.85;
        double a2 = getMoney() - a1;
        System.out.println("银卡85折");
        System.out.println(getName()  + "当前账号余额总金额：" + getMoney() + ",当前消费了：" + a1 + "余额剩余" + a2);
        super.pay(money);
        setMoney(a2);
    }

}

