/**
 *
 * Quicksort Exercise
 * @author Ryan Bond / drbond@gmail.com
 *
 */

package quicksort;
import java.util.ArrayList;

// Queue Classstore each person in the queue
// and can sort the queue based on last name or age.
public class Queue {
    // Create an Arraylist to Store the Queue
	ArrayList<Person> queue = new ArrayList<Person>();

	// Create Add and Print Methods for the Queue
    public void add(Person p){
        queue.add(p);
    }

    public void print(){
        for(Person p : queue){
            System.out.println(p.getFirstName()+" "+ p.getLastName()+" "+p.getAge());
        }
    }

    // Call the quickSort class by either Last Name or Age.
    public void sortByLastName(){
        queue = this.quickSort(queue, true);
    }

    public void sortByAge(){
        queue = this.quickSort(queue, false);
    }

    // An Arraylist Class for Queuing the Person Objects
    public ArrayList<Person> quickSort(ArrayList<Person> list, boolean onName)
    {
        if (list.isEmpty())
            return list;

        int compareResult = 0;
        // Create a set of Lists for Staging the Sorts
        ArrayList<Person> sorted;
        ArrayList<Person> smaller = new ArrayList<Person>();
        ArrayList<Person> greater = new ArrayList<Person>();
        // Set Pivot for the QuickSort
        Person pivot = list.get(0);
        int x;
        Person p;
        // Run Sorts based on Name or Age criteria
        for (x=1;x<list.size();x++)
        {
            p=list.get(x);
            if(onName){
                compareResult = p.compareLastName(pivot); // Run Name Comparison
            }else{
                compareResult = p.compareAge(pivot);  // Run Age Comparison
            }
            if (compareResult<0){
                smaller.add(p);
            }else{
                greater.add(p);
            }
        }
        // Temporarily use copies of the arraylist to sort the data
        smaller=quickSort(smaller, onName);
        greater=quickSort(greater, onName);
        smaller.add(pivot);
        smaller.addAll(greater);
        sorted = smaller;
        return sorted;
    }
}
