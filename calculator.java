class Calculator
{
 static float FloatNumber2=50;
public static void main(String args[])
{
 Calculator calculator=new Calculator();
 float Multiplication=calculator.multiplication(52.4f);
 System.out.println("Multiplication is"+Multiplication);
}
 public float multiplication(float FloatNumber1)
 {
 return FloatNumber1*FloatNumber2;
 }
}
