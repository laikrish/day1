import java.util.Scanner;
public class Tax {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
   float ctc,tax;
   System.out.println("Enter the ctc:");
 ctc= sc.nextInt();
 
 if(ctc> 0 && ctc<=180000)
 {
	 System.out.println("Tax payable is NIL");
	 
 }
 else if(ctc>181001 && ctc<=300000)
 {
	 tax=(ctc*10)/100;

	 System.out.println("Tax payable is 10%");
	 System.out.println(tax);
 }
 else if(ctc>300001 && ctc<=500000)
 {
	 tax=(ctc*20)/100;

	 System.out.println("Tax payable is 20%");
	 System.out.println(tax);
 }
 else if (ctc>500001 && ctc<=1000000)
 {
	 tax=(ctc*30)/100;

	 System.out.println("Tax payable is 30%");
	 System.out.println(tax);
 }
	}

}
