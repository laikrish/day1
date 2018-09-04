import java.util.Scanner;
public class MultiDimension {
	public static void main(String[] args) {
		int arr[][][]=new int[4][3][2];
		int  num=1;
		Scanner sc =new Scanner(System.in);
		for(int i=0;i<4;i++)
		{
			for(int j=0;j<3;j++)
			{
				for(int k=0;k<2;k++)
				{
					arr[i][j][k]=num;
					num++;
					System.out.println("" +arr[i][j][k]);
				}	
			}
		}
		
		num=sc.nextInt();
		for(int i=0;i<4;i++)
		{
			for(int j=0;j<3;j++ )
			{
				for(int k=0;k<2;k++)
				{
					
					if(arr[i][j][k]==num)
					{
						System.out.println("tne number present is" +num);
					}
					
				}
			}
		}
	}
}
