import java.util.Scanner;

public class Boiler {

	public static void checkDiscount(double PurchaseAmount) {
		// TODO Auto-generated method stub
		if( PurchaseAmount>100) {
			System.out.println("Discount Applicable");
		}
		else {
			System.out.println("Discount not applicable");
		}
		

	}
	public static void main(String[]args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter PurchaseAmount");
		double PurchaseAmount=scan.nextDouble();
		checkDiscount(PurchaseAmount);
		scan.close();
		
	}

}
