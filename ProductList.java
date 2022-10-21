import java.util.ArrayList;
import java.util.Iterator;

/**
 * Product List class to implement the iterator pattern 
 */
@SuppressWarnings("rawtypes")
public class ProductList extends Reminder {

	ArrayList<String> sol = new ArrayList<>();

	ProductList(String x) {
		if(x.equalsIgnoreCase("Meat Product Menu")){
			sol.add("Beef");
			sol.add("Pork");
			sol.add("Meat");
		}
		else if(x.equalsIgnoreCase("Produce Product Menu")){
			sol.add("Tomato");
			sol.add("Onion");
		}
		
	}


	public Iterator createIterator() {
		return this.sol.iterator();
	}

	public Reminder accept(NodeVisitor nodeVisitor) {
		System.out.println("Product List Reminder");
		return nodeVisitor.visitProduct(this);
	}

}
