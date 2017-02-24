/**
 * @author Ryan Bond / drbond@gmail.com
 */

// Class to store a String & double as objects.
public class ClothingItem {
	private String name;
	private double price;

	public ClothingItem (String name, double price)
	{
	this.name = name;
	this.price = price;
	}
	public String getName()
		{
		return this.name;
		}
	public double getPrice()
		{
		return this.price;
		}
	@Override
	public String toString()
	{
		return this.name + " " + this.price;

	}
}
