//class to calculate simple and compound interest
public class Interest {
	// method to calculate simpleInterest
	static double simple(int principle , int time , int rate)
	{
		//time in years , rate and principle amount in rupees
		return (principle*time*rate)/100;
	}
	
	// method to calculate compound interest
	
	static double compound(int principle , int time , int rate)
	{
        double I= (1+(rate/100));
		return  principle*(double)Math.pow(I,time);
	}
	
	public static void main(String[] args) {
		System.out.println(simple(10000,4,10));
		System.out.println(compound(10000,4,10));
		
	}

}