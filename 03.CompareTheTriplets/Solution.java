/**
 * HackerRank URL: https://www.hackerrank.com/challenges/compare-the-triplets/problem
 * @author Thodoris Kouleris
 */
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        // Alice ratings
        int a0 = scan.nextInt();
        int a1 = scan.nextInt();
        int a2 = scan.nextInt();
        
        // Bob ratings
        int b0 = scan.nextInt();
        int b1 = scan.nextInt();
        int b2 = scan.nextInt();
        
        scan.close();
        
        int AlicePoints = (a0 > b0 ? 1 : 0) + (a1 > b1 ? 1 : 0) + (a2 > b2 ? 1 : 0);
        int BobPoints = (b0 > a0 ? 1: 0) + (b1 > a1 ? 1 : 0) + (b2  > a2 ? 1 : 0);
        
        System.out.println(AlicePoints + " " + BobPoints);        

    }
}