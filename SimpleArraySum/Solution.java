/**
 * HackerRank URL: https://www.hackerrank.com/challenges/simple-array-sum/problem
 * @author Thodoris Kouleris
 */
import java.util.*;

public class Solution {
        
    static int simpleArraySum(int[] ar) {
        int arrayItemSum = 0;
        
        for(int i = 0; i < ar.length; i++)
            arrayItemSum += ar[i];
        
        return arrayItemSum;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        
        int arCount = Integer.parseInt(scanner.nextLine().trim());
        int[] ar = new int[arCount];        
        
        //Scanner kb = new Scanner(System.in);      
        for(int i = 0; i < ar.length; i++)            
            ar[i] = scanner.nextInt();        
        
        int result = simpleArraySum(ar);
        
        System.out.println(result);
    }
}
