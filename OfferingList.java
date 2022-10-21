import java.util.ArrayList;
import java.util.Iterator;

/**
 * OfferingList to store list of menu items implementing the iterator pattern
 */
public class OfferingList {

	ArrayList<String> sol = new ArrayList<>();

	OfferingList() {
		sol.add("Offering for Beef");
		sol.add("Offering for Pork");
		sol.add("Offering for Meat");
		sol.add("Offering for Tomatoes");
		sol.add("Offering for Onions");
	}

	@SuppressWarnings("rawtypes")
	public Iterator createIterator() {
		return this.sol.iterator();
	}
}
