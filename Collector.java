import java.util.*;
import mungo.lib.Typestate;
import mungo.lib.Boolean;

@Typestate("CollectorProtocol")
public class Collector<T> {
  
  private JavaIterator<T> it;
  
	public void init(JavaIterator<T> it) {
    this.it = it;
  }
  
  public List<T> collect() {
    List<T> list = new LinkedList<>();
    loop: do {
      switch(it.hasNext()) {
        case True:
          list.add(it.next());
          break;
        case False:
          break loop;
      }
    } while(true);
    return list;
  }

}
