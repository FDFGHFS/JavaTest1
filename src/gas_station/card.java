package gas_station;

public class card {
    private String name;
    private double money;

    //构造器
    public card(String name, double money) {
        setMoney(money);
        setName(name);
    }

    //封装
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getMoney() {
        return money;
    }

    public void setMoney(double money) {
        this.money = money;
    }

    public double payment(double a) {
        money -= a;
        return 0;
    }
}