import java.io.*;
import java.math.*;
import java.util.*;
import java.text.*;

public class LoveLetterMystery {

	public static void main(String[] args){
		
		Scanner in  = new Scanner(System.in);
		
		int number_of_lines = Integer.parseInt(in.nextLine());
		
		String[] words = new String[number_of_lines];
		
		for(int i=0; i<number_of_lines; i++){
			
			words[i] = in.nextLine();
		}
		
		for(int i=0; i< number_of_lines; i++){
			
			double middle = ((double)words[i].length()-1.0)/2;
			
			char[] array = words[i].toCharArray();
			
			int total_changes = 0;
			
			for(int j=0; j<middle; j++){
				
				int other_index = (int)Math.round(middle + (middle - j));
				
				total_changes += Math.max(array[j], array[other_index]) - Math.min(array[j], array[other_index]);
			}
			
			System.out.println(total_changes);
		}
		
		in.close();
	}
}
