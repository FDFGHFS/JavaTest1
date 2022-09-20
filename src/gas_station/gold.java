package gas_station;

public class gold extends card {
    public gold(String name, double money) {
        super(name, money);
    }

    @Override
    public double payment(double a) {
        System.out.println("金卡8折优惠");
        a *= 0.8;
        double b = getMoney() - a;
        setMoney(b);
        return b;
    }
}