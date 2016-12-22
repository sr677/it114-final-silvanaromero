/**
 * 
 */
package section1;

/**
 * @author Silvana
 *
 */
public class MyGenericContainerTester {

	/**
	 * 
	 */
	public static void main(String [] args) {
		// TODO Auto-generated constructor stub
		MyGenericContainerInterface<String> c4String = new MyGenericContainerClass<String> ("ilker");
		MyGenericContainerInterface<Integer> c4Integer = new MyGenericContainerClass<Integer> (1234);
		
		System.out.println(c4String.getContained());
		System.out.println(c4String.getContained());
		
	}
	

}
