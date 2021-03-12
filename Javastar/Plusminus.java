package Javastar;

import java.util.Scanner;

public class Plusminus {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		int n=scan.nextInt();
		int arr[]=new int[n];
		double negetive=0;
		double positive=0;
		double zero=0;
		for(int i=0;i<n;i++) {
			arr[i]=scan.nextInt();
		}
		for(int i=0;i<n;i++) {
			if(arr[i]<0) {
				negetive +=1;
				
			}
			else if(arr[i]>0) {
				positive +=1;
			}else {
				zero+=1;
			}
			
		}
//		System.out.println(negetive);
//		System.out.println(positive);
//		System.out.println(zero);
//		System.out.println(n);
		double a=negetive/n;
		double b=positive/n;
		double c=zero/n;
		
		System.out.format("%6f \n",b);
		System.out.format("%6f \n",a);
		System.out.format("%6f \n",c);

	}

}
