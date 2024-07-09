package Thread;

public class Demo extends Thread{
    private String name;
    public Demo(String name){
        this.name = name;
    }


    void test()
    {
        for(int i=0; i<5; i++)
            System.out.println(name + ": " + i);
    }

    @Override
    public void run() {
        test();
    }
}
