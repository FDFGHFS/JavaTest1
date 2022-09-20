package duotaican;

public class perpon {
    private String name;
    private double sales;

    public perpon(String name, double sales) {
        this.name = name;
        this.sales = sales;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSales() {
        return sales;
    }

    public void setSales(double sales) {
        this.sales = sales;
    }
    public double gerAnnual(){
        return 12* sales;
    }
}
