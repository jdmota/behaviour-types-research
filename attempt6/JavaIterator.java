import java.util.Iterator;
import mungo.lib.Typestate;

@Typestate("JavaIteratorProtocol")
public class JavaIterator {
  
  private Iterator it;
  
  public JavaIterator(Iterator it) {
    this.it = it;
  }
  
	public Boolean hasNext() {
    return it.hasNext() ? Boolean.True : Boolean.False;
  }
  
  public Object next() {
    return it.next();
  }

}
