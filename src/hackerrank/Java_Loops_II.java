
package hackerrank;

import java.util.Scanner;


public class Java_Loops_II {
    
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int a,b,n;
        int t=input.nextInt();
        for (int i = 0; i < t; i++) {
         a=input.nextInt();
         b=input.nextInt();
         n=input.nextInt();
        
        int sum=a;
        for (int j = 0; j < n; j++) {
            sum=sum+((int)Math.pow(2, j))*b;
            System.out.print(sum+" ");
            
        }
            System.out.println("");
        
        
        }
      
        
       
    }
    
}
