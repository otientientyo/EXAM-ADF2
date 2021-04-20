import java.util.ArrayList;
import java.util.Scanner;

import Student;

public class Main implements Option {

    Scanner s = new Scanner(System.in);

    // ==========NEW ARRAYLIST
    ArrayList<Student> listStudent = new ArrayList();
    Logicoption logicoption = new Logicoption();

    public static void main(String[] args) {
        Main m = new Main();
        m.start();
    }

    public void start() {
        while (true) {
            System.out.println("1. Add new Student");
            System.out.println("2. Delete");
            System.out.println("3. Display all Student");
            System.out.println("4. Exit");
            try {

                int num = Integer.parseInt(s.nextLine());
                if (num == 0 || num == 1 || num == 2 || num == 3 || num == 4) {

                    switch (num) {

                        case 1:
                            System.out.println("#Chose 1");
                            addStudent(listStudent);
                            break;
                        case 2:
                            System.out.println("#Chose 2");
                            delete(listStudent);
                            break;
                        case 3:
                            System.out.println("#Chose 3");
                            displayallstudent(listStudent);
                            break;
                        case 4:
                            System.out.println("Good Bye! Stop Application");
                            System.exit(0);
                            break;
                        default:
                            break;

                    }
                } else {
                    System.out.println("Ban da chon sai vui long chon lai");
                }
            } catch (Exception e) {
                System.out.println("Vui long chon lai");
            }

        }
    }

    @Override
    public void addStudent(ArrayList list) {
        logicoption.addStudent(list);

    }

    @Override
    public void delete(ArrayList list) {

    }

    @Override
    public void displayallstudent(ArrayList list) {
        System.out.print("Finding by name: ");
        String phone = s.nextLine();
        logicoption.delete(list, phone);

    }

    @Override
    public void display(ArrayList list) {
        logicoption.displayallstudent(list);
    }

}