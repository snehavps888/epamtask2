public class CostEstimation {
       //method to calculate cost and returns cost
	    // T : type of material required 
	    // area: in square feet
	    // val is true if automated house
		static double costcalculation(String T,double area , boolean val) 
		
		{
			double cost=0;
			if(T.contentEquals("standard"))
			{
				cost=1200*area;
			}
			else if(T.contentEquals("above standard"))
			{
				cost=1500*area;
			}
			else if(T.contentEquals("high standard") && val == true)
			{
				cost=2500*area;
			}
			else if(T.contentEquals("high standard"))
			{

				cost=1800*area;
			}
				return cost;
		}
		
		
     public static void main(String[] args)
     {
    	System.out.println(costcalculation("standard", 200 , false));
    	System.out.println(costcalculation("above standard", 200 , false));
    	System.out.println(costcalculation("high standard", 200 , false));
    	System.out.println(costcalculation("high standard", 200 , true));
    	
     }
		