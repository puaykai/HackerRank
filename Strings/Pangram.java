package Strings;
import java.util.*;
import java.io.*;
/**
 * 
 * Pangrams are sentences that contains all the letters in the alphabet at least once
 * 
 * A-Z : 65-90
 * a-z : 97-122
 * **/
public class Pangram {
	
	public static int toIndex(char a){
		
		if(a<97) return a-65;
		
		return a-97;
		
	}
	
	public static void main(String[] args){
		
		Scanner in = new Scanner(System.in);
		char[] char_array = in.nextLine().toCharArray();
		boolean[] alphabets_used = new boolean[26];
		
		if(char_array.length < 26) {
			
			System.out.println("not pangram");
			
			return;
		}
		
		for(int i=0; i<char_array.length; i++){
			
			if(char_array[i]<65 || (char_array[i] > 90 && char_array[i] <97) || char_array[i]>122) continue;
			
			if(!alphabets_used[toIndex(char_array[i])]) {
				
				alphabets_used[toIndex(char_array[i])] = true;
			}
		}
		
		for(int i=0; i<alphabets_used.length; i++){
			
			if(!alphabets_used[i]){
				
				System.out.println("not pangram");
				
				return ;
			}
		}
		
		System.out.println("pangram");
	}

}
