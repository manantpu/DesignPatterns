/**
 * SER-515 Seller Class inheriting from person class and implementing bridge
 * pattern
 * 
 * @author Manasi Anantpurkar, manantpu@asu.edu
 * @version 1.0
 * @since 10-20-2022
 */
public class Seller extends Person {
	Seller() {
		super(ProductMenu);
	}

	Seller(ProductMenu ProductMenu) {
		super(ProductMenu);
	}

	@Override
	public void ShowMenu() {
		System.out.println("Seller Menu items");

	}

	@Override
	public ProductMenu CreateProductMenu() {
		String test = "Meat Product";
		if (test.equalsIgnoreCase("Meat Product")) {
			return new MeatProductMenu();
		} else {
			return new ProduceProductMenu();
		}

	}

}
