import java.util.*;
import mungo.lib.Typestate;

@Typestate("CollectorProtocol")
public class Collector {
  
  private Iterator<String> it;
  
  public void init(Iterator<String> it) {
    this.it = it;
  }
  
  public List<String> collect() {
    List<String> list = new LinkedList<>();
    while(it.hasNext()) {
      list.add(it.next());
    }
    return list;
  }
}
