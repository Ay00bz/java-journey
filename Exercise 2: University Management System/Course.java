public class Course {
    private int courseID;
    private String courseName;
    private Instructor instructor;

    public Course(){}
    public Course(int id, String name,Instructor inst){
        courseID=id;
        courseName=name;
        instructor=inst;

    }


    public int getCourseID(){
        return courseID;
    }
    public String getCourseName(){
        return courseName;
    }

    public Instructor getInstructor(){
        return instructor;
    }
}
