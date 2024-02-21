import java.util.ArrayList;

public class StudentDetails {

    CollegeStudent collegeStudent = new CollegeStudent("sai", "kumar", "sai@gmail.com");

    AdapterCollageStudent adapter = new AdapterCollageStudent(collegeStudent);

    SchoolStudent schoolStudent = new SchoolStudent("Virat", "kholi", "kholi@gmail.com");

    public void getStudentDetails() {
        ArrayList<Student> list = new ArrayList<>();
        list.add(adapter);
        list.add(schoolStudent);
        System.out.println(list);
    }
}