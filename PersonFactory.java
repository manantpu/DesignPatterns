
/**
 * SER-515 
 * @author Manasi Anantpurkar manantpu@asu.edu
 * @version 1.0
 * @since 10-20-2022
 */
public class PersonFactory extends Person {

	PersonFactory(ProductMenu ProductMenu) {
		super(ProductMenu);
	}

	@Override
	public void ShowMenu() {}

	@Override
	public ProductMenu CreateProductMenu() {
		return null;
	}

	/**
	 * The method createObject uses Factory Pattern to create a new person type object. The object can be Seller
	 * or Buyer depending on the value of the str variable. 
	 * This variable is passed to the method through MeatProductMenu or ProduceProductMenu.
	 * @param str
	 * @return
	 */

	public static Person createObject(String str) {
		Person person;
		System.out.println("Using Factory Pattern for user creation");
		if (str.equalsIgnoreCase("Seller")) {
			person = new Seller();
		} else

		{
			person = new Buyer();
		}
		return person;
	}
}
