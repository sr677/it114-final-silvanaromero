/**
 * 
 */
package section2;

/**
 * @author Silvana
 *
 */
public class Country <C extends Capital> implements HasCapital, HasName {

	public String getName() {
		// TODO Auto-generated method stub
		return null;
	}

	public Capital getCapital() {
		// TODO Auto-generated method stub
		return null;
	}

	public String getCapitalName() {
		// TODO Auto-generated method stub
		return null;
	}

	private String name;
	private C capital;

	public Country (String _name, C _capital) {
	name = _name;
	capital = _capital;
	
	}

}