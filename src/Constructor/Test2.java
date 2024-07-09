package Constructor;
//no-arg constructor
public class Test2 {
    int i;
    String s;
    Test2()
    {
        i = 5;
        System.out.println("No-arg Constructor is called");
    }

    public static void main(String[] args) {
        // calling the constructor without any parameter
        Test2 t = new Test2();
        //System.out.println("Value of i: "+ t.i);
    }
}
