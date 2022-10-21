import java.util.Iterator;
import java.util.Scanner;

/**
 * Facade class to take care of the facade pattern it calls the classes
 * for bridge pattern, factory pattern, visitor pattern, iterator pattern
 */

public class PtbsFacade {
	
	int UserType;
	String theSelectProduct;
	int nProductCategory;
	int theProductList;
	int thePerson;

	public void startFacade() {
		Scanner scan2 = new Scanner(System.in);
		System.out.println("Facade pattern initiated ");
		System.out.println("Press 1 to create new user");
		int usercreate=scan2.nextInt();
		if(usercreate==1){
			UserInfoItem new_user = new UserInfoItem();
			createUser(new_user);
		}
		else{
			System.out.println("Redirecting to Login..");
		}
		UserType = login(new Login());
		System.out.println(
				"Select from available Product Menus \n 1. Meat Product Menu \n 2. Produce Product Menu ");
		Scanner scan = new Scanner(System.in);
		theSelectProduct = scan.nextLine();
		// pattern implemented (Bridge implementation and Factory implementation
		if (theSelectProduct.equalsIgnoreCase("Meat Product Menu")) {
			selectProduct(new MeatProductMenu(), UserType);
		} else if (theSelectProduct.equalsIgnoreCase("Produce Product Menu")) {
			selectProduct(new ProduceProductMenu(), UserType);
		} else {
			System.out.println("Wrong Selection");
			System.exit(-1);
		}
		System.out.println("Implementing Visitor Pattern....");
		remind(theSelectProduct);
		System.out.println("Implementing Iterator pattern ....");
		ProductList products = new ProductList(theSelectProduct);
		@SuppressWarnings("rawtypes")
		Iterator iterate = (Iterator) products.createIterator();
		ProductIterator Product = new ProductIterator();
		OfferingList solList = new OfferingList();
		@SuppressWarnings("rawtypes")
		Iterator iterate2 = (Iterator) solList.createIterator();
		SolutionIterator si = new SolutionIterator();
		while (Product.HasNext(iterate)) {
			System.out.println(Product.Next(iterate));
			System.out.println(si.Next(iterate2));
		}
		scan.close();
	}

	public int login(Login object) {
		return object.login();
	}

	public void AddTrading(TradingMenu AM) {
		AM.AddTrading();
	}

	public void ViewTrading(TradingMenu VM) {
		VM.ViewTrading();
	}

	public void viewOffering(OfferingMenu SM) {
		SM.viewOffering();
	}

	public void markOffering(OfferingMenu SM) {
		SM.markOffering();
	}

	public void submitOffering(OfferingMenu SM) {
		SM.submitOffering();
	}

	public void remind(String theSelectProduct) {
		ReminderVisitor remind = new ReminderVisitor();
		ProductList CL = new ProductList(theSelectProduct);
		CL.accept(remind);
	}

	public void createUser(UserInfoItem userinfoitem) {
		System.out.println("User Creation Started");
		userinfoitem.createUSer();
	}

	public void createProductList(ProductMenu CM) {
		CM.createProductList();
	}

	public void AttachProductToUser(ProductMenu CM) {
		CM.AttachProductToUser();

	}

	public void selectProduct(ProductMenu CM, int UserType) {
		CM.selectProduct(UserType);
	}

	public void ProductOperation(ProductMenu CM) {
		CM.ProductOperation();
	}

}
