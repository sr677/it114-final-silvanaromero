/**
 * 
 */
package section2;

/**
 * @author Silvana
 *
 */
public class CountryTester {

	public static void main (String[] args) {
Country<Capital> us = new Country<Capital>("USA", new Capital ("Washington D.C"));
System.out.println("us name:" + us.getName() + ", capital name:" + us.getCapitalName());

Country<Capital> turkey = new Country<Capital>("Turkey", new Capital ("Ankara"));
System.out.println("turkey name:" + us.getName() + ", capital name:" + us.getCapitalName());

}

}	