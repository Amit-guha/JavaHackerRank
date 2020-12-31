
package hackerrank;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Scanner;

/**
 *
 * @author amitguho
 * 04:34 PM
 * 31.07.2020
 */
public class Java_Primality_Test {
    
    private static final Scanner scanner = new Scanner(System.in);
    
    public static void main(String[] args) {
         String n = scanner.nextLine();

        scanner.close();
        BigInteger b=new BigInteger(n);
        
        Boolean bol=b.isProbablePrime(1);
         if(bol==true){
             System.out.println("prime");
         }else{
             System.out.println("not prime");
         }
       
    }
}
