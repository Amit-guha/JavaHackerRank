
package hackerrank;

import java.util.Scanner;


public class EOF {
    
    
    public static void main(String[] args) {
         
        Scanner input=new Scanner(System.in);
        String s;
        int i=0;
        while(input.hasNext()){
             s=input.nextLine();
             i++;
             System.out.println(i+" "+ s);
        }
        
        
    }
}
