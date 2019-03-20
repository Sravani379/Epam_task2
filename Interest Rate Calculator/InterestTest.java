package Task2.java;
import java.util.Scanner;
public class InterestTest 
{
	public static void main(String args[])
	{	
		Interest i=new Interest();
		double TotalInterest=0;
		int Principal,TimePeriod,RateOfInterest;
		Scanner s=new Scanner(System.in);
		System.out.println("Enter Principal,TimePeriod,RateOfInterest and TypeOfInterest -Simple or Compound");
		Principal=s.nextInt();
		TimePeriod=s.nextInt();
		RateOfInterest=s.nextInt();
		char TypeOfInterest=s.next().charAt(0);
		switch(TypeOfInterest)
		{
		case 's':TotalInterest=i.SimpleInterest(Principal,TimePeriod,RateOfInterest);
		         break;
		case 'c':TotalInterest=i.CompoundInterest(Principal,TimePeriod,RateOfInterest);
                 break;
		}
		System.out.println(TypeOfInterest+TotalInterest);
	}
}