import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;

public class UtopianTree {

	static int getHeight(int N){
		
		int height = 1;
		
		for(int  i = 0; i< N; i++){
			
			if(i % 2 == 0){
				
				height *= 2;
				
			}else{
				
				height++;
			}
		}
		
		return height;
	}
	
	public static void main(String[] args){
		
		Scanner in = new Scanner(System.in);
		
		int number_of_test_case = in.nextInt();
		
		for(int i=0; i<number_of_test_case; i++){
			
			System.out.println(getHeight(in.nextInt()));
		}
	}
}
