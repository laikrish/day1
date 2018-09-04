import java.util.Scanner;
public class Discount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
Float newItem,discount,newItemPrice;

System.out.println("Enter newitem price");
newItem = sc.nextFloat();
System.out.println("Enter discount");
discount = sc.nextFloat();
System.out.println("price after discount");
newItemPrice=newItem-(newItem*(discount/100));
System.out.println(newItemPrice);

	}

}
