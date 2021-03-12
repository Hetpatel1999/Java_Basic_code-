package practicecode;

import java.util.Scanner;

public class Operators {

	public static void main(String[] args) {
		Scanner scanner =new Scanner(System.in);
		float mealcost= scanner.nextFloat();
		int tippercent=scanner.nextInt();
		int taxpercent= scanner.nextInt();
		float tip;
		float tax;
		float result;
		int roundup;
		
//		for tip
		tip=mealcost*tippercent/100;
		System.out.println(tip+"tip");
//		for tax
		tax=mealcost*taxpercent/100;
		System.out.println(tax+"tax");
//		for result
		result=mealcost+tip+tax;
		System.out.println(result+"result");
		roundup=(int)Math.round(result);
		System.out.println(roundup);
	}

}
