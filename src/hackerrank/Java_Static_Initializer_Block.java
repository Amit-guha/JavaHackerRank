package hackerrank;

import java.util.Scanner;

public class Java_Static_Initializer_Block {

    static int B, H;
    static boolean flag;

    static {

        Scanner input = new Scanner(System.in);
        B = input.nextInt();
        H = input.nextInt();

        if (B > 0 && H > 0) {
            flag = true;
        }
        if (B<=0 || H<=0) {
            System.out.println("java.lang.Exception: Breadth and height must be positive");
        }

    }

    public static void main(String[] args) {
        if (flag) {
            int area = B * H;
            System.out.print(area);
        }
    }

}
