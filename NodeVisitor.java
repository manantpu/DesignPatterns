/**
 * Node Visitor class for Visitor pattern
 */
public abstract class NodeVisitor {

	public abstract void visitFAcade(PtbsFacade HF);

	public abstract Reminder visitTrading(Trading A);

	public abstract Reminder visitProduct(ProductList CL);

}
