package practicecode;

import java.util.Scanner;

public class Loops {

	public static void main(String[] args) {
		Scanner scan=new Scanner (System.in);
		int n=scan.nextInt();
		for(int i=0;i<11;i++) {
			System.out.println(n+" "+"x"+" " + i+" "+"="+" "+n*i);
		}
	}

}
