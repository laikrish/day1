
public class ArmstrongFirst {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=153,sum=0,r,temp;
		temp=n;

		while(n>0)
		{
			r=n%10;
			sum=sum+r*r*r;
			n=n/10;
			
		}
		if(sum==temp)
		{
			
			System.out.println("Armstrong number");

		}
		else
		{
			System.out.println("Not Armstrong number");	
		}
		}
		
	}

