/**
 * 
 */
package section2;

/**
 * @author Silvana
 *
 */
public interface HasGovenor <G extends Govenor> {
	
	public G getGovernor ();
	
	public String getGovernorName();

}
