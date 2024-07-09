package Abstraction;

public class Student extends Person{
    int mark;

    Student(String name, int age, int mark)
    {
        super(name,age);
        this.mark = mark;
    }
    void display(){
        System.out.println("Student name: "+name);
        System.out.println("age: "+age);
        System.out.println("mark: "+mark);
    }
}
