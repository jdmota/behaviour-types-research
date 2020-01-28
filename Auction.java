import mungo.lib.Typestate;

@Typestate("AuctionProtocol")
public class Auction {
  private Client hBidder;
  private Client[] clients;
  private boolean ended;

  public void init(int maxClients) {
    hBidder = null;
    clients = new Client[maxClients];
    ended = false;
    for (int i = 0; i < maxClients; i++)
      clients[i] = new Client(i);
  }
  
  public Boolean canBid(int clientId, double val) {
    return hBidder == null ||
          (hBidder.getId() != clientId && val > hBidder.getBid()) ?
            Boolean.True :
            Boolean.False;
  }

  public void bid(int clientId, double val) {
    clients[clientId].bid(val);
    hBidder = clients[clientId];
  }

  public Client finish() {
    ended = true;
    for (Client client : clients) {
      System.out.println(client.getId());
      // client.close();
    }
    return hBidder;
  }
}
