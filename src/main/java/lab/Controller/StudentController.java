package lab.Controller;

import lab.Entity.Course;
import lab.Entity.Student;
import lab.Service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.context.LifecycleAutoConfiguration;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/studentslabs")
public class StudentController {

    @Autowired
    private StudentService studentService;

    @GetMapping("/filter/{major}")

    public List<Student> getStudentByMajor(@PathVariable String major){
         return studentService.getStudentsByMajor(major);
    }

    @GetMapping("/{id}")
    public List<Course> getCourseByStudentId(@PathVariable int id){
        System.out.println(id);
        return studentService.courseByStudentId(id);
    }

}
