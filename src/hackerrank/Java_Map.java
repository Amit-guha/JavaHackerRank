
package hackerrank;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 *
 * @author amitguho
 * 12:07 AM
 * 02.07.2020
 */
public class Java_Map {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Map<String,Integer>map=new HashMap<>();
		int n=in.nextInt();//number of input
		in.nextLine();
		for(int i=0;i<n;i++)
		{
			String name=in.nextLine();//input--->name
			int phone=in.nextInt();//input---->>PHone
                        map.put(name, phone);
			in.nextLine();
		}
		while(in.hasNext())
		{
			String s=in.nextLine();//QueryName
                       if(map.containsKey(s)){
                           Integer queryresult=map.get(s);
                           System.out.println(s+"="+queryresult);
                       }else{
                           System.out.println("Not found");
                       }
                        
                        
		}
    }
}
