package override1;

public class Student extends People {
    private String classname;

    public Student(String name, int age, String classname) {
        super(name, age);             //调用父类有参构造器
        setClassname(classname);
    }

    @Override
    public void behavior() {                        //重写方法加个班级的输出
        super.behavior();
        System.out.println(getClassname());
    }

    public String getClassname() {
        return classname;
    }

    public void setClassname(String classname) {
        this.classname = classname;
    }

    public void study() {
        System.out.println(getName() + "正在回答老师的问题");
    }
}