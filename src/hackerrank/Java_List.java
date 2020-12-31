
package hackerrank;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author amitguho
 * 11:13 PM
 * 01.06.2020
 */

//Problem Java list
//Now i am trying to solve the problem
public class Java_List {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
         ArrayList<Integer>number=new ArrayList<>();
        
        int N=input.nextInt();
        for (int i = 0; i < N; i++) {
           int L=input.nextInt();
           number.add(L);
        }
        int query=input.nextInt();
        
        
        for (int i = 0; i < query; i++) {
            String queryName=input.next();
            if(queryName.equals("Insert")){
                int index=input.nextInt();
                int value=input.nextInt();
                number.add(index,value);        
            }
            if(queryName.equals("Delete")) {
                int delindex=input.nextInt();
                number.remove(delindex);
            }
        }
        
        for (Integer integer : number) {
            System.out.print(integer+" ");
        }
    }

   
   
}
