package Object.equals.Test01;

public class AA {
    public static void main(String[] args) {
        A a = new A();
        A b = a;
        A c = b;
        B bObj = a;
        B e = new A();
        System.out.println(a == c);
        System.out.println(bObj == c);
        c.po();

    }
}
class A extends B{
    public void po(){
        System.out.println("111");
    }
}
class B{}
