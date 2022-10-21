/**
 * SER-515
 * Person abstract class  
 * @author Manasi Anantpurkar, manantpu@asu.edu
 * @version 1.0
 * @since 10-20-2022
 */
public abstract class Person {
	
	protected static ProductMenu ProductMenu;

	public abstract void ShowMenu();

	public abstract ProductMenu CreateProductMenu();

	@SuppressWarnings("static-access")
	Person(ProductMenu ProductMenu) {
		this.ProductMenu = ProductMenu;
	}

	public void ShowAddButtons() {
		ProductMenu.ShowAddButton();
	}

	public void shwViewButtons() {

		ProductMenu.ShowViewButton();
	}

	public void showRadios() {
		ProductMenu.ShowRadioButton();
	}

	public void showLabels() {
		ProductMenu.ShowLabels();
	}
}
