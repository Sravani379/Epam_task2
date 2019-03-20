package Task2.java;
public class HouseCost 
{
	double Standard(int Area)
	{
		return Area*1200;
	}
	double AboveStandard(int Area)
	{
		return Area*1500;
	}
	double HighStandard(int Area)
	{
		return Area*1800;
	}
	double AutomatedHighStandard(int Area)
	{
		return Area*2500;
	}
}