package override1;

public class People {
    private String name;
    private int age;

    public People(String name, int age) {
        setName(name);
        setAge(age);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void behavior() {
        System.out.println(getName() + "\n" + getAge());
    }
}
