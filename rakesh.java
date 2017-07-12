class Calculator
{
	
	int addNumber(int number1,int number2)
	{
		return(number1+number2);
	}

	float subNumber(float number1,float number2)
	{	
		return(number1- number2);
	}
	
	double multNumber(double number1,double number2)
	{
		return(number1*number2);
	}

	public static void main(String []args)
	{
		
		Calculator calculator=new Calculator();

		int result1=calculator.addNumber(5,8);
		
			System.out.println("\n Addition of :"+result1);

		float result2=calculator.subNumber(5,6);

			System.out.println("\n Subtraction of: "+result2);

		double result3=calculator.multNumber(5,5);
			
			System.out.println("\n Multiplication of: "+result3);


	}
}