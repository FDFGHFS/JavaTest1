package gas_station;

public class Test {
    public static void main(String[] args) {
        gold gold = new gold("admin", 10000);
        Silver silver = new Silver("user", 5000);
        System.out.println("用户名" + gold.getName() + "   " + "余额" + gold.getMoney() + "   " + "消费金额" + 200 +
                "   " + "余额" + gold.payment(200));
        System.out.println("==============");
        System.out.println("用户名" + silver.getName() + "   " + "余额" + silver.getMoney() + "   " + "消费金额" + 200 +
                "   " + "余额" + silver.payment(200));
    }
}