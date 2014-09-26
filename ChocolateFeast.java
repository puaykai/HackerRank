import java.util.Scanner;

public class ChocolateFeast {
	
	public static int chocolate(int money, int wrapper,int price, int wrapper_price){
		
		if(money < price && wrapper<wrapper_price) return 0;
		
		return (money/price) + (wrapper/wrapper_price) + chocolate(money - ((money/price) * price) ,  wrapper - ((wrapper/wrapper_price) * wrapper_price) +(wrapper/wrapper_price) + (money/price), price, wrapper_price);
	}
	
	public static void main(String[] args){
		
		Scanner in  = new Scanner(System.in);
		
		int number_of_cases = Integer.parseInt(in.nextLine());
		
		int[][] cases = new int[number_of_cases][3];
		
		for(int i=0; i<number_of_cases; i++){
			
			String line = in.nextLine();
			
			String[] array = line.split(" ");
			
			cases[i][0] = Integer.parseInt(array[0]);
			
			cases[i][1] = Integer.parseInt(array[1]);
			
			cases[i][2] = Integer.parseInt(array[2]);
			
		}
		
		for(int i=0; i<number_of_cases; i++){
			
			
			System.out.println(chocolate(cases[i][0], 0,cases[i][1], cases[i][2]));
		}
		
	}

}
