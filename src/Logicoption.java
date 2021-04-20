import java.util.ArrayList;
import java.util.Scanner;


public class Logicoption {

    Scanner s = new Scanner(System.in);

    public ArrayList addStudent(ArrayList<Student> list) {

        String answer = "";
        do {
            System.out.print("Enter your EnrollID: ");
            String EnrollID = s.nextLine();
            System.out.print("Enter your FirstName: ");
            String FirstName = s.nextLine();
            System.out.print("Enter your LastName: ");
            String LastName = s.nextLine();
            System.out.print("Enter your Age: ");
            String Age = s.nextLine();
            list.add(new Student(EnrollID, FirstName, LastName, Age));
        } while (answer.equalsIgnoreCase("No"));
        return list;
    }

    public void delete(ArrayList<Student> list, String EnrollID) {
// === delete e ko biet lam :((
        }
        System.out.println();

    public void displayallstudent(ArrayList<Student> list) {
        System.out.println("EnrollID || FirstName || LastName  ||  Age");
        for (Student c : list) {
            System.out.println(c.getEnrollID() + "  " + c.getFirstName() + "  " + c.getLastName() + "  " + c.getAge());
        }
        System.out.println();
    }

}