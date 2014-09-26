import java.util.Scanner;
public class FindDigits {
	
	static class Pair{
		
		char[] s;
		int a;
		public Pair(char[] s, int a){
			
			this.s = s;
			this.a = a;
		}
	}
	
	public static void main(String[] args){
		
		Scanner in = new Scanner(System.in);
		
		int T = Integer.parseInt(in.nextLine());
		
		Pair[] pairs = new Pair[T];
		
		for(int i=0; i<T; i++){
			
			String s = in.nextLine();
			
			pairs[i] = new Pair(s.toCharArray(), Integer.parseInt(s));
		}
		
		for(int i=0; i<T; i++){
			
			int count = 0;
			
			for(int j = 0; j<pairs[i].s.length; j++){
				
				if(pairs[i].s[j] == '0') continue;
				
				if(pairs[i].a%Integer.parseInt(""+pairs[i].s[j]) == 0){
					
					count++;
				}
			}
			
			System.out.println(count);
		}
	}

}
