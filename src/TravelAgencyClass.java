import mungo.lib.Typestate;

@Typestate("TravelAgencyProtocol")
public class TravelAgencyClass {

	private BankClass bank = new BankClass();
	private String travel = null;

	public String getInfo() {
		return "Travel Agency Info";
	}

	public void receiveRequest(String travel) {
		this.travel = travel;
		System.out.println("Travel Agency received request: " + travel);
	}

	public PaymentStatus tryPayment(String data) {
		System.out.println("Trying payment for travel: " + travel);
		return bank.receivePayment(data);
	}

	public String getInvoice() {
		return "Invoice for travel: " + travel;
	}

}
