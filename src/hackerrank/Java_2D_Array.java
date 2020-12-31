package hackerrank;

import java.util.Scanner;

public class Java_2D_Array {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int maxvalue = Integer.MIN_VALUE; //maxvalue=0,when use minvalue
                                           //them maxvalue contains the lower value

        int sum, i, j;
        int[][] A = new int[6][6];
        for (i = 0; i < 6; i++) {
            for (j = 0; j < 6; j++) {

                A[i][j] = input.nextInt();
            }
        }

        // Number of top-left cells in a hour glass is equal to (R-2)*(C-2). 
        //Here ,R=C=6
        //6-2=4
        for (i = 0; i < 4; i++) {//loop will be iterated 4 time
            for (j = 0; j < 4; j++) {//loop 4 time

                sum = A[i][j] + A[i][j + 1] + A[i][j + 2] + A[i + 1][j + 1] + A[i + 2][j]
                        + A[i + 2][j + 1] + A[i + 2][j + 2];//rule to sum of hourglass
                //System.out.println(sum + "sum");

                if (sum > maxvalue) {//0>0
                    maxvalue = sum;
                }
               // System.out.println(maxvalue);

            }

        }

        System.out.println(maxvalue);

    }
}
