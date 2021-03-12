package practicecode;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class arraycomper {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		int a[]= new int[3];
		int b[]= new int [3];
		int alis=0;
		int bob=0;
		
		for(int i=0;i<3;i++) {
			a[i]=scanner.nextInt();
		}
		for(int i=0;i<3;i++) {
			b[i]=scanner.nextInt();	
		}
		
		
		for(int i=0;i<3;i++) {
			if(a[i]>b[i])
			{
				alis +=1;
			}
			else if(a[i]<b[i])
				bob+=1;
		}
		
		List<Integer> result=new ArrayList<>();
		result.add(alis);
		result.add(bob);
		System.out.println(result);
		
		
	}

}
