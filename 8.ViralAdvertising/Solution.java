/**
 * HackerRank URL: https://www.hackerrank.com/challenges/strange-advertising/problem
 * @author Thodoris Kouleris
 */
import static java.lang.Math.floor;
import java.util.*;

public class Solution {
            
    static int viralAdvertising(int n) {        
        int shared = 5;
        int liked;                    
        int totalLikes = 0;
        
        for( int i = 0 ; i < n ; i++){
            liked = calculateLikesForShares( shared);
            totalLikes = totalLikes + (int)liked;
            shared = (int) (liked * 3);
        }
        
        return (int)totalLikes;
    }
    
    static int calculateLikesForShares( int shares){
        double likes = (double)floor( shares / 2 );
        
        return (int)likes;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {        

        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int result = viralAdvertising(n);        
        scanner.close();
        
        System.out.println(result);
    }
}