
package hackerrank;

import java.util.Scanner;

public class Java_Int_to_String {
    
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int n=input.nextInt();
        
        String s=Integer.toString(n);
        if(n==Integer.parseInt(s)){
            System.out.println("Good job");
        }
        else{
            System.out.println("Wrong answer");
        }
    }
}
