/**
 * SER-515 Meat Product Menu responsible for bridge patterna and factory pattern
 * 
 * @author Manasi Anantpurkar, manantpu@asu.edu
 * @version 1.0
 * @since 10-20-2022
 */
public class MeatProductMenu extends ProductMenu {

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
	public void showComboxes() {

		System.out.println();
	}

	public void selectProduct(int userType) {
		System.out.println("Meat Product Menu Selected \n Bridge Pattern for connection used");
		Person person;
		if (userType == 0) {
			person = PersonFactory.createObject("Buyer");

		} else
		{
			person = PersonFactory.createObject("Seller");

		}
		person.ShowMenu();
	}

}
