package duotaican;

public class Manange extends perpon{
    private double bonus;

    public Manange(String name, double sales, double bonus) {
        super(name, sales);
        setBonus(bonus);
    }
    public double getBonus() {
        return bonus;
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }
    public void manange(){
        System.out.println(getName() + "                2");
    }

    @Override
    public double gerAnnual() {
        return 12 * getSales() + getBonus();
    }
}
