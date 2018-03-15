import mungo.lib.Typestate;

@Typestate("TravelAgencyProtocol")
public class TravelAgencyClass {

	public PaymentStatus tryPayment(BankClass bank, String data) {
		return bank.receivePayment(data);
	}

}
