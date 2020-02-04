package model;

import java.util.HashSet;
import java.util.Set;

/**
* This class defines the basic operations between two sets. 
* @author Luis Felipe Sanchez Vega
*/

public class SetOperations {
	
	
	/**
	 * The constructor of the class <br><br> 
	 */
	public SetOperations() {



	}
	
	/**
	 * This method finds the union between two given sets <br><br> 
	 * <b>Pre: </b> The two sets must not be null <br><br>
	 * @param setA The first set <br><br>
	 * @param setB The second set <br><br>
	 * @return One set with the elements of the two first sets <br><br>
	 */
	public Set<String> union(Set<String> setA, Set<String> setB){

		Set<String> setC = new HashSet<String>();

		setC.addAll(setA);
		setC.addAll(setB);

		return setC;

	}
	
	/**
	 * This method finds the intersection between two given sets <br><br> 
	 * <b>Pre: </b> The two sets must not be null <br><br>
	 * @param setA The first set <br><br>
	 * @param setB The second set <br><br>
	 * @return One set with the common elements of the two first sets <br><br>
	 */
	public Set<String> intersection(Set<String> setA, Set<String> setB){

		Set<String> setC = new HashSet<String>();

		for (String e : setA) {
			if (setB.contains(e)) {
				setC.add(e);
			}
		}

		return setC;
	}
	
	
	/**
	 * This method finds the diference between two given sets <br><br> 
	 * <b>Pre: </b> The two sets must not be null <br><br>
	 * @param setA The first set <br><br>
	 * @param setB The second set <br><br>
	 * @return One set whose elements are within setA but not within setB <br><br>
	 */
	public Set<String> diference(Set<String> setA, Set<String> setB){

		Set<String> setC = new HashSet<String>();

		for (String e : setA) {
			if (!setB.contains(e)) {
				setC.add(e);
			}
		}

		return setC;
	}
	
	
}