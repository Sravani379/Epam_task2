package Task2.java;
public class CalculatorTest1 
{
	public static void main(String args[])
	{	
		Calculator c=new Calculator();
		int operand1=12,operand2=6,sum=0,product=0,quotient=0;
		sum=c.addition(operand1,operand2);
		product=c.multiplication(operand1,operand2);
        quotient=c.division(operand1,operand2);
        System.out.println("Sum="+sum+"\nProduct="+product+"\nQuotient="+quotient);
	}
}