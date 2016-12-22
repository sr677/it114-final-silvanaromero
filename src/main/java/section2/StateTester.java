/**
 * 
 */
package section2;

/**
 * @author Silvana
 *
 */
public class StateTester {

	public static void main (String[] args) {
	State<Capital, Govenor> nj = new State<Capital, Govenor>("NJ", new Capital("Trenton"), new Govenor("Christie"));
	System.out.println("nj name:"+ nj.getName() + ", capital name" + nj.getCapitalName() + ", govenor name" + nj.getGovernorName());
	}

}
