
package hackerrank;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 * @author amitguho
 * 12:19 AM
 * 20.06.2020
 */
//Hackerrank------------->>>>Valid UserName Regular Expression
public class Valid_username_Regular_Expression {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int n=input.nextInt();
        
   
        String reg="^[a-zA-Z]\\w{7,29}$";
        for (int i = 0; i < n; i++) {
            String s=input.next();
            
                 Pattern p=Pattern.compile(reg);
            Matcher m=p.matcher(s);
            
            if(m.matches()==true){
                System.out.println("Valid");
            }
            else
            {
                System.out.println("Invalid");
            }
        }
       
    }
}
