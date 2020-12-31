
package hackerrank;

import java.util.Scanner;


public class Java_If_Else_3 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int n;
         n=input.nextInt();
         
         if(n%2!=0){
             System.out.println("Weird");
         }
          if((n>=2 && n<=5) && n%2==0){
             System.out.println("Not Weird");
         }
          if((n>=6 && n<=20) && n%2==0){
             System.out.println("Weird");
         }
         if(n%2==0 && n>20)
             System.out.println("Not Weird");
    }
    
}
