/**
 * SER-515 Abstract Reminder class for Visitor Pattern 
 * 
 * @author Manasi Anantpurkar manasi@asu.edu
 * @version 1.0
 * @since 10-17-2022
 */
public abstract class Reminder {

	public abstract Reminder accept(NodeVisitor NV);

}
