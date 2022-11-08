package lab.Service;

import lab.Entity.Course;
import lab.Entity.Student;
import lab.Repository.StudentRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service

public class StudentService implements StudentInter{

    @Autowired
    private StudentRepo studentRepo;

    @Override
    public List<Student> getStudentsByMajor(String major) {
        return studentRepo.getStudentByMajor(major);
    }

    @Override
    public List<Course> courseByStudentId(int StudentId) {
        return studentRepo.getCoursesByStudentId(StudentId);
    }
}
