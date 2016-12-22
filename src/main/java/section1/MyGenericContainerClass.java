/**
 * 
 */
package section1;

/**
 * @author Silvana
 *
 */
public class MyGenericContainerClass<T> implements MyGenericContainerInterface<T> {
	private T Contained;
	
	public T getContained(){
		return Contained;
	}

	/**
	 * 
	 */
	public MyGenericContainerClass( T contained) {
		this.Contained = contained;
		
		// TODO Auto-generated constructor stub
		
		
	}

}
