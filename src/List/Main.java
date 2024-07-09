package List;

import Abstraction.Teacher;
import Lab.Student;

public class Main {
    public static void main(String[] args) {
        Student s1 = new Student(101,"Alex");
        Student s2 = new Student(102 , "sfds");
        Course srs = new Course(125,"Java");
        System.out.println("Course ID: " + srs.courseId + " Course Name: "+ srs.title);

    }
}
