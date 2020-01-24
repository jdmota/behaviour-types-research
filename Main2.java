public class Main2 {
	public static void main(String[] args) {
		Server server = new Server();
    loop: do {
      server.handleRequest();
      continue loop;
    } while(true);
	}
}
