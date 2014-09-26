import java.util.ArrayList;
import java.util.Scanner;
import java.util.HashSet;
public class GameOfThronesI {
	
    public static void main(String[] args) {
        Scanner myScan = new Scanner(System.in);
        String inputString = myScan.nextLine();
       
        // Assign ans a value of YES or NO, depending on whether or not inputString satisfies the required condition
        
        HashSet<Character> set = new HashSet<Character>();
        
        char[] input_array = inputString.toCharArray();
        
        for(int i=0; i<input_array.length; i++){
        	
        	set.add(input_array[i]);
        }
        ArrayList<Character> list = new ArrayList<Character>(set);
        
        int[] count = new int[set.size()];
        
        for(int i=0; i<input_array.length; i++){
        	
        	count[list.indexOf(input_array[i])]++;
        }
        
        boolean has_odd = false;
        
        for(int i=0; i<count.length; i++){
        	
        	if(has_odd){
        		
        		if(count[i]%2==1){
        			System.out.println("NO");
        			return;
        		}
        	}else{
        		
        		if(count[i]%2==1){
        			has_odd=true;
        		}
        	}
        }
        
        System.out.println("YES");
        myScan.close();
    }

}
