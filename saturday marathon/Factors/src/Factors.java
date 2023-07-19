import java.util.Scanner;
public class Factors {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
          Scanner scan=new Scanner(System.in);
          System.out.println("Enter N");
          int n=scan.nextInt();
          System.out.println("Factors of "+n+" are :");
          for(int i=1;i<=n;i++) {
        	  if(n%i==0) {
        		  System.out.println(i+" ");
        	  }
          }

	}

}
