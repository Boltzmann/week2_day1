package model;

public class Student {
    private int age = 19;

    public static void main(String[] args) {
        System.out.println(helloTest());
    }


    public static String helloTest() {
        return "hello";
    }

    public int getAge() {
    return this.age;
    }
    public void setAge(int age) {
        this.age = age;
    }


    public String toString() {
        return Integer.toString(this.age);
    }

    @Override
    public boolean equals(Object submittedObject) {
        if (this == submittedObject) {
            return true;
        }
        if (submittedObject == null || getClass() != submittedObject.getClass()) {
            return false;
        }

        Student student = (Student) submittedObject;

        return age == student.age;
    }

    @Override
    public int hashCode() {
        return age;
    }




    public Student (){

    }
}

