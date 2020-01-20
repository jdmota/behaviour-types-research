import mungo.lib.Typestate;
import mungo.lib.Boolean;

@Typestate("JavaIteratorProtocol")
public interface JavaIterator<T> {
  
	Boolean hasNext();
  
  T next();

}
