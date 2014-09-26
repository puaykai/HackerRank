import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;

public class SolveMeFirst {

	static int solveMeFirst(int _a, int _b){
		
		return _a + _b;
	}
	
	public static void main(String[] args){
		
		Scanner in = new Scanner(System.in);
		
		int _a = in.nextInt();
		
		int _b = in.nextInt();
		
		System.out.println(solveMeFirst(_a, _b));
		
		in.close();
	}
	
}
