import java.util.Scanner;

public class LinearSearch {

		public static void main(String[] args) {
			int c, n, search, array[];
			 
		    Scanner sc = new Scanner(System.in);
		    System.out.println("Enter number of elements");
		    n = sc.nextInt(); 
		    
		 
		    System.out.println("Enter " + n + " integers");
		    array = new int[n];
		    for (c = 0; c < n; c++)
		      array[c] = sc.nextInt();
		 
		    System.out.println("Enter value to find");
		    search = sc.nextInt();
		 
		    for (c = 0; c < n; c++)
		    {
		      if (array[c] == search)    
		      {
		         System.out.println(search + " is present at location " + (c + 1) + ".");
		        break;
		      }
		    }
		    if(c==n)
		    {
		      
		      System.out.println(search + " isn't present in array.");
		      
		    }
}
}






