package hackerrank;

import java.util.Scanner;
import java.util.*;

/**
 *
 * @author amitguho
 */
public class Java_Stack {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            String input = sc.next();
            Stack<Character> s = new Stack<>();
            if (input.isEmpty()) {
                System.out.println("true");
            }
            for (int i = 0; i < input.length(); i++) {
                char c = input.charAt(i);
                // System.out.println(input.length());
                // System.out.println(i);
                if (c == '[' || c == '{' || c == '(') {
                    s.push(c);
                    //System.out.println(s.push(c));
                    if(s.isEmpty()==false && i==input.length()-1){
                        System.out.println("false");
                    }
                } else if (s.isEmpty() == false) {
                    if ((c == ']' && s.peek() == '[') || (c == '}' && s.peek() == '{') || (c == ')' && s.peek() == '(')) {
                        s.pop();

                        if (s.isEmpty() == true && i == input.length() - 1) {
                            System.out.println("true");
                        }
                       else if(s.isEmpty()==false && input.length()-1==i){
                            System.out.println("false");
                        }
                    }
                    else{
                        if (c == ']' || c == '}' || c == ')')
                        System.out.println("false");
                        break;
                        
                    }

                } else if (c == ']' || c == '}' || c == ')'){
                    System.out.println("false");
                    break;
                }
               

            }

        }
    }
}
