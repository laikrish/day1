import java.util.Scanner;

public class PalindromeRange {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int count=0,k=0;
String b=" ";
String temp="";

Scanner sc = new Scanner(System.in);
String words[] = new String[10];
System.out.println("enter 10 words");
for(int i=0;i<10;i++)
{
	words[i]=sc.nextLine();
}
String palindrome[] = new String[10];
for(int i=0;i<10;i++) {
	int n=words[i].length();
	for(int j=n-1;j>=0;j--) {
		b=b+words[i].charAt(j);
	}
	if(words[i].equals(b))
	{
		count++;
		palindrome[k]=words[i];
		k++;
	}
	b="";
}
System.out.println("Total palindrome"+count);
for(int j=0;j<count-1;j++)
{
	for(int i=0;i<count-j-1;i++)
	{
		int n= palindrome[i].length();
		int m= palindrome[i+1].length();
		if(n>m)
		{
			temp=palindrome[i+1];
			palindrome[i+1]=palindrome[i];
			palindrome[i]=temp;
		}
		
	}
}
System.out.println("Palindrome are:");
for(int i=0;i<count;i++)
{
	int n=palindrome[i].length();
	System.out.println(palindrome[i]+":"+n);
}
}
}
