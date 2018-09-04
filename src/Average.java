
import java.util.Scanner;
public class Average {

	public static void main(String[] args) {
	
		int num[][]=new int[3][3];
		int sum1=0,avg1=0,sum2=0,avg2=0,sum3=0,avg3=0;
		
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter marks");
		for(int i=0;i<3;i++) {
			for(int j=0;j<3;j++)
			{
				num[i][j]=sc.nextInt();
			}
		}
		for(int j=0;j<3;j++)
		{
			sum1=sum1+num[0][j];
			sum2=sum2+num[0][j];
			sum3=sum3+num[0][j];
			avg1=sum1/3;
			avg2=sum2/3;
			avg3=sum3/3;
		}
System.out.println("total of s1 is:" +sum1);
System.out.println("avg of s1 is:" +avg1);
System.out.println("total of s2 is:" +sum2);
System.out.println("avg of s2 is:" +avg2);
System.out.println("total of s3 is:" +sum3);
System.out.println("avg of s3 is:" +avg3);
	}

}
