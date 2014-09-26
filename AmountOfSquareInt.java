import java.io.IOException;
import java.util.*;


public class AmountOfSquareInt {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

			Scanner in = new Scanner(System.in);
			
			int a = Integer.parseInt(in.nextLine());
			
			double[][] questions = new double[a][2];
			
			for(int i=0; i<a; i++){
				
				String s = in.nextLine();
				
				String[] array = s.split(" ");
				
				questions[i][0] = Double.parseDouble(array[0]);
				
				questions[i][1] = Double.parseDouble(array[1]);
				
			}
			
			for(int i=0; i<a; i++){
				
				int answer = (int) (Math.floor(Math.sqrt(questions[i][1])) - Math.floor(Math.sqrt(questions[i][0])));
				
				if(Math.floor(Math.sqrt(questions[i][0])) == Math.sqrt(questions[i][0])){
					
					System.out.println(answer +1);
				}else{
					
					System.out.println(answer);
				}
			}
		
	}

}
