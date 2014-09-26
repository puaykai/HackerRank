import java.util.Scanner;
public class FillingJars {

	public static void main(String[] args){
		
		Scanner in = new Scanner(System.in);
		
		String[] array = in.nextLine().split(" ");
		
		long number_of_jars = Long.parseLong(array[0]);
		
		int number_of_lines = Integer.parseInt(array[1]);
		
		long total = 0;
		
		for(int i=0; i<number_of_lines; i++){
			
			array = in.nextLine().split(" ");
			
			long a = Long.parseLong(array[0]);
			
			long b = Long.parseLong(array[1]);
			
			long k = Long.parseLong(array[2]);
			
			total += (b-a+1) * k;
		}
		
		System.out.println(total/number_of_jars);
	}
}
