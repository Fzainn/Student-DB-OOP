package StudentDB;

import java.util.Scanner;

public class main
{
    public static void main(String[] args)
    {
        // ask the user how many student you want to add
        System.out.println("Enter Number of student to Enroll : "  );
        Scanner in = new Scanner(System.in);
        int NumOfStudent = in.nextInt();
        Student[] students = new Student[NumOfStudent]; // make array for storing students

        // for loop
        for (int n = 0; n<NumOfStudent; n++){
            students[n] = new Student();
            students[n].enroll();
            students[n].Paytuition();
        }
        for (int n = 0; n<NumOfStudent; n++){
            System.out.println(students.toString()); // for showing the info
        }





//        Student st1 = new Student();
//        st1.enroll();
//        st1.Paytuition();
//        System.out.println(st1.toString());

    }





}
