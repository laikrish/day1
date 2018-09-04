import java.util.Scanner;
public class Interest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 double  p, r, t,si,ci;
		  Scanner s = new Scanner(System.in);
	        System.out.print("Enter the Principal : ");
	        p = s.nextDouble();
	        System.out.print("Enter the Rate of interest : ");
	        r = s.nextDouble();
	        System.out.print("Enter the Time period : ");
	        t = s.nextDouble();
	       
	        si = (p * t * r) / 100;
	        ci= p * Math.pow (1.0 + r/100.0,t)-p ;
	        System.out.println("The Simple Interest is : " + si);
	        
	        System.out.print("The compound Interest is : " + ci); 
	    }
	}

