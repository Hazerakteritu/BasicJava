package Lab;

public class Student extends Person {
    double studentNumber;

    public Student(double studentNumber, String name){
        this.studentNumber = studentNumber;
        super.name = name;
    }

    public boolean hasParkingPass(){
        return false;
    }

    public boolean isEligible(Student student) {
        return true;
    }
    public void takeExamination()
    {

    }
}
