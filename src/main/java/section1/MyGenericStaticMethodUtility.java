/**
 * 
 */
package section1;

import java.util.Collection;

/**
 * @author Silvana
 *
 */
public class MyGenericStaticMethodUtility {
	
	public static<T> T add2collection(T _e, Collection<T> _collection) {
		_collection.add(_e);
		return _e;
	}

}
