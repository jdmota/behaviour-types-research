import mungo.lib.Typestate;

@Typestate("BankProtocol")
public class BankClass {

	public void exit(OurBool b) {
		if (b.equals(OurBool.TRUE)) {
		}
	}

}
