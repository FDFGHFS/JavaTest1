package Object.ToString;

public class aa {
    public static void main(String[] args) {
        a a = new a();
        System.out.println(a.hashCode() + "\n" + a.toString());
        System.out.println(a);
    }
}
class a {
    private String name = "aaa";

    @Override
    public String toString() {
        return "a{" +
                "name='" + name + '\'' +
                '}';
    }
}