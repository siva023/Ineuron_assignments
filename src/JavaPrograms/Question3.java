package JavaPrograms;

import java.util.Scanner;

public class Question3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner scanner = new Scanner(System.in);
		    
         System.out.println("Enter the number of rows ");
 
         int n = scanner.nextInt();
         
         System.out.println(" Printing the pattern ");
       
         
         for(int i=1; i<=n; i++)
         {
             for(int j=i; j<=n; j++)
             {
                 System.out.print("*");
             }
             for(int j=2; j<=(2*i-1); j++)
             {
                 System.out.print(" ");
            	 
             }
             for(int j=i; j<=n; j++)
             {
                 System.out.print("*");
             }
            
             System.out.println();
         }
         for(int i =1; i<=n; i++) {
        	 for(int j=i; j<=i; j++)
             {
                 System.out.print("*");
             }
        	 for(int j=1; j<=n+n-2; j++)
             {
                 System.out.print(" ");
            	 
             }
             for(int j=i; j<=i; j++)
             {
                 System.out.print("*");
             }
            System.out.println();
         }    
         for(int i=1; i<=n+n; i++) {
        	 System.out.print("*");
         }
         scanner.close();
	}

}
