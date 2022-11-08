package lab.Repository;

import lab.Entity.Course;
import lab.Entity.Student;
import org.springframework.stereotype.Repository;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;


@Repository
public class StudentRepo {

     private static  List<Student> students= new ArrayList<>();
     private  static List<Course> courses= new ArrayList<>();
     private static  List<Course> courseAnother= new ArrayList<>();
     private static  List<Course> courseAbout= new ArrayList<>();

    static {
        //The first courses
        var a= new Course(1,"FPP", 200);
        var b= new Course(2, "MPP", 300);
        var c= new Course(3, "WAP", 300);

        courses.add(a);
        courses.add(b);
        courses.add(c);

        //The second courses
        var d = new Course(4, "EA", 500);
        var e= new Course(5, "WAA", 500);
        var f= new Course(6, "DBMS", 600);

        courseAnother.add(d);
        courseAnother.add(e);
        courseAnother.add(f);

        //The third courses
        var g = new Course(7, "SE", 500);
        var h= new Course(8, "SA", 500);
        var i= new Course(9, "DBMS", 600);

        courseAbout.add(g);
        courseAbout.add(h);
        courseAbout.add(i);

        //Student parts

        var std1= new Student(1, "Tsigab", "Solomon", "ts@gamail.com", "Compro",3.8, courses);
        var std2= new Student(2, "Hermon","Abraham", "her@gmail.com", "MSD", 4.0, courseAnother);
        var std3= new Student(3, "Jasmine", "Belay","J@gmail", "Compro",3.8, courseAbout);


        students.add(std1);
        students.add(std2);
        students.add(std3);
    }


    public List<Student> getStudentByMajor(String major){
       return students.stream().filter(s->s.getMajor()==major).collect(Collectors.toList());
    }


    public List<Course> getCoursesByStudentId(int studentId){
        System.out.print(studentId);
        Student std= students.stream().filter(s->s.getId()==studentId).findAny().get();
        return std.getCourseTaken();
    }
}
