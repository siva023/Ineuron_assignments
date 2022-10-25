package JavaPrograms;

import java.util.Scanner;

public class Question5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		for(int i =1; i<=n; i++) {
			for(int j=i; j<=n; j++) {
			System.out.print("*");
			}
			if(i ==1) {
				for(int j=i; j<=n; j++) {
					System.out.print("*");
					}
			}
			System.out.println();
		}
		for(int i =1; i<=n; i++) {
			for(int j=1; j<=i; j++) {
			System.out.print("*");
			}
			if(i ==n) {
				for(int j=1; j<=n; j++) {
					System.out.print("*");
					}
			}
			System.out.println();
		}
		sc.close();
	}

}
