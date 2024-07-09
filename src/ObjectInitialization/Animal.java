package ObjectInitialization;

public class Animal {
    String color;
    int age;

    //Initializatin by using method
    void initObject(String c, int a){
        color = c;
        age = a;
    }
    void display(){
        System.out.println(color + " " + age);
    }

}
