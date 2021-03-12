package practicecode;

import java.util.Scanner;

public class sum_of_diff_typr {

	 public static void main(String[] args) {
	        int i = 4;
	        double d = 4.0;
	        String s = "HackerRank ";
			
	        Scanner scan = new Scanner(System.in);

	       int first=scan.nextInt();
	        double second=scan.nextDouble();
	        
	        String message = scan.next();
	        message += scan.nextLine();
	       
	        
	        
	        int sum1=first+i;
	        System.out.println(sum1);
	        
	        double sum2=second+d;
	        System.out.println(sum2);
	        
	        System.out.println( s + message);


	 }
	 
}
