import java.util.ArrayList;
import java.util.List;

public class Student{
    private int studnetId;
    private String firstName;
    private String lastName;
    List <Course> courses ;

    public Student(){
        courses=new ArrayList<>();
    }
    public Student(int id, String fn, String ln ){
        studnetId=id;
        firstName=fn;
        lastName=ln;
        courses=new ArrayList<>();

    }
    public int getStudentId(){
        return studnetId ;

    }
    public String getFirstName(){
        return firstName;
    }
    public String getLastName(){
        return lastName;
    }

    public void getCourses(){
        for(Course x :courses){
            System.out.println(x);
        }
    }

    public void enroll(Course c){
        courses.add(c);
    }

}
