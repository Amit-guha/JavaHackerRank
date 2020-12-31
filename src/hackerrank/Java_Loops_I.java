
package hackerrank;

import java.util.Scanner;


public class Java_Loops_I {
    
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int N;
        N=input.nextInt();
        
        for (int i = 1; i <= 10; i++) {
            System.out.println( N+ " x "+ i+ " = "+N*i);
            
            
        }
    }
    
}
