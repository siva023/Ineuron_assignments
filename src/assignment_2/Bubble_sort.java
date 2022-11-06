package assignment_2;

public class Bubble_sort {

	  static void bubbleAscending(int[] myarray) {
	    int n = myarray.length;
	    int temp = 0;
	    for (int i = 0; i < n; i++) {
	      for (int j = 1; j < (n - i); j++) {
	        if (myarray[j - 1] > myarray[j]) {
	          temp = myarray[j - 1];
	          myarray[j - 1] = myarray[j];
	          myarray[j] = temp;
	        }
	      }
	    }

	  }
	  public static void main(String[] args) {
	    int myarray[] = {
	      4, 15,12,21, 2,25,10,18
	    };

	    System.out.println("Array on which we apply Bubble Sort: ");
	    for (int i = 0; i < myarray.length; i++) {
	      System.out.print(myarray[i] + " ");
	    }
	    System.out.println();

	    bubbleAscending(myarray); //Applying Bubble sort to sort the Array  

	    System.out.println("Array after applying Bubble Sort: ");
	    for (int i = 0; i < myarray.length; i++) {
	      System.out.print(myarray[i] + " ");
	    }
	  }
	}
