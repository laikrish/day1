
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.DateFormatSymbols;
import java.util.*;
public class Date {
private static int a;
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String abc = br.readLine();
		String[] date=abc.split(",");
		 System.out.println(date);
		 int x =Integer.parseInt(date[1]);
		 String monthString;
		 monthString = new DateFormatSymbols().getMonths()[x-1];
		 System.out.println(date[0] + "/" + monthString + "/" +date[2]);
		 a=date.length;
		 
         

	}

}
