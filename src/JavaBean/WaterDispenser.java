package JavaBean;

public class WaterDispenser {
    private String brand;                           //定义变量
    private String color;
    private int capacity;
    private String model;

    public WaterDispenser() {
    }

    public WaterDispenser(String brand, String color, int capacity, String model) {  //构造方法
        setBrand(brand);
        setColor(color);
        setCapacity(capacity);
        setModel(model);
    }
//封装
    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }
    //用show方法输出
    public  void show(){
        System.out.println("品牌为：" + getBrand() + "\n" + "颜色为：" + getColor() + "\n" + "容量为：" + getCapacity()+ "\n" + "模式为：" + getModel());
    }
}
