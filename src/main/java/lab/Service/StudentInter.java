package lab.Service;

import lab.Entity.Course;
import lab.Entity.Student;
import org.apache.catalina.LifecycleState;

import java.util.List;

public interface StudentInter {

    public List<Student> getStudentsByMajor(String major);
    public List<Course> courseByStudentId(int StudentId);


}
