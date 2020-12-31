
package hackerrank;

import java.math.BigInteger;
import java.util.Scanner;

/**
 *
 * @author amitguho
 * 05:04 PM
 * 31.07.2020
 */
public class Java_BigInteger {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        
        BigInteger b,c;
        b = input.nextBigInteger();
        c=input.nextBigInteger();
        
        System.out.println(b.add(c));
        System.out.println(b.multiply(c));
       
    }
}
