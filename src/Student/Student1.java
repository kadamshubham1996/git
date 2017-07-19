package Student;


public class Student1 {


    private Student1() {
       System.out.println("hello");
    }

    public static Student1 abc() {
        return new Student1();

    }

}
