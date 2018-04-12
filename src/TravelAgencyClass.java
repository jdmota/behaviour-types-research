import mungo.lib.Typestate;

@Typestate("TravelAgencyProtocol")
public class TravelAgencyClass {

	private BankClass bank = new BankClass();

	public void tryPayment(String data) {
		bank.receivePayment(data);
	}

}
