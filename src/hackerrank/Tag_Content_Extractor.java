package hackerrank;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 * @author amitguho 11:40 PM 25 June 2020
 */
// The problem describe about the html code 
public class Tag_Content_Extractor {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int testCases = Integer.parseInt(in.nextLine());
        while (testCases > 0) {
            String line = in.nextLine();
            Pattern p = Pattern.compile("<(.+)>([^<]+)</\\1>");
            Matcher m = p.matcher(line);
            Boolean matchfound = false;
            while (m.find()) {
                System.out.println(m.group(2));
                matchfound = true;
            }
            if (!matchfound) {
                System.out.println("None");
            }

            testCases--;
        }

    }

}
