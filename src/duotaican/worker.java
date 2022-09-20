package duotaican;

public class worker extends perpon{
    public worker(String name, double sales) {
        super(name, sales);
    }

    public void work(){
        System.out.println(getName() + "                 1");
    }
    @Override
    public double getSales() {
        return super.getSales();
    }
}
