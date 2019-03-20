package Task2.java;

import java.util.Scanner;

public class HouseCostTest 
{
	public static void main(String args[])
	{	
		HouseCost hc=new HouseCost();
		double TotalCost=0;
		int TotalArea;
		Scanner s=new Scanner(System.in);
		System.out.println("Enter MaterialStandard and if Automation is needed");
		TotalArea=s.nextInt();
		String MaterialStandard=s.next();
		String Automation=s.next();
		if(MaterialStandard.equals("Standard"))
		{
			TotalCost=hc.Standard(TotalArea);
		}
		if(MaterialStandard.equals("AboveStandard"))
		{
			TotalCost=hc.AboveStandard(TotalArea);
		}
		if(MaterialStandard.equals("HighStandard"))
		{
			if(Automation.equals("Yes"))
			{
				TotalCost=hc.AutomatedHighStandard(TotalArea);
			}
			else
			{
				TotalCost=hc.HighStandard(TotalArea);
			}
		}
		System.out.println(TotalCost);
	}
}