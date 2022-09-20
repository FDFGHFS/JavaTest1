package duotaican;

public class Test {
    public static void main(String[] args) {

        worker aLong = new worker("long", 3000);
        Manange smils = new Manange("smils", 5000, 10000);
        Test test = new Test();
        test.showEmpAnnal(aLong);
        test.showEmpAnnal(smils);
        test.testWork(aLong);
        test.testWork(smils);
    }
    public void showEmpAnnal(perpon e){
        System.out.println(e.gerAnnual());
    }
    public void testWork(perpon e){
        if (e instanceof worker) {
            ((Manange) e).manange();
        }else if (e instanceof Manange) {
            ((worker) e).work();
        }else {
            System.out.println("g");
        }
    }
}
