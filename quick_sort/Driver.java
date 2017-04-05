/**
 *
 * Quicksort Exercise
 * @author Ryan Bond / drbond@gmail.com
 *
 */
import java.util.Scanner;
package quicksort;

public class Driver {

	// Create the Scanner Object and Instantiate Queue for User Creation
	static Scanner s = new Scanner(System.in);
	static Queue q = new Queue();

	// addPeople() scans keyboard input and queues it as a Person object.
	public static void addPeople()
	{
		// Loop 5 times prompting user input.
		for (int i =0; i < 5; i++)
		{
			System.out.print("Enter Name & Age: ");
			String Scanned = s.nextLine();
			//Split the Scanned Input on  white Spaces
			String[] input = Scanned.split(" ");
			// Add the Resulting String Array to the Queue
			q.add(new Person (input[0],input[1],input[2]));
		}
		System.out.println();
	}

	// Driver class for executing the application
    public static void main(String[] args) {
        // run addPeople() and print the state of the Queue
    	addPeople();
        System.out.println("Original Queue:\n");
        q.print();

        // run sortByLastName() and print the state of the Queue
        System.out.println("\nSorted by Last Name:");
        q.sortByLastName();
        System.out.println();
        q.print();

        // run sortByAge() and print the state of the Queue
        System.out.println("\nSorted by Age:");
        q.sortByAge();
        System.out.println();
        q.print();

    }
}
