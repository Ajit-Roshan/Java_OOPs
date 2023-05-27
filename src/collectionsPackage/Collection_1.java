package collectionsPackage;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Collection_1 {
	
	public static void main(String[] args) {
		
		String name= "ajit roshan soy";
		
		Set<Character> charSet= new HashSet<>();
		
		List<Character> charList= new ArrayList<>();
		
		for(int i=0; i<(name.length()); i++ ) {
			
			if(name.charAt(i) != ' ') {
				charSet.add( name.charAt(i) );
				charList.add(name.charAt(i));
			}			
		}
		System.out.println("setCollection contain :: "+charSet);
		System.out.println("setCollection contain :: "+charList);
		
		int num= Collections.frequency(charList, 'a');
		
		System.out.println(num);
			
	}	
}
