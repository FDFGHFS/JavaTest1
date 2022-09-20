package override1;

public class Teacher extends People {
    private String department;

    public Teacher(String name, int age, String department) {
        super(name, age);                   //调用父类有参构造器
        setDepartment(department);
    }

    @Override
    public void behavior() {                                    //重写方法加个部门的输出
        super.behavior();
        System.out.println(getDepartment());
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public void teach() {
        System.out.println("老师在问" + "问题");
    }

}