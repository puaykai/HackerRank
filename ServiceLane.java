import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;

public class ServiceLane {

	public static void main(String[] args){
		
		Scanner in = new Scanner(System.in);
		
		String first_line = in.nextLine();
		
		String[] temp = first_line.split(" ");
		
		int length_of_free_way = Integer.parseInt(temp[0]);
		
		int number_of_test_case = Integer.parseInt(temp[1]);
		
		String second_line = in.nextLine();
		
		temp = second_line.split(" ");
		
		int[] highway = new int[length_of_free_way];
		
		for(int i=0; i<highway.length; i++){
			
			highway[i] = Integer.parseInt(temp[i]);
		}
		
		for(int i=0; i<number_of_test_case; i++){
			
			temp = in.nextLine().split(" ");
			
			int start_index = Integer.parseInt(temp[0]);
			
			int end_index = Integer.parseInt(temp[1]);
			
			int vehicle = 3;
			
			for(int j=start_index; j<=end_index; j++ ){
				
				vehicle = Math.min(vehicle, highway[j]);
			}
			
			System.out.println(vehicle);
		}
		
		in.close();
	}
}
