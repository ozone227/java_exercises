/**
 * @author Ryan Bond / drbond@gmail.com
 */

public interface BagInterface<T>
	{

		/** Gets the current number of entries in this bag.
			@return  The integer number of entries currently in the bag. */

		public int getCurrentSize();

		/** Adds a new entry to this bag.
		   @param newEntry  The object to be added as a new entry.
		   @return  True if the addition is successful, or false if not. */
		public boolean add(T newEntry);

		/** Retrieves all entries that are in this bag.
			@return  A newly allocated array of all the entries in the bag.
		    Note: If the bag is empty, the returned array is empty. */
		public T[] toArray();
	}
