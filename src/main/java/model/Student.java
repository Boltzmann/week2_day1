package model;

public class Student {
    private int age = 19;
    private int id;
    private String name;

    public static void main(String[] args) {
        Student one = new Student(42, 223344, "One Two");
        System.out.println(one);
    }


    public static String helloTest() {
        return "hello";
    }

    public int getAge() {
    return this.age;
    }

    @Override
    public String toString() {
        return "Student: " +
                "age=" + age +
                ", id=" + id +
                ", name='" + name + '\'';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Student student = (Student) o;

        if (age != student.age) return false;
        if (id != student.id) return false;
        return name.equals(student.name);
    }

    @Override
    public int hashCode() {
        int result = age;
        result = 31 * result + id;
        result = 31 * result + name.hashCode();
        return result;
    }

    public void setAge(int age) {
        this.age = age;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    public Student() {
    }

    public Student (int age, int id, String name){
        this.age = age;
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }
}

