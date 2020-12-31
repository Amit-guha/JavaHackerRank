
package hackerrank;

import java.util.ArrayList;
import java.util.Scanner;

public class Java_Arraylist {
    
    public static void main(String[] args) {
        
        Scanner input=new Scanner(System.in);
         int n=input.nextInt();
        
      ArrayList<Integer>[] number=new ArrayList[n];//Array of arraylist
    
   
        for (int i = 0; i < n; i++) {
            int loop=input.nextInt();// 5 lines
            number[i]=new ArrayList();//create arrylist
            for (int j = 0; j < loop; j++) {//takes five input
                number[i].add(input.nextInt());// oth index get 41 77 74 22 44
                                //because it's a 2D Array and dynamic arraylist
                                //0 th row 1 col    
            }
            
        }
       
        int query=input.nextInt();
         for (int i = 0; i < query; i++) {
          int  index =input.nextInt();
          int  output =input.nextInt();
           
            try{
                System.out.println(number[index-1].get(output-1));
            }catch(Exception e){
                System.out.println("ERROR!");
                
            }
         
        }
       
  
        
        
    }
    
}
