import java.util.Scanner;
public class FrequencyOccurance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String names[]=new String[31],input;
int size,i,count=0;
Scanner sc=new Scanner(System.in);
System.out.println("Enter the name to search");
input=sc.nextLine();
System.out.println("Enter the size of array");
size=sc.nextInt();
System.out.println("Enter the names");
for(i=0;i<=size;i++)
{
	names[i]=sc.nextLine();
	if(names[i]==input)
	{
		count++;
	}
}
System.out.println("occurance of the word is:" +count);
	}

}
