/**
 * SER-515 Buyer class to inherit person class
 * 
 * @author Manasi Anantpurkar
 * @version 1.0
 * @since 10-20-2022
 */
public class Buyer extends Person {
	Buyer() {
		super(ProductMenu);
	}

	Buyer(ProductMenu ProductMenu) {
		super(ProductMenu);
	}

	@Override
	public void ShowMenu() {
		System.out.println("Buyer Menu items");

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
