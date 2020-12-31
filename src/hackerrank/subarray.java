package hackerrank;

import java.util.Scanner;

public class subarray {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int n, count = 0;
        n = input.nextInt();
        int[] Array = new int[n];
        for (int i = 0; i < n; i++) {
            Array[i] = input.nextInt();
        }

        // System.out.println(count);
        for (int i = 0; i < n; i++) {
            int sum = 0;
            for (int j = i; j < n; j++) {

                sum = sum + Array[j];//when i=0,j=0,check itself positive or negative
                //when i=0,j=1,sum of index previous and present index
                //this procedure maintain until the condition is breaked
                if (sum < 0) {
                    count++;
                }

            }

        }

        System.out.println(count);
    }
}
