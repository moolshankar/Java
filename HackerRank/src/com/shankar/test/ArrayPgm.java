package tyagi.pgms.MakeMyTrip;

import java.util.*;

class ArrayPgm {
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
        Scanner sc =  new Scanner(System.in);
        int N = sc.nextInt();
        String str = sc.next();
        int q = sc.nextInt();
        for (int  i=0; i<q ;i++){
        	String X = sc.next();
        	String Y = sc.next();
        	int Xc = str.replaceAll(X, X+" ").split(" ").length - 1;
        	int Yc = str.replaceAll(Y, Y+" ").split(" ").length - 1;
        	System.out.println(Xc*Yc);
        }

        
    }
}