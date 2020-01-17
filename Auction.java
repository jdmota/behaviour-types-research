import mungo.lib.Typestate;

@Typestate("AuctionProtocol")
public class Auction {

	private Client hBidder;
	private Client[] clients;
	private boolean ended;

	public Auction(int maxClients) {
		hBidder = null;
		clients = new Client[maxClients];
		ended = false;
    
    for (int i = 0; i < maxClients; i++) {
      clients[i] = new Client(i);
    }
	}

	public void bid(int clientId, double val) {
    clients[clientId].bid(val);
    hBidder = clients[clientId];
	}

	public void withdraw(int clientId) {
    clients[clientId].withdraw();
	}
  
	public void win(int clientId) {
    clients[clientId].win();
	}
  
	public void finish() {
		ended = true;
	}
	
	public static void main(String[] args) {
		
		Auction a = new Auction(2);
		
		a.bid(0, 10.0);
		
		a.bid(0, 11.0); // Cannot bid if it is already the highest bidder
		
		a.finish();
		
		a.win(0);
		
		a.withdraw(1);
		
	}

}
