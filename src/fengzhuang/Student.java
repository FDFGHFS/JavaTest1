package fengzhuang;

public class Student {
    //属性：年龄，姓名
    private int age;
    private String name;

    public Student() {
    }

    public Student(int age, String name) {
        this.age = age;
        this.name = name;
    }
    public void setAge(int age) {
        if(age >= 0){
            this.age = age;
        }else{
            System.out.println("cuole");
        }

    }

    public int getAge() {
        return age;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void show(){
        System.out.println("姓名是：" + name + "，年龄是：" + age);
    }
}




