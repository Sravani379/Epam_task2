package Task2.java;
public class Interest 
{
	double SimpleInterest(int P,int T,int R)
	{
		return (P*T*R/100);
	}
	double CompoundInterest(int P,int T,int R)
	{
		return P-(P*(Math.pow((1+R)/100,T)));
	}
}