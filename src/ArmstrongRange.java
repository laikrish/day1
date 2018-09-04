
public class ArmstrongRange {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int r,n,temp,sum=0;
	
	for(temp=100;temp<1000;temp++) {
		n=temp;
			while(n>0) {
				r=n%10;
				sum=sum+(r*r*r);
				n=n/10;
			}
			if(sum==temp)
			{
				System.out.println(temp+"");
			}
			sum=0;
	}
}
}


