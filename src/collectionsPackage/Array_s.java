package collectionsPackage;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Array_s {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String name= "Ajit Roshan Soy";
		
		ArrayList<Character> charArray= new ArrayList<>();
		
		for(int i=0; i< (name.length()); i++) {
			if(name.charAt(i) != ' ') {
				charArray.add( name.charAt(i) );
			}			
		}
		System.out.println("array collection is  : "+charArray);	
		
		Collections.sort(charArray);
		//based on ASCII code sorted
		System.out.println("new char_array contains :: "+charArray);
		
		
		
		//
		int numbers[] = new int[] {1,0,5,3,9,8,66,4,2};
		
		for(int i =0; i< (numbers.length); i++ ) {
			System.out.print(numbers[i]+" ");
		}		
		
		System.out.println(" ");
		Arrays.sort(numbers);		
		
		for(int i =0; i< (numbers.length); i++ ) {
			System.out.print(numbers[i]+ " ");
		}
		
	}

}
