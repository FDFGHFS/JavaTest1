package wzs;

public abstract class Person {
    private String name;
    private double money;


    public Person() {
    }

    public Person(String name, double money) {
        this.name = name;
        this.money = money;
    }

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

    public void pay(double money){
        System.out.print("银行卡");
    }
}
