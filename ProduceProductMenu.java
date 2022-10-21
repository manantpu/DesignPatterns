/**
 * SER-515 Produce Product Menu responsible for bridge patterna and factory pattern
 * 
 * @author Manasi Anantpurkar, manantpu@asu.edu
 * @version 1.0
 * @since 10-20-2022
 */
public class ProduceProductMenu extends ProductMenu {

	@Override
	public void ShowMenu() {
		System.out.println();

	}

	@Override
	public void ShowAddButton() {
		System.out.println();

	}

	@Override
	public void ShowViewButton() {
		System.out.println();

	}

	@Override
	public void ShowRadioButton() {
		System.out.println();

	}

	@Override
	public void ShowLabels() {
		System.out.println();

	}

	@Override
	public void showComboxes(){

	}
	public void selectProduct(int USerType) {
		System.out.println("Produce Product Menu Selected \n Bridge Pattern for connection used ");
		Person person;
		if (USerType == 0) {
			person = PersonFactory.createObject("Buyer");

		} else
		{
			person = PersonFactory.createObject("Seller");

		}
		person.ShowMenu();
	}
}
