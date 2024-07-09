package List;
import java.util.ArrayList;
import java.util.List;

public class Student extends Person {
    double studentNmbr;
    public boolean isEligibleToEnroll(){
        return true;
    }
    public void takeXm(){

    }
    public List getSemHis(){
        List sem=null;
        return sem;
    }

    ArrayList<Course> addCrs=new ArrayList();
    void addCourse(Course crs){
        addCrs.add(crs);
    }

}