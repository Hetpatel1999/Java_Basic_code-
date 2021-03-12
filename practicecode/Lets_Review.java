package practicecode;

import java.util.Scanner;

public class Lets_Review {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		
		int n=scan.nextInt();scan.nextLine();
		String[] message=new String[n];
		for(int i=0;i<n;i++) {
			message[i]=scan.nextLine();
		}
		
		for(int i=0;i<n;i++) {
			char[]arr=message[i].toCharArray();
			for(int e=0;e<arr.length;e+=2){
				System.out.print(arr[e]);
			}
			System.out.print(" ");
			for(int o=1;o<arr.length;o+=2) {
				
				System.out.print(arr[o]);
			}
			System.out.println();
			
		}	
	}
}
