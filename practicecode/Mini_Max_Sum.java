package practicecode;

import java.util.Arrays;
import java.util.Scanner;

public class Mini_Max_Sum {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		int a[]=new int [5] ;
		int sum=0;
		int min=0,max=0;
		int minsum, maxsum;
		
		for(int i=0;i<5;i++) {
			a[i]=scan.nextInt();
		}
		for(int i=0;i<5;i++) {
			sum += a[i];
			min=a[0];
			max=a[0];
		}
		for(int i=0;i<5;i++) {
			if(a[i]<min) {
				min=a[i];
			}
			else if(a[i]>max) {
				max=a[i];
			}
		}
		
		maxsum=sum-min;
		minsum=sum-max;
		
		
		System.out.println(minsum);
		System.out.println(maxsum);

	}

}
