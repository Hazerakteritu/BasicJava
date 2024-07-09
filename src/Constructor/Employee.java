package Constructor;

public class Employee {
    String name;
    int emp_id;
    Employee(String s, int e){
        this.name = s;
        this.emp_id = e;
    }

    public static void main(String[] args) {
        Employee e1 = new Employee("Ritu",2021831016);
        Employee e2 = new Employee("Bakar",2021831034);

        System.out.println("Employee 1 : " + e1.name + " " + e1.emp_id);
        System.out.println("Employee 2 : " + e2.name + " " + e2.emp_id);
    }
}
