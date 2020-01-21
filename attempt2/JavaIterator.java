import java.util.Iterator;
import mungo.lib.Typestate;

@Typestate("JavaIteratorProtocol")
public class JavaIterator {
  
  private Iterator it;
  
  public JavaIterator(Iterator it) {
    this.it = it;
  }
  
	public boolean hasNext() {
    return it.hasNext();
  }
  
  public Object next() {
    return it.next();
  }

}
