/**
 * HackerRank URL: https://www.hackerrank.com/challenges/mini-max-sum/problem
 * @author Thodoris Kouleris
 */
import java.util.*;

public class Solution {
    
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int[] arr = new int[5];

        String[] arrItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < 5; i++) {
            int arrItem = Integer.parseInt(arrItems[i]);
            arr[i] = arrItem;
        }

        miniMaxSum(arr);

        scanner.close();
    }
    
    static void miniMaxSum(int[] arr) {
        Arrays.sort(arr);
        
        long minSum = minSum(arr);
        long maxSum = maxSum(arr);
        
        System.out.println(minSum + " " + maxSum);        
    }
    
    static long minSum(int[] sortedArr) {
        long minSum = 0;
        
        for(int i = 0; i < 4 ; i++)
            minSum += sortedArr[i];
        
        return minSum;            
    }
    
    static long maxSum(int[] sortedArr) {
        long maxSum = 0;
        
        for(int i = 4; i > 0 ; i--)
            maxSum += sortedArr[i];
        
        return maxSum; 
    }    
}