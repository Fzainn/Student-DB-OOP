package StudentDB;

import java.util.Scanner;

public class Student
{

    private String firstName;
    private String lastName;
    private int gradeYear;
    private String studentID;
    private String courses = "";
    private int tuitionBalance =0;
    private static int costOfCourse = 600;
    private static int ID = 2000; // static here for this class, fixed int



    public Student () // constructor for student info
    {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter your first Name : ");
        this.firstName = in.nextLine();

        System.out.println("Enter Your last Name :");
        this.lastName = in.nextLine();

        System.out.print("Enetr Your level : \n 1- fresh \n 2- sohpomore \n 3- Junior \n 4- Senior ");
        this.gradeYear = in.nextInt();

        SetStudentID();
        //System.out.println(firstName + " " + lastName + " " + gradeYear + " " + studentID); for testing
    }

    private void SetStudentID() // method for set ID
    {
        ID++; // this to increment id by one for each student
        this.studentID = gradeYear +""+ ID; // this for storing ID according to each student as we need to involve garde year in ID
    }


    public void enroll() // method for enroll in courses
    {
        do {
            System.out.print("Enter your Course to enroll and Q to quit : ");
            Scanner in = new Scanner(System.in); // scanner for receiving the input
            String course = in.nextLine(); // string var to store the input
            if (!course.equals("Q")) { // if the user does not hit/enter Q and enter the name of the course so his course will add to courses variable
                courses = courses + "\n " + course;
                tuitionBalance = tuitionBalance + costOfCourse;
            } else { // if he enters Q, then break!
                break;
            }
        }while (1 != 0) ; // while 1 is not = to 0 which is impossible, print out his enrolled courses and tuition balance
//        System.out.println("You Are Enrolled In : " + this.courses);
//        System.out.println("Tuition Balance is $" + this.tuitionBalance); for testing

    }

    public void viewBalance()
    {
        System.out.println("Your Balance is $ " +  tuitionBalance);
    }

    public void Paytuition()
    {

        System.out.println("Enter the amount of payment :");
        Scanner in = new Scanner(System.in);
        int pay = in.nextInt();
        tuitionBalance = tuitionBalance - pay;
        System.out.println("Payment done successfully!, you paid $ " + pay);
        viewBalance();

    }

    // view info method
    public String toString()
    {
        return "Name : " + firstName + " " + lastName +
                "\nGrade Level : " + gradeYear+
                "\n Courses Enrolled : " + courses +
                "\nBalance : " + tuitionBalance +
                "\nStudent ID :" + studentID;
    }










}
