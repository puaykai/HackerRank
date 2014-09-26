package Strings;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
/**
 * 
 * Got two string x,y , find minimum number of changes to x such that x is anagram of y
 * **/

public class Anagram {
	
	public static void main(String[] args){
		
		Scanner in = new Scanner(System.in);
		
		int number_of_cases = Integer.parseInt(in.nextLine());
		
		for(int i=0; i<number_of_cases; i++){
			
			String line = in.nextLine();
			
			if(line.length()%2 ==1){
				
				 System.out.println(-1);
				 
				 continue;
			}
			
			ArrayList<Character> a = new ArrayList<Character>();
			
			ArrayList<Character> b = new ArrayList<Character>();
			
			char[] x = line.substring(0, line.length()/2).toCharArray();
			
			char[]  y = line.substring(line.length()/2,line.length()).toCharArray();
			
			for(int j=0; j<x.length; j++){
				
				a.add(x[j]);
			}
			
			for(int j=0; j<y.length; j++){
				
				b.add(y[j]);
			}
			
			Collections.sort(a);
			Collections.sort(b);
			
			//TODO find the longest common substring, then get the length to minus that lcs length
			//DP
			int[][] table = new int[x.length][2];
			
			for(int j=0; j<x.length; j++) {
				
				for(int k=0; k<y.length; k++) {
					
					if(j==0 && (a.get(j).equals(b.get(k)))){
						
						 table[j][1] = 1;
						 
						 continue;
					}
					
					if( a.get(j).equals(b.get(k))) {
						
						int value = table[j-1][0];
						
						table[j-1][1] = value+1;
					}
				}
				
				for(int k=0; k<y.length; k++){
					
					int value = table[k][1];
					
					table[k][0] = value;
				}
			}
			
			int max= Integer.MIN_VALUE;
			for(int j=0; j<x.length; j++){
				
				if(max<table[j][1]) max = table[j][1];
			}
			
			System.out.println(x.length-max);
		}
		
		
	}

}
