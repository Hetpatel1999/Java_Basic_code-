package practicecode;

import java.util.Scanner;

public class Grading_Students {

	public static void main(String[] args) {
		Scanner scan= new Scanner (System.in);
		int n=scan.nextInt();
		int a[]= new int [n];
		for(int i=0;i<n;i++) {
		 a[i]=scan.nextInt();
		}
		for(int i=0;i<n;i++) {
			if(a[i]>=38) {
				int x;
				x=a[i]%5;
				if(x>=3) {
					a[i]=a[i]-x+5;
				}
			}
		}

		for(int i=0;i<n;i++) {
			System.out.println(a[i]);
		}
	}

}
