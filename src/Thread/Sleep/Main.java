package Thread.Sleep;

public class Main {
    //4 thread (Main, thread1,thread2,thread3)
    public static void main(String[] args) {
        MyThread thread1 = new MyThread("Ritu");
        MyThread thread2 = new MyThread("Mitu");
        MyThread thread3 = new MyThread("Sneha");

        thread1.start();
        try{
            thread1.join(); //Wait for thread1 to finish
        }catch (InterruptedException e){
            e.printStackTrace();
        }

        thread2.start();
        try{
            thread2.join(); //Wait for thread2 to finish
        }catch(InterruptedException e){
            e.printStackTrace();
        }

        thread3.start();
        try{
            thread3.join(); //Wait for thread3 to finish
        }catch(InterruptedException e){
            e.printStackTrace();
        }

        System.out.println("Main method/ Thread Ended");
    }
}
