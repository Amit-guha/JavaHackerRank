
package hackerrank;

import java.util.Scanner;


public class Java_1D_Array {
    
    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);
        
        int num=input.nextInt();
        int [] javaArray=new int[num];
        
        for (int i = 0; i < javaArray.length; i++) {
            
            javaArray[i]=input.nextInt();
        }
        
        for (int i : javaArray) {
            System.out.println(i);
        }
    }
    
}
