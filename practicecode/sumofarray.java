package practicecode;

import java.util.Scanner;

public class sumofarray {

	public static void main(String[] args) {
		Scanner scanner=new Scanner (System.in);
		int n=scanner.nextInt();
		int a[]=new int [n];
		for(int i=0;i<n;i++) {
			a[i]=scanner.nextInt();
		}
		int sum=0;
		for(int i=0;i<n;i++) {
			sum=sum+a[i];
		}
			System.out.println(sum);
		
	}

 }

