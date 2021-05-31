package batch2;
import java.util.Scanner;
public class binsearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 int counter, num, item, array[], first, last, middle;
	      //To capture user input
	      Scanner input = new Scanner(System.in);
	      System.out.println("Enter number of elements:");
	      num = input.nextInt(); 

	      //Creating array to store the all the numbers
	      array = new int[num];

	      System.out.println("Enter " + num + " integers");
	      //Loop to store each numbers in array
	      for (counter = 0; counter < num; counter++)
	          array[counter] = input.nextInt();
	      
	      //Bubble sort
	      int temp = 0;  
	         for(int i=0; i < num; i++){  
	                 for(int j=1; j < (num-i); j++)
	                 {  
	                          if(array[j-1] > array[j]){  
	                                 //swap elements  
	                                 temp = array[j-1];  
	                                 array[j-1] = array[j];  
	                                 array[j] = temp;  
	                         }  
	                          
	                 }  
	         }

	      //Print the sorted ARRAY
	         for (counter = 0; counter < num; counter++)
	        	 System.out.print(array[counter] + " ");
	         System.out.println();

	         
	      System.out.println("Enter the search value:");
	      item = input.nextInt();
	      first = 0;
	      last = num - 1;
	      middle = (first + last)/2;

	      while( first <= last )
	      {
	         if ( array[middle] < item )
	           first = middle + 1;
	         else if ( array[middle] == item )
	         {
	           System.out.println(item + " found at location " + (middle + 1) + ".");
	           break;
	         }
	         else
	         {
	             last = middle - 1;
	         }
	         middle = (first + last)/2;
	      }
	      if ( first > last )
	          System.out.println(item + " is not found.\n");
	}

}