package gas_station;

public class Silver extends card {
    public Silver(String name, double money) {
        super(name, money);
    }

    @Override
    public double payment(double a) {
        System.out.println("银卡85折优惠");
        a *= 0.85;
        double b = getMoney() - a;
        setMoney(b);
        return b;
    }
}
