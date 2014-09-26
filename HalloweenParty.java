import java.io.*;
import java.math.*;
import java.util.*;
import java.text.*;

public class HalloweenParty {

	public static void main(String[] args){
		
		Scanner in = new Scanner(System.in);
		
		int number_of_lines = Integer.parseInt(in.nextLine());
		
		int[] cuts = new int[number_of_lines];
		
		for(int i=0; i<number_of_lines; i++){
			
			cuts[i] = in.nextInt();
		}
		
		for(int i=0; i< number_of_lines; i++){
			
			BigInteger integer = BigInteger.valueOf(cuts[i]);
			
			BigInteger two = BigInteger.valueOf(2);
			
			System.out.println( (integer.divide(two)).multiply((integer.divide(two).add(integer.remainder(two)))));
		}
		
		in.close();
	}
}
