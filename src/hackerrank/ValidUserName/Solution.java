
package hackerrank.ValidUserName;

import java.util.Scanner;

/**
 *
 * @author amitguho
 * 09:44 PM
 * 24.06.2020
 */
public class Solution {
     private static final Scanner scan = new Scanner(System.in);
    public static void main(String[] args) {
          int n = Integer.parseInt(scan.nextLine());
        while (n-- != 0) {
            String userName = scan.nextLine();

            if (userName.matches(UsernameValidator.regularExpression)) {
                System.out.println("Valid");
            } else {
                System.out.println("Invalid");
            }           
        }
    }
    
}
