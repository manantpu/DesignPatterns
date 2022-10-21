import java.util.Iterator;

/**
 * SolutionIterator class for Visitor Pattern
 */
public class SolutionIterator extends ListIterator {
	@SuppressWarnings("rawtypes")
	@Override
	public boolean HasNext(Iterator iterator) {
		return iterator.hasNext();
	}

	@SuppressWarnings("rawtypes")
	@Override
	public void MoveToHead(Iterator iterator) {
		System.out.println("Head Moved ");
	}

	@SuppressWarnings("rawtypes")
	@Override
	public String Next(Iterator iterator) {
		if (this.HasNext(iterator)) {
			return (String) iterator.next();
		} else {
			return null;
		}
	}

	@SuppressWarnings("rawtypes")
	@Override
	public void Remove(Iterator iterator) {
		if (this.HasNext(iterator)) {
			iterator.next();
		}

	}

}
