package JavaBean;

public class WaterDispenserTest {
    public static void main(String[] args) {
        WaterDispenser waterDispenser = new WaterDispenser("美的","红色" ,5 ,"手动净水"); //传入数据
        waterDispenser.show(); //调用输出
        if (waterDispenser.getCapacity() > 3) {     //获取信息判断
                System.out.println("容量大于3L");
        }
    }
}
