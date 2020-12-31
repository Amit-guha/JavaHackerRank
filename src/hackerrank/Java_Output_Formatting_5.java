
package hackerrank;

import java.util.Scanner;


public class Java_Output_Formatting_5 {
    
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in); 
        int a;
       System.out.println("================================");
        for (int i = 0; i < 3; i++) {
            
          String s=input.next();
           a=input.nextInt();  
           
          String str=String.format("%03d", a);//Leading zero before digit
          //3=total three character; 
          
           System.out.printf("%-15s%s\n",s,str);
        }
        System.out.println("================================");
        
      
    }
}
