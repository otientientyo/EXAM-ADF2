public class Student {

    private String EnrollID;
    private String FirstName;
    private String LastName;
    private int  Age;

    public String getEnrollID() {
        return EnrollID;
    }

    public void setEnrollID(String enrolliD) {
        this.EnrollID = enrolliD;
    }

    public String getFirstName() {
        return FirstName;
    }

    public void setFirstName(String firstname) {
        FirstName = firstname;
    }

    public String getLastName() {
        return LastName;
    }

    public void setEmail(String lastname) {
        LastName = lastname;
    }

    public int getAge() {
        return Age;
    }

    public void setPhone(int age) {
        Age = age;
    }

    public Contact(String enrollid, String firstname, String lastname, String age) {
        super();
        this.EnrollID = enrollid;
        FirstName = firstname;
        LastName = lastname;
        Age = age;
    }

    public Student(String enrollID, String firstName, String lastName, String age) {
        super();
    }

}