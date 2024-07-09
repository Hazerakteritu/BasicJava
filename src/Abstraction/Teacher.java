package Abstraction;

public class Teacher extends Person{
    int salary;

    Teacher(String name,int age, int salary){
        super(name, age);
        this.salary = salary;
    }
    void display(){
        System.out.println("Teacher name: "+name);
        System.out.println("age: "+age);
        System.out.println("Salary: "+salary);
    }
}
