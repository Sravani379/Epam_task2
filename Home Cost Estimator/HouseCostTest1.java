package Task2.java;
public class HouseCostTest1 
{
	public static void main(String args[])
	{	
		HouseCost hc=new HouseCost();
		int TotalArea=1200;
		double Standard=hc.Standard(TotalArea);
		double AboveStandard=hc.AboveStandard(TotalArea);
		double HighStandard=hc.HighStandard(TotalArea);
		double AutomatedHighStandard=hc.AutomatedHighStandard(TotalArea);
		System.out.println("House Cost if we use\nStandard Materials="+Standard+"\nAbove Standard Materials="+AboveStandard+
				"\nHigh Standard Materials="+HighStandard+"\nHigh Standard Materials for a fully automated house="
				+AutomatedHighStandard);
	}
}