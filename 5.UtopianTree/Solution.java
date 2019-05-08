/**
 * HackerRank URL: https://www.hackerrank.com/challenges/between-two-sets/problem
 * @author Thodoris Kouleris
 */
import java.util.*;

public class Solution {
    
    // Complete the utopianTree function below.
    static int utopianTree(int n) {
        int treeHeight = 0;
        for(int i = 0 ; i <= n ; i++){
            if(i%2 == 0 ) treeHeight++;
            if(i%2 != 0 ) treeHeight = treeHeight * 2;
        }
        
        return treeHeight;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        
        int t = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int tItr = 0; tItr < t; tItr++) {
            int n = scanner.nextInt();
            scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

            int result = utopianTree(n);
            System.out.println(result);

        }
        scanner.close();
    }
}