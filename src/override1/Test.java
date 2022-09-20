package override1;

public class Test {
    public static void main(String[] args) {
        Teacher teacher = new Teacher("Bug", 30, "信息部");
        teacher.behavior();
        teacher.teach();
        System.out.println("=====================");
        Student s = new Student("西门", 15, "java班");
        s.behavior();
        s.study();
    }
}