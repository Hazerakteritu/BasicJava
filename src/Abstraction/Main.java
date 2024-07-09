package Abstraction;

public class Main {
    public static void main(String[] args) {
        Person p;
        p=new Student("Hazera",20,80);
        p.display();
        Person q;
        q = new Teacher("Shikha",50,500000);
        q.display();
    }
}
