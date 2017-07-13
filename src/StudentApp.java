     import java.io.BufferedReader;
     import java.io.IOException;
     import java.io.InputStreamReader;

    public class StudentApp {
        static Student acceptdata(BufferedReader bufferedreader) throws IOException
        {
            Student student=new Student();
            System.out.println("Enter the RollNumber");
            student.RollNumber=Integer.parseInt(bufferedreader.readLine());
            System.out.println("Enter the Marks");
            student.Marks=Float.parseFloat(bufferedreader.readLine());
            System.out.println("Enter the Name");
            student.Name=bufferedreader.readLine();
            return student;
        }
        static void print(Student student)
        {
            System.out.println("RollNumber"+student.RollNumber);
            System.out.println("Marks"+student.Marks);
            System.out.println("Name"+student.Name);
        }
        public static void main(String args[]) throws IOException
        {
        InputStreamReader inputstreamreader=new InputStreamReader(System.in);
        BufferedReader bufferedreader=new BufferedReader(inputstreamreader);
        StudentApp studentapp=new StudentApp();
        Student student1=acceptdata(bufferedreader);
        Student student2=acceptdata(bufferedreader);
        Student student3=acceptdata(bufferedreader);
        print(student1);
        print(student2);
        print(student3);

    }

}
