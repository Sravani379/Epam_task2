package Task2.java;
public class InterestTest1 
{
	public static void main(String args[])
	{	
		Interest i=new Interest();
		int Principal=1000,TimePeriod=2,RateOfInterest=15;
		double SimpleInterest=i.SimpleInterest(Principal,TimePeriod,RateOfInterest);
		double CompoundInterest=i.CompoundInterest(Principal,TimePeriod,RateOfInterest);
		System.out.println("SimpleInterest="+SimpleInterest+"\nCompoundInterest="+CompoundInterest);
	}
}