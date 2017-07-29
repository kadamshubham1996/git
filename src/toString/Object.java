package toString;

/**
 * Created by rckstr on 7/29/2017.
 */
public class Object {
    String name;
    int rollNumber;
    float marks;
    Object(String name,int rollNumber,float marks)
    {
        this.name=name;
        this.rollNumber=rollNumber;
        this.marks=marks;
    }
    public String toString()
    {
        String display="name"+name+"RollNumber"+rollNumber+"marks"+marks;
        return display;
    }
}
