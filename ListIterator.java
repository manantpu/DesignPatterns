import java.util.Iterator;

/**
 * List iterator class for implementing iterator pattern
 */


public abstract class ListIterator {
	@SuppressWarnings("rawtypes")
	public abstract boolean HasNext(Iterator iterator);

	@SuppressWarnings("rawtypes")
	public abstract void MoveToHead(Iterator iterator);

	@SuppressWarnings("rawtypes")
	public abstract String Next(Iterator iterator);
	
	@SuppressWarnings("rawtypes")
	public abstract void Remove(Iterator iterator);

}
