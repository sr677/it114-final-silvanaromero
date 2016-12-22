/**
 * 
 */
package section2;

/**
 * @author Silvana
 *
 */
public class State <C extends Capital, G extends Govenor> implements HasCapital<C>, HasGovenor<G>, HasName {

	/**
	 * 
	 */
	private String name;
	private C capital;
	private G govenor;
	
	public State (String _name, C _capital, G _govenor) {
	name = _name;
	capital = _capital;
	govenor = _govenor;

	}

	public String getName() {
		// TODO Auto-generated method stub
		return null;
	}

	public G getGovernor() {
		// TODO Auto-generated method stub
		return null;
	}

	public String getGovernorName() {
		// TODO Auto-generated method stub
		return null;
	}

	public C getCapital() {
		// TODO Auto-generated method stub
		return null;
	}

	public String getCapitalName() {
		// TODO Auto-generated method stub
		return null;
	}

}
