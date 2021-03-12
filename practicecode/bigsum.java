package practicecode;

import java.util.Scanner;

public class bigsum {
	public static void main(String[]args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		long sum=0;
		long[] number= new long[n];
		for(int i=0;i<n;i++) {
			number[i]=sc.nextLong();	
		}
		for(int i=0;i<n;i++) {
			sum= sum+number[i];
		}
		
		System.out.println(sum);
		}

}
