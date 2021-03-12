package practicecode;
import java.util.Scanner;
public class Intro_to_Conditional_Statements {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		int N=scan.nextInt();
		if(N%2==0) {
			if(N>2 && N<6) {
				System.out.println("Not Weird");
			}
			if(N>5 && N<21) {
				System.out.println("Weird");
			}
			if(N>21) {
				System.out.println("Not Weird");
			}
		}
		else
			System.out.println("Weird");
	}

}
