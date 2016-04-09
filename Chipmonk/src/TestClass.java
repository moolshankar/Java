/* IMPORTANT: Multiple classes and nested static classes are supported */

/*
 * uncomment this if you want to read input.
import java.io.BufferedReader;
import java.io.InputStreamReader;
*/
import java.util.*;

class TestClass {
    private static int age;

	public static void main(String args[] ) throws Exception {
        /*
         * Read input from stdin and provide input before running

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String line = br.readLine();
        int N = Integer.parseInt(line);
        for (int i = 0; i < N; i++) {
            System.out.println("hello world");
        }
        */
        Scanner in = new Scanner(System.in);
        int p = in.nextInt();
        int q = in.nextInt();
        long count = 0;
        String[] invited = new String[p];
        String[] all = new String[q];
        for (int i=0;i<p; i++){
        	invited[i] = in.next();
        }
        
        for (int j=0;j<q; j++){
        	String temp = in.next();
        	 for (int i=0;i<p; i++){
        			if (invited[i] == temp){
        				++count;
        				invited[i] = "";
        			}
        			else
        			  {
        			  	if (temp.getClass().getName().equals("Integer")){
        			  		int age;
        			  		 age = Integer.parseInt(temp);
        			  		if (age>20){
        			  			++count;
        			  		}
        			  	}
        			  }
        }
        
        }

        System.out.println(count);
    }
}

