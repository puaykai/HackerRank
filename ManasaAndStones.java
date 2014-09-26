import java.io.*;
import java.text.*;
import java.util.*;
import java.math.*;

public class ManasaAndStones {

	public static void main(String[] args){
		
		Scanner in = new Scanner(System.in);
		
		int number_of_test_cases = Integer.parseInt(in.nextLine());
		
		int[][] cases = new int[number_of_test_cases][3];
		
		for(int i=0; i<number_of_test_cases; i++){
			
			for(int j=0; j<3; j++){
				
				
				cases[i][j] = Integer.parseInt(in.nextLine());
				
			}
			
		}
		
		
		
		for(int i=0; i< number_of_test_cases; i++){
            
            ArrayList<Integer> bag_of_integers = new ArrayList<Integer>();
			
			for(int j=0; j<cases[i][0]; j++){
				
				int min = Math.min(cases[i][1], cases[i][2]);
				
				int max = Math.max(cases[i][1], cases[i][2]);
				
				int number = min * (cases[i][0] - j -1) + max * (j);
				
				if(!bag_of_integers.contains(number)) bag_of_integers.add(number);
			}
			
            for(int k=0; k<bag_of_integers.size(); k++){
			
			    System.out.print(bag_of_integers.get(k)+ " ");
		    }
            
            System.out.println("");
		}
		

		
		in.close();
	}
	
}
