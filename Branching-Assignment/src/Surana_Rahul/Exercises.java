/**
 * @author Rahul Surana
 */
package Surana_Rahul;

public class Exercises 
{
	static int threeAndFive()
	{
		int sum=0;
		for (int i=0; i<1000;i++)
		{
			if (i%3 == 0)
			{
				sum+=i;
			}
			else if (i%5 == 0)
			{
				sum+=i;
			}
		}
		return sum;
	}
	static int evenFibSum()
	{
		int limit=4000000;
		 if (limit < 2) 
	            return 0; 
	      
	        long ef1 = 0, ef2 = 2; 
	        long sum = ef1 + ef2; 
	      
	       
	        while (ef2 <= limit) 
	        { 
	            
	            long ef3 = 4 * ef2 + ef1; 
	      
	            if (ef3 > limit) 
	                break; 
	      
	            ef1 = ef2; 
	            ef2 = ef3; 
	            sum += ef2; 
	        } 
	      
	        return(int) sum;
	}
	static int largestPrimeFactor()
	{
		int i;
		long number=600851475143L;
		for(i=2;i<=number;i++)
		{
			if(number%1==0)
			{
				number /= i;
				i--;
			}
		}
		return i;
	}
	
	
	
	
	
	
	
	
	
}