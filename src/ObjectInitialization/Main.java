package ObjectInitialization;

public class Main {
    public static void main(String[] args) {

        // initialization by using reference
//        Animal cat = new Animal();
//        cat.color = "Black";
//        cat.age = 10;
//        System.out.println(cat.color + " " + cat.age);

        Animal dog = new Animal();
        dog.initObject("White",5);
        //dog.display();
        System.out.println(dog.color + " " + dog.age);
    }

}
