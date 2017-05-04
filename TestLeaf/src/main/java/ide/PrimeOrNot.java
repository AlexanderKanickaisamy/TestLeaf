package ide;

public class PrimeOrNot {

	public static void main(String args[])
	   {		
		int temp;
		int count=0;
		int num=6; //Provide the number to be checked
		for(int i=2;i<=num/2;i++)
		{
	           temp=num%i;
		   if(temp==0)
		   {
		      count++;
		      break;
		   }
		}
		//If count is 0 then the number is prime else not
		if(count==0)
		   System.out.println(num + " is Prime Number");
		else
		   System.out.println(num + " is not Prime Number");
	   }
	}