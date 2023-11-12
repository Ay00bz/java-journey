public class Main {
    public static void main(String[] args) {

        Instructor instructor1 = new Instructor(1, "Leonhard", "Euler");
        Instructor instructor2 = new Instructor(2, "Albert", "Einstein");

        Course mathCourse = new Course(101, "Mathematics", instructor1);
        Course physicsCourse = new Course(201, "Physics", instructor2);


        Student student = new Student(123, "Etudiant", "Ben falten");

        student.enroll(mathCourse);
        student.enroll(physicsCourse);


        System.out.println("Student Information:");
        System.out.println("Student ID: " + student.getStudentId());
        System.out.println("Student Name: " + student.getFirstName() + " " + student.getLastName());
        System.out.println("Enrolled Courses:");


        student.getCourses();


        System.out.println("\nCourse Information:");
        System.out.println("Math Course ID: " + mathCourse.getCourseID());
        System.out.println("Math Course Name: " + mathCourse.getCourseName());
        System.out.println("Math Instructor: " + mathCourse.getInstructor().getFirstName() + " " +
                mathCourse.getInstructor().getLastName());

        System.out.println("\nPhysics Course ID: " + physicsCourse.getCourseID());
        System.out.println("Physics Course Name: " + physicsCourse.getCourseName());
        System.out.println("Physics Instructor: " + physicsCourse.getInstructor().getFirstName() + " " +
                physicsCourse.getInstructor().getLastName());


    }}
