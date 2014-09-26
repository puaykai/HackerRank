import java.util.Scanner;
//A number is fib iff either 5n^2 + 4 or 5n^2 - 4 is perfect square
public class IsFibo {

	public static boolean isSquare(double x){
		
		double a = Math.floor(Math.sqrt( x ));
		
		return a*a == x;
	}
	
	public static boolean isFib(double n){
		
		return isSquare(5*n*n + 4) || isSquare(5*n*n - 4);
	}
	
	public static void main(String[] args){
		
		Scanner in = new Scanner(System.in);
		
		int number_of_lines = Integer.parseInt(in.nextLine());
		
		for(int i=0; i<number_of_lines; i++){
			
			if(isFib(Double.parseDouble(in.nextLine()))){
				
				System.out.println("IsFibo");
			}else{
				
				System.out.println("IsNotFibo");
			}
		}
	}
}
