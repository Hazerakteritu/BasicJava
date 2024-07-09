package Inheritance;

public class Main {
    public static void main(String[] args) {
        Dog tiger = new Dog();
        //tiger.eat();
        tiger.name = "Tiger";
        tiger.age = 10;

        System.out.print( tiger.name + " saying: My age is " + tiger.age + "\nAnd Now ");
        tiger.eat();
    }
}
