/**
 * 
 */
package section2;

/**
 * @author Silvana
 *
 */
public interface HasCapital <C extends Capital> {

	public C getCapital ();
	public String getCapitalName();
	
}
