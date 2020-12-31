
package hackerrank;

import java.util.Arrays;
import java.util.Scanner;

/*

Two strings are called anagrams if they contain same set of characters but in different order.

"keep ? peek", "Mother In Law - Hitler Woman".

*/


public class Java_Anagrams {
    
     static boolean isAnagram(String a, String b) {
        int l1=a.length();
        int l2=b.length();
        
        boolean status=true;
        
        if(l1!=l2){
            status=false;
            
        }
        else{
           /* char [] s1=a.toLowerCase().toCharArray();
            char [] s2=b.toLowerCase().toCharArray();
            
            Arrays.sort(s1);
            Arrays.sort(s2);
            
            status=Arrays.equals(s1, s2);*/
           
           char temp;
        String sortedlist="";
        String sortedlist1="";
        char []a1=a.toLowerCase().toCharArray();
        char []a2=b.toLowerCase().toCharArray();
        
        for (int i = 0; i < l1; i++) {
            for (int j = 0; j < l1; j++) {
                if (a1[i]<a1[j]) {
                    temp=a1[i];
                    a1[i]=a1[j];
                    a1[j]=temp;
                    
                    
                }
            }
            
        }
        
         for (int i = 0; i < l2; i++) {
            for (int j = 0; j < l2; j++) {
                if (a2[i]<a2[j]) {
                    temp=a2[i];
                    a2[i]=a2[j];
                    a2[j]=temp;
                    
                    
                }
            }
            
        }
        
        
        for (int k = 0; k < l1; k++) {
            sortedlist=sortedlist+a1[k];
        }
       // System.out.println(sortedlist);
      
         for (int k = 0; k < l2; k++) {
            sortedlist1=sortedlist1+a2[k];
        }
       //System.out.println(sortedlist1);
           
         for (int i = 0; i < l1; i++) {
            if(sortedlist.charAt(i)!=sortedlist1.charAt(i)){
                status=false;
                break;
            }
            else
                 status=true;
        }   
        
           
        }
        return status;
    }

    
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String a = scan.next();
        String b = scan.next();
        scan.close();
        boolean ret = isAnagram(a, b);
        System.out.println( (ret) ? "Anagrams" : "Not Anagrams" );

}
    
}
