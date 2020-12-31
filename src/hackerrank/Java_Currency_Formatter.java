
package hackerrank;

import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;

public class Java_Currency_Formatter {
    
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        double payment=input.nextDouble();
        
        String france=NumberFormat.getCurrencyInstance(Locale.FRANCE).format(payment);
        
        
        String us=NumberFormat.getCurrencyInstance(Locale.US).format(payment);
       
        
        String china=NumberFormat.getCurrencyInstance(Locale.CHINA).format(payment);
        
        
        String india=NumberFormat.getCurrencyInstance(new Locale("en","IN")).format(payment);
       
        
        
        System.out.println("US: " + us);
        System.out.println("India: " + india);
        System.out.println("China: " + china);
        System.out.println("France: " + france);
        
        
    }
}
