import java.util.Scanner;
public class Marks {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int a,b,c;
Scanner sc=new Scanner(System.in);
System.out.println("Enter A marks");
a=sc.nextInt();
System.out.println("Enter B marks");
b=sc.nextInt();
System.out.println("Enter C marks");
c=sc.nextInt();
if(a>60 && b>60 && c>60)
{
	System.out.println("PASSED");
}
else if((a>60 && b>60) || (b>60 && c>60) || (a>60 && c>60))
		{
	System.out.println("PROMOTED");
		}
else if((a>60 || b>60 ||c>60) || (a<60 && b<60 && c<60))
{
	System.out.println("FAILED");
}



	}

}
