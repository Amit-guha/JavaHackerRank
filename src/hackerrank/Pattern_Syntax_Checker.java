
package hackerrank;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.regex.PatternSyntaxException;

public class Pattern_Syntax_Checker {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
       int testCase=Integer.parseInt(input.nextLine());
       // System.out.println(testCase);
       
        while (input.hasNext()) {
            String pattern=input.nextLine();
           
            try {
                 Pattern.compile(pattern);
                 System.out.println("Valid");
            }catch(PatternSyntaxException ex){
                System.out.println("Invalid");
            }
         
        }
       
    }
    
}
