/**
 * @author Ryan Bond / drbond@gmail.com
 */

public class BoutiqueBagDemo {

	public static void main(String[] args) {
		// initialize the abstracted array and populate with Objects
		BagInterface<ClothingItem> adtBag = new ClothingBag<>();
		ClothingItem[] Clothes = new ClothingItem[6];
		 Clothes[0] = new ClothingItem("Plaid Shirt", 19.99);
		 Clothes[1] = new ClothingItem("Blue Shirt", 29.99);
		 Clothes[2] = new ClothingItem("Dress Socks", 8.57);
		 Clothes[3] = new ClothingItem("Pink Skirt", 79.99);
		 Clothes[4] = new ClothingItem("Black Jeans", 59.39);
		 Clothes[5] = new ClothingItem("Bejeweled Jeans", 299.99);
		testAdd(adtBag, Clothes);
	}

private static void testAdd(BagInterface<ClothingItem> adtBag,
		ClothingItem[] content)
	{
	System.out.println("--------------------------------------");
	System.out.println("Adding the following " + content.length +
	" Clothing Items: ");
	System.out.println("--------------------------------------");
	for (int index = 0; index < content.length; index++)
	{
	if (adtBag.add(content[index]))
		System.out.println(content[index] + " ");
	else
		System.out.print("\nUnable to add " + content[index] +
	      " to the bag.");
	} // end for
		System.out.println();
		displayBag(adtBag);
} // end testAdd

// Tests the method toArray while displaying the bag.
	private static void displayBag(BagInterface<ClothingItem> adtBag)
	{
		System.out.println("-----------------");
		System.out.println("The Bag Contains:");
		System.out.println("-----------------");
		Object[] bagArray = adtBag.toArray();
		for (int index = 0; index < bagArray.length; index++)
		{
			System.out.println(bagArray[index] + " ");
		} // end for
		System.out.println();
	} // end displayBag

}
