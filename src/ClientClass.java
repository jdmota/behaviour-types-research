import mungo.lib.Typestate;

@Typestate("ClientProtocol")
public class ClientClass {

	private TravelAgencyClass travelAgency;

	public ClientClass(TravelAgencyClass t) {
		travelAgency = t;
	}

	public String receiveInfo() {
		return this.travelAgency.getInfo();
	}

	public void sendRequest(String travel) {
		this.travelAgency.receiveRequest(travel);
	}

	public PaymentStatus tryPayment(String data) {
		return this.travelAgency.tryPayment(data);
	}

	public String receiveInvoice() {
		return this.travelAgency.getInvoice();
	}

	public OurBool exit(OurBool b) {
		return travelAgency.exit(b);
	}

}
