package Abstract;

public class Main {
    public static void main(String[] args) {

        //Abstract.Vehicle is abstract; cannot be instantiated
        //Vehicle v1 = new Vehicle() ;
         Car c = new Car();
         c.start();
         Scooter s = new Scooter();
         s.start();
    }
}
