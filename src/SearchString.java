import java.util.*;
public class SearchString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc = new Scanner(System.in);
String str=sc.nextLine();
String s[]= {"krishna","Chaitanya","Anvi","Mom","Dad","Veni","krishna","anvi","chaitanya","mom","dad","veni","veni","veni"};
int count=0;
for(int i=0;i<s.length;i++)
{
	if(s[i].compareTo(str)==0)
	count++;
}

	System.out.println(count+1);
	
	}
	
	}

	

