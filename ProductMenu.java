/**
 * SER-515 abstract Course Menu class 
 * 
 @author Manasi Anantpurkar manasi@asu.edu
 * @version 1.0
 * @since 10-17-2022
 */
public abstract class ProductMenu {

	public abstract void ShowMenu();

	public abstract void ShowAddButton();

	public abstract void ShowViewButton();

	public abstract void ShowRadioButton();

	public abstract void ShowLabels();

	public abstract void showComboxes();

	public abstract void selectProduct(int USerType);

	public void createProductList() {
		System.out.println("Product List created");
	}

	public void AttachProductToUser() {
		System.out.println("Product Attached ");
	}

	public void ProductOperation() {
		System.out.println("Operation performed on the product");
	}

}

