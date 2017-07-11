class Add
{
int addNumber(int number1,int number2)
{
  return (number1+number2);
}
public static void main(String args[])
{
Add add=new Add();
int addition=add.addNumber(10,20);
System.out.println("Addition is"+addition);
}
}