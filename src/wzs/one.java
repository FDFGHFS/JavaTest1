package wzs;

public class one extends Person {
    public one() {
    }

    public one(String name, double money) {
        super(name, money);
    }

    @Override
    public  void pay(double money){

            double a1 = money * 0.8;
            double a2 = getMoney() - a1;
            System.out.println("白金卡8折");
            System.out.println(getName() + "当前账号余额总金额：" + getMoney() + ",当前消费了：" + a1 + "余额剩余" + a2);
            super.pay(money);
            setMoney(a2);


    }
}

