public class Instructor {
    private int instructorId;
    private String firstName;
    private String lastName;

    public Instructor(){}

    public Instructor(int id,String fn,String ln){
        instructorId=id;
        firstName=fn;
        lastName=ln;
    }

    public int getInstructorId() {
        return instructorId;
    }
     public String getFirstName(){
        return firstName;

     }

    public String getLastName(){
        return lastName;
    }

}
