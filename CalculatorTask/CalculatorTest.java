package Task2.java;
import java.util.Scanner;
public class CalculatorTest 
{
	public static void main(String args[])
	{	
		Calculator c=new Calculator();
		int operand1,operand2,result=0;
		Scanner s=new Scanner(System.in);
		System.out.println("Enter operand1,operand2 values and operation +,* or /");
		operand1=s.nextInt();
		operand2=s.nextInt();
		char operation=s.next().charAt(0);
		switch(operation)
		{
		case '+':result=c.addition(operand1,operand2);
		         break;
		case '*':result=c.multiplication(operand1,operand2);
                 break;
		case '/':result=c.division(operand1,operand2);
                 break;
		}
		System.out.println(result);
	}
}