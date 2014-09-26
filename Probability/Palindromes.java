package Probability;
/**
 * 
 * You have a string and you randomly pick two indices of the string and change their position.
 * What is the expected number of swaps needed to form a palindrome?
 * 
 * Example: abb has expectation of 3 swaps. 
 * 
 * Form equations in E(abb), E(bab), E(bba), then solve using gaussian elimination
 * 
 * **/
public class Palindromes {
	
	public static void printMat(double[][] mat){
		
		for(int i=0; i<mat.length; i++){
			
			for(int j=0; j<mat[0].length; j++){
				
				System.out.print(mat[i][j]+"\t");
			}
			System.out.println("");
		}
		System.out.println("------------------------------------");
	}
	
	public static double[][] row_reduction(double[][] matrix){
		
		for(int i=0; i<matrix.length; i++){
			
			for(int k=0; k<matrix.length; k++){
				
				if(i==k){
					
					double dividend = matrix[i][i];
					
					for(int j=0; j<matrix[0].length; j++){
						
						matrix[i][j] /= dividend;
					}
				}else{
					
					double ratio = -matrix[k][i] / matrix[i][i];
					
					for(int j=0; j<matrix[0].length; j++){
						
						matrix[k][j] +=ratio *matrix[i][j];
					}
				}
				//printMat(matrix);
			}
		}
		
		return matrix;
	}

	public static boolean isPalindrome(char[] x){
		
		for(int i=0; i<x.length; i++){
			
			if(x[i] != x[x.length-i-1]){
				
				return false;
			}
		}
		
		return true;
	}
	
	public static char[] makeCopy(char[] a){
		
		char[] b = new char[a.length];
		
		for(int i=0; i<a.length; i++){
			
			b[i] = a[i];
		}
		
		return b;
	}
	
	public static void main(String[] args) {
		
		String x = "ababa";
		
		if(x.length() == 1) {
			
			System.out.println(0.0);
			
			return;
		}
		
		char[] array = x.toCharArray();
		
		double total_number_of_swaps = array.length *(array.length - 1) * 0.5;
		
		double[][] matrix = new double[(int)total_number_of_swaps][(int)total_number_of_swaps+1];
		
		int answer_row = -1;
		
		//TODO find all possible permutation and then check if each is a palindrome
		
		for(int i=0; i<array.length; i++){
			
			for(int j=i+1; j<array.length; j++){
				
				char[] new_array = makeCopy(array);
				
				char temp = new_array[i];
				
				char temp1 = new_array[j];
				
				new_array[i] = temp1;
				
				new_array[j] = temp;
				
				String result_string = new String(new_array);
				
				int main_index =(int)( (i/2.0) * ((2 * x.length()) - 3 - i) + j - 1);
				
				if(x.equals(result_string)) answer_row = main_index;
				
				//System.out.println(String.valueOf(new_array)+" "+isPalindrome(new_array)+" main index: "+main_index);
				if(isPalindrome(new_array)){
					
					for(int k=0; k<total_number_of_swaps+1; k++){
						
						if(k== main_index){
							
							matrix[main_index][k] = 1;
						}else{
							
							matrix[main_index][k] = 0;
						}
					}
					
				}else{
					
					for(int k=0; k<total_number_of_swaps; k++){
						
						if(k== main_index){
							
							matrix[main_index][k] = -((total_number_of_swaps-1)/total_number_of_swaps);
						}else{
							
							matrix[main_index][k] = (1.0/total_number_of_swaps);
						}
					}
					
					matrix[main_index][(int)total_number_of_swaps] = -1;
				}
			}
		}
		
		printMat(matrix);
		
		matrix = row_reduction(matrix);
		
		System.out.println(matrix[answer_row][(int) total_number_of_swaps]);
	}

}
