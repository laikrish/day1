
public class Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int n=12,r,sum=0,temp;
		temp=n;
		while(n>0) {
			r=n%10;
			sum=(sum*10)+r;
			n=n/10;
		}
		if(sum==temp)
		{
			System.out.println("True");
		}
		else
		{
			System.out.println("False");
		}
	}

}
