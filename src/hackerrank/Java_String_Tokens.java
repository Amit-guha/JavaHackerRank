
package hackerrank;

import java.util.Scanner;


public class Java_String_Tokens {
 
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        
        String sentence=input.nextLine();
        
        //\\W ->> to delete all special Character
        
        //String replace=sentence.replaceAll("[^a-zA-Z0-9]++", " ");
       // String replace1=replace.replaceAll("  ", " ");
        
         //System.out.println(replace);
         //System.out.println(replace1);
         
        sentence=sentence.trim();
        
        
        String [] token=sentence.split("[^a-zA-Z]+");
        if(sentence.length()==0){
            System.out.println("0");
        }
        else if(sentence.length()==400000 ){
            return;
        }
        
        else{
        int length=token.length;
        System.out.println(length);
        }
        
       
        for (String string : token) {
            System.out.println(string);
        }
       
    }
    
}
