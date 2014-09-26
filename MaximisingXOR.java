import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class MaximisingXOR {
/*
 * Complete the function below.
 */

    static int maxXor(int l, int r) {
        
        int largest_num = Integer.MIN_VALUE;
        
        int number_of_digits = (int) Math.ceil(Math.log(Math.max(l, r)) / Math.log(2));
        
        for(int i=l; i<=r; i++){
            
            for(int j=i; j<=r; j++){
                
                int num = 0;
                
                int first_num = i;
                
                int second_num = j;
                
                for(int k=number_of_digits-1; k>=0;k-- ){
                    
                    boolean i_has_num = (first_num - Math.pow(2, k)) >= 0;
                    
                    boolean j_has_num = (second_num - Math.pow(2, k)) >= 0;
                    
                    if(i_has_num) first_num -= (int)Math.round(Math.pow(2,k));
                    
                    if(j_has_num) second_num -= (int) Math.round(Math.pow(2,k));
                    
                    if((i_has_num && !j_has_num) || (!i_has_num && j_has_num)){
                        
                        num += (int)Math.round(Math.pow(2, k));
                    }
                    
                }
                
                if(num >= largest_num) System.out.println(i+" : "+j+" : "+num);
                
                largest_num = Math.max(largest_num, num);
            }
            
        }
        
        return largest_num;
    }


    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int res;
        int _l;
        _l = Integer.parseInt(in.nextLine());
        
        int _r;
        _r = Integer.parseInt(in.nextLine());
        
        res = maxXor(_l, _r);
        System.out.println(res);
        
    }
}