import java.io.*;
import java.util.*;
import java.math.*;
import java.text.*;

public class GemStones {
	
	static boolean contains(char[] array, char element){
		
		boolean found = false;
		
		for(int i=0; i<array.length; i++){
			
			if(array[i] == element){
				
				found = true;
			}
		}
		
		return found;
	}

	public static void main(String[] args){
		
		Scanner in = new Scanner(System.in);
		
		int number_of_rocks = Integer.parseInt(in.nextLine());
		
		String[] rocks = new String[number_of_rocks];
		
		for(int i=0; i<number_of_rocks; i++){
			
			rocks[i] = in.nextLine();
		}

		ArrayList<Character> gem_elements = new ArrayList<Character>();
		
		char[] array = rocks[0].toCharArray();
		
		for(int i=0; i<rocks[0].length(); i++){
			
			if(!gem_elements.contains(array[i])) gem_elements.add(array[i]);
			
		}
		
		for(int i = 1; i < number_of_rocks; i++){
			
			char[] elements = rocks[i].toCharArray();
			
			for(int j=0; j<gem_elements.size(); j++){
				
				if(!contains(elements, gem_elements.get(j))){
					
					 gem_elements.remove(j);
					 
					 j=0;
				}
			}
			
		}

		System.out.println(gem_elements.size());
		
		in.close();
	}
}
