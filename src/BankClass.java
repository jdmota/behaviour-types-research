// @Typestate("BankProtocol")
public class BankClass implements Bank {

	private Data data = null;
	private boolean sentApproval = false;

	// @invariant true;
	// @initial data == null && !sentApproval;
	public BankClass() {

	}

	// @requires data == null;
	// @ensures data != null;
	public Data receivePayment() {
		return null;
	}

	// @requires data != null && !sentApproval;
	// @ensures sentApproval;
	public void sendApproval(boolean b) {

	}

	public static void main(String[] args) {

		Bank bank = new BankClass();

		Data data = bank.receivePayment();

		bank.sendApproval(true);

	}

}
