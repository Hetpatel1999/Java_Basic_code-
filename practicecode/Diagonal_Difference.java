package practicecode;
import java.util.Scanner;

public class Diagonal_Difference {

	public static void main(String[] args) {
		Scanner scan=new Scanner (System.in);
		
		int n=scan.nextInt();
		int a[][]=new int [n][n];
		int left_sum=0;
		int right_sum=0;
		
		// for matrix
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				a[i][j]=scan.nextInt();
				if(i==j) {
					left_sum=left_sum+a[i][j];
				}
			}
			right_sum= right_sum+a[i][n-1-i];
		}
		System.out.println(Math.abs(left_sum - right_sum));
		
		
	}

}
