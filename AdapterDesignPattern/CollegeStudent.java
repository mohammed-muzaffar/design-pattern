public class CollegeStudent {
    private  String firstName;
    private String lastName;
    private String emailAddress;

    public  CollegeStudent(String fn, String ln, String ea) {
        this.firstName = fn;
        this.lastName = ln;
        this.emailAddress = ea;
    }

    public String  getFirstName() { return firstName; }
    public String getEmailAddress() { return emailAddress;}
    public String getLastName() { return lastName; }
}
