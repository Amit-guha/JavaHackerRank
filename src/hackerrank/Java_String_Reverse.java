package hackerrank;

import java.util.Scanner;

public class Java_String_Reverse {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String A = input.nextLine();

        StringBuffer sb = new StringBuffer(A);

        String rev = sb.reverse().toString();

        if (rev.equals(A)) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}
