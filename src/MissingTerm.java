import java.util.Scanner;
public class MissingTerm {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num,n,i,sum;
      Scanner sc = new Scanner(System.in);
		System.out.println("Enter array size");
		n=sc.nextInt();
		int array[]=new int[n];
		System.out.println("Enter the elements");
		for(i=0;i<n;i++)
		{
			array[i]=sc.nextInt();
			
		}
		sum=(n*(n+1))/2;
		for(i=0;i<n;i++)
		{
			sum=sum-array[i];
		}
		System.out.println("missing elemnt is" +sum);
	}
}

	
      