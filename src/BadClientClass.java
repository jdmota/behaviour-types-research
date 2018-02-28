import mungo.lib.Typestate;

@Typestate("ClientProtocol")
public class BadClientClass {

	private TravelAgencyClass travelAgency = new TravelAgencyClass();

	public String receiveInfo() {
		return this.travelAgency.getInfo();
	}

	public void sendRequest(String travel) {
		this.travelAgency.receiveRequest(travel);
	}

	public PaymentStatus tryPayment(String data) {
		// In this case, the "tryPayment" is skipped,
		// and "getInvoice" will get called before the actual payment takes place.
		// We expect Mungo to warn about this.
		if (data.endsWith("SKIP BANK")) {
			return PaymentStatus.OK;
		}
		return this.travelAgency.tryPayment(data);
	}

	public String receiveInvoice() {
		return this.travelAgency.getInvoice();
	}

}
