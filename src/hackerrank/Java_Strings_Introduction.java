
package hackerrank;

import java.util.Scanner;


public class Java_Strings_Introduction {
    
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        String A=input.next();
        String B=input.next();
        
        int count=A.length() + B.length();
        System.out.println(count);
        
        int AsciiValue_1=A.codePointAt(0);
        int AsciiValue_2=B.codePointAt(0);
        
       // System.out.println(AsciiValue_1);
        //System.out.println(AsciiValue_2);
        
        if(AsciiValue_1<=AsciiValue_2){
            System.out.println("No");
        }
        else
            System.out.println("Yes");
        
        String out1=A.substring(0, 1).toUpperCase()+A.substring(1);
        String out2=B.substring(0, 1).toUpperCase()+B.substring(1);
             //First substring returns  character(end range - begin range)
             //Second substirng returns index 1 to all character
             
            System.out.println(out1+" "+out2);
        
    }
    
}
