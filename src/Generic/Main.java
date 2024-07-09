package Generic;

public class Main {
    public static void main(String[] args) {
        LibraryInventory<Book>bookInventory = new LibraryInventory<>();
        LibraryInventory<Magazine>magazineInventory = new LibraryInventory<>();

        Book b1 = new Book("Noukadubi","A123");
        Book b2 = new Book("Opekkha","B123");

        Magazine m1 = new Magazine("12.834","aee");
        Magazine m2 = new Magazine("12.948","addfs");

        bookInventory.addInStore(b1);
        bookInventory.addInStore(b2);

        magazineInventory.addInStore(m1);
        magazineInventory.addInStore(m2);

        Tubelight t1 = new Tubelight(1,20);
        //LibraryInventory<Tubelight>tubelightLibraryInventory = new LibraryInventory<>();

    }
}
