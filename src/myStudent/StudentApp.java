package myStudent;


import java.net.SocketPermission;
import java.util.*;

public class StudentApp {
    public static void main(String []args)
    {
        Student student=new Student();
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the rollnumber");
        int rollNumber=Integer.parseInt(scanner.nextLine());
        System.out.println("Enter the name");
        String name;
        name = scanner.nextLine();
        System.out.println("Enter the marks");
        float marks=Float.parseFloat(scanner.nextLine());
         student.setRollNumber(rollNumber);
         student.setName(name);
         student.setMarks(marks);
        System.out.println(student.getRollNumber());
        System.out.println(student.getName());
        System.out.println(student.getMarks());

    }
}
