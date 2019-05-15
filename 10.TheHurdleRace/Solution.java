/**
 * HackerRank URL: https://www.hackerrank.com/challenges/the-hurdle-race/problem
 * @author Thodoris Kouleris
 */

import java.util.*;

public class Solution {
    
    static int hurdleRace(int k, int[] height) {
        int minDose = 0;
        
        int maxHeight = 0;
        for(int i = 0; i<height.length; i++){
           if(height[i] > maxHeight) maxHeight = height[i];
        }
        
        if( maxHeight > k) minDose = maxHeight - k;
        
        return minDose;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args)  {        

        String[] nk = scanner.nextLine().split(" ");

        int n = Integer.parseInt(nk[0]);

        int k = Integer.parseInt(nk[1]);

        int[] height = new int[n];

        String[] heightItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < n; i++) {
            int heightItem = Integer.parseInt(heightItems[i]);
            height[i] = heightItem;
        }

        int result = hurdleRace(k, height);

        scanner.close();
        
        System.out.println(result);
    }
}