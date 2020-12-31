
package hackerrank;

import java.util.Scanner;


public class Java_Substring {
    
    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);
        String S = in.next();
        int start = in.nextInt();
        int end = in.nextInt();
        
        int length=S.length();
        System.out.println("length "+length);
        
        String rslt=S.substring(start, end);
        System.out.println(rslt);
    }
    
}
