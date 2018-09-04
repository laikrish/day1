import java.util.Scanner;
public class Username {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String u="krishna";
		String pw="capgemini";
		int count=0;
		
		while(count<3)
		{
			System.out.println("Enter usern");
			String usern=sc.nextLine();
			System.out.println("Enter password");
			String password=sc.nextLine();
			if(u.equals(usern) && pw.equals(password))
			{
				System.out.println("Welcome");
			return;
			}
			else {
				count++;
			}		
			 if(count!=3)
			 {
					System.out.println("Something wrong");
		
			}
		
				if(count==3)
				
					System.out.println("Contact admin");
			
				
				
		}

	}

}
