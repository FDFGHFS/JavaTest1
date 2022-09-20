package Object.equals.Test02;
public class test {
    public static void main(String[] args) {

        person aa = new person("aa", 15, 'q');
        person bb = new person("aa",  15, 'q');
        System.out.println(aa.equals(bb));
    }

}

class person {
    public person(String name, int age, char gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
    }

    private final String  name;
    private final int age;
    private final char gender;

    public boolean equals(Object o){
        if(this == o) return  true;
        if(o instanceof person){
            person oo = (person) o;
            return this.name.equals(oo.name) && this.age == oo.age && this.gender == oo.gender;
        }
        return false;
    }
}