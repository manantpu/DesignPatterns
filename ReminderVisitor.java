/**
 * SER-515 Reminder Visitor class responsible for implementing visitor pattern
 * 
 * @author Manasi Anantpurkar manantpu@asu.edu
 * @version 1.0
 * @since 10-20-2022
 */
public class ReminderVisitor extends NodeVisitor {
	String m_Reminder;

	@Override
	public void visitFAcade(PtbsFacade HF) {
		System.out.println("visiting Facade");

	}

	@Override
	public Reminder visitTrading(Trading T) {
		System.out.println("visiting Trading");
		return T;
	}

	@Override
	public Reminder visitProduct(ProductList CL) {
		System.out.println("visiting Product");
		return CL;

	}

}
