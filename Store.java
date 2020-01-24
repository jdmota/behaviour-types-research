import mungo.lib.Typestate;

@Typestate("StoreProtocol")
public class Store {

	public Store() {

	}
  
	public BuyResult buy(String item) {
    return BuyResult.OK;
  }
  
  public String emitReceipt() {
    return "";
  }

}
