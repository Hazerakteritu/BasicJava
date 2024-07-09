package Thread;

public class Main {
    public static void main(String[] args) {
        Demo ob1 = new Demo("Ritu");
        Demo ob2 = new Demo("Bakar");
        ob1.start();
        ob2.start();
        System.out.println("Main Function/Thread Ended");
    }
}
