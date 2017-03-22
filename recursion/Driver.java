/**
 * Recursion Example
 * @author Ryan Bond / drbond@gmail.com
 * Exercise # 5 (Chapter 7 of Carrano & Henry, 2015, p. 227)
 */

public class Driver {

		// Recursive Method to reverse the array. Pass reverse the source array, first position, & last position.
		 static void reverse(int array[], int start, int end)
		    {
		        int temp;
		        // set base case for the method
		        if (start >= end)
		            return;
		        // store the first position as a variable and swap with the last.
		        temp = array[start];
		        array[start] = array[end];
		        array[end] = temp;
		        // Recursive invocation incrementing through the array positions.
		        reverse(array, start+1, end-1);
		    }

		   // Print the contents of the arrayay
		    static void showArray(int array[], int size)
		    {
		        // iterate through the array printing each element
		    	for (int i=0; i < size; i++)
		            System.out.println(array[i] + " ");
		        System.out.println("");
		    }

		    // Driver class to launch reverse and print methods
		    public static void main (String[] args) {
		    	// create the array and pass it to the printer method.
		        int array[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13};
		        System.out.println("The Original Array:");
		        showArray(array, array.length);
		        //pass the array, first position,and last position to reverse
		        reverse(array, 0, array.length-1);
		        System.out.println("The Reversed Array:");
		        showArray(array, array.length); // pass the array and length to the printer method.
		    }
	}
