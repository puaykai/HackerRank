import java.util.PriorityQueue;
import java.util.Scanner;
public class CutTheSticks {

	public static void main(String[] args){
		
		Scanner in = new Scanner(System.in);
		
		int number_of_sticks = Integer.parseInt(in.nextLine());
		
		String[] lengths_string = in.nextLine().split(" ");
		
		PriorityQueue<Integer> pq = new PriorityQueue<Integer>();
		
		for(int i=0; i<number_of_sticks; i++){
			
			pq.add(Integer.parseInt(lengths_string[i]));
		}
		
		while(!pq.isEmpty()){
			
			System.out.println(pq.size());
			
			PriorityQueue<Integer> new_pq = new PriorityQueue<Integer>();
			
			int min = pq.peek();
			
			while(!pq.isEmpty()){
				
				int element = pq.remove();
				
				if(element - min >0){
					
					new_pq.add(element-min);//TODO add to array first then make queue will make faster by factor of log n
				}
			}
			
			pq.addAll(new_pq);
		}
	}
}
