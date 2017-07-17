package myStudent;

public class Student {
    private int rollNumber;
    private String name;
    private float marks;

    public void setRollNumber(int RollNumber)
    {
        this.rollNumber =RollNumber;
    }
    public void  setName(String Name)
    {
        this.name =Name;
    }
    public void setMarks(float Marks)
    {
        this.marks =Marks;
    }
    public int getRollNumber()
    {
        return this.rollNumber;
    }
    public String getName()
    {
        return this.name;
    }
    public float getMarks()
    {
        return this.marks;
    }


}
