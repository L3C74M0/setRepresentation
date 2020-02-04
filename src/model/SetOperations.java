package model;

import java.util.HashSet;
import java.util.Set;

public class SetOperations {
	
	public SetOperations() {
		
		
		
	}
	
	public Set<String> union(Set<String> setA, Set<String> setB){
		
		Set<String> setC = new HashSet<String>();
		
		setC.addAll(setA);
		setC.addAll(setB);
		
		return setC;
		
	}
	
}