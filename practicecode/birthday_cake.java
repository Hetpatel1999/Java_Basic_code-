package practicecode;
import java.util.Scanner;

public class birthday_cake {

	public static void main(String[] args) {
		Scanner scan= new Scanner(System.in);
		int n=scan.nextInt();
		int a[]=new int [n];
		int count=0;
		int tall=0;
		for(int i=0;i<n;i++) {
			a[i]=scan.nextInt();
			if(a[i]>tall) {
				tall=a[i];
			}
		}
		for(int i=0;i<n;i++) {
			if(a[i]==tall) {
				count++;
			}
		}
		System.out.println(count);

	}

}
