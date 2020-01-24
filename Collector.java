import java.util.*;
import mungo.lib.Typestate;

@Typestate("CollectorProtocol")
public class Collector<T> {
  
  private Iterator<T> it;
  
  public void init(Iterator<T> it) {
    this.it = it;
  }
  
  public List<T> collect() {
    List<T> list = new LinkedList<>();
    while(it.hasNext()) {
      list.add(it.next());
    }
    return list;
  }
}
