package JavaPrograms;
import java.util.Scanner;

public class NumericPattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n =sc.nextInt();
		
		//int n =4;
		for(int i=1; i<=n; i++) {
			for(int j=1; j<=n; j++) {
			System.out.print(i);
		}
			System.out.println();
		}
		sc.close();
	}

}
