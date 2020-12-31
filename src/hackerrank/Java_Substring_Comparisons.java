
package hackerrank;

import java.util.Scanner;


public class Java_Substring_Comparisons {
    
     public static String getSmallestAndLargest(String s, int k) {
        String smallest = s.substring(0, k);//wel
        String largest =s.substring(0, k);//wel

           for (int i = 0; i <=s.length()-k; i++) {
            String divide=s.substring(i, k+i);//wel

            if(smallest.compareTo(divide)>0){
                   smallest=divide;
                  // System.out.println(smallest);

           }

           if(largest.compareTo(divide)<0){
                largest=divide;
           }
                 

           }
        
        
       
        
        return smallest + "\n" + largest;
    }

    
    public static void main(String[] args) {
        
      /*  Scanner input=new Scanner(System.in);
        
        String s=input.next();
        int k=input.nextInt();
        
        for (int i = 0; i <=s.length()-k+1; i++) {
            String divide=s.substring(i, k+i);//i=starting index
                                           //k+i=ending index -1
          
            System.out.println(divide);
        }*/
      
       Scanner scan = new Scanner(System.in);
        String s = scan.next();
        int k = scan.nextInt();
        scan.close();
      
        System.out.println(getSmallestAndLargest(s, k));
      
      
      
        
    }
}
