/**
 * 
 */
package section1;

import java.util.List;
import java.util.ArrayList;
import java.util.Collection;

/**
 * @author Silvana
 *
 */
public class MyGenericStaticMethodUtilityTester {

	/**
	 * 
	 */
	public static void main(String[] args) {		

		String s1 = "element_1";
		Integer i1 = 1234;
		List<String> strings = new ArrayList<String>();
		List<Integer> integers = new ArrayList<Integer>();
		
		String s = MyGenericStaticMethodUtility.add2collection(s1, strings);
		System.out.println("added String " + s + ", strings.size:" + strings.size());
		
		Integer i = MyGenericStaticMethodUtility.add2collection(i1, integers);
		System.out.println("added Integer " + i + ", integer.size:" + integers.size());
	}

}
