import java.util .*;

class HomeTask3a
{
    public double simpleInterest(double pr, double rate, double t)
	{
		double sim;
				
		sim=(pr * t * rate)/100;
		
		return(sim);
	}
	public double compoundInterest(double pr, double rate, double t)
	{
		double com;
				
		com=pr * Math.pow(1.0+rate/100.0,t) - pr;
		
		return(com);
	}
}