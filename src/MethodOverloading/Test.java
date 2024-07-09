package MethodOverloading;

public class Test {
    void show(String s, int a)
    {
        System.out.println(1);
    }
    void show(int a, String s)
    {
        System.out.println(2);
    }

    public static void main(String[] args) {
        Test t = new Test();
        t.show(23,"Ritu");
        t.show("mitu",24);
    }
}
