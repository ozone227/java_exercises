/**
 * Selection Sort Exercise
 * Exercise #1 (Chapter 8 of Carrano & Henry, 2015, p. 264)
 * @author Ryan Bond / drbond@gmail.com
 *
 */

public class Driver {
	static void selectionSort(int array[])
	{
		// begin array loop
		 for (int i = 0; i < array.length - 1; i++)
	        {
	            int index = i;
	            // iterate through the entire array comparing element sizes
	            for (int j = i + 1; j < array.length; j++)
	                if (array[j] < array[index])
	                    index = j;
	            int smallNum = array[index];
	            array[index] = array[i];
	            // assign the lesser value to current position being evaluated
	            array[i] = smallNum;
	            // print the current state of the array with showArray()
	            showArray(array, array.length);

	        }
	}

	static void showArray(int array[], int size)
    {
        // iterate through the array printing each element
    	for (int i=0; i < size; i++)
    		System.out.print(array[i] + " ");
    		System.out.println("");
    }

	public static void main(String[] args) {
		// create the array and pass to selectionSort
		int array[] = {5, 7, 4, 9, 8, 5, 6, 3};
		selectionSort(array);
	}
}
