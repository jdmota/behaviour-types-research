import mungo.lib.Typestate;

@Typestate("TravelAgencyProtocol")
public class TravelAgencyClass {

	private BankClass bank = null;

	public TravelAgencyClass(BankClass bank) {
		this.bank = bank;
	}

	public String getInfo() {
		return "Travel Agency Info";
	}

	public void receiveRequest(String travel) {

	}

	public PaymentStatus tryPayment(String data) {
		return bank.receivePayment(data);
	}

	public String getInvoice() {
		return "Invoice for travel";
	}

	public OurBool exit(OurBool b) {
		return bank.exit(b);
	}

}
