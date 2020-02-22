import java.util .*;

class HomeTask3b
{
    public double constructionCost(String mstandard, double area, boolean automated)
	{
		double ecost=0;
		if(mstandard == "standard" && automated==false)
		{
			ecost = area*1200;
		}
		else
		if(mstandard == "above standard" && automated==false)
		{
			ecost = area*1500;
		}
		else
		if(mstandard == "high standard" && automated==false)
		{
			ecost = area*1800;
		}
		else
		if(mstandard == "high standard" && automated==true)
		{
			ecost = area*2500;
		}
		return ecost;
	}	
}