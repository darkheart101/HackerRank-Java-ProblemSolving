/**
 * HackerRank URL: https://www.hackerrank.com/challenges/magic-square-forming/problem
 * @author Thodoris Kouleris
 */

import static java.lang.Math.abs;
import java.util.*;

public class Solution {
    
    static int formingMagicSquare(int[][] s) {
        
        int[][][] possibleMagicSquares = {
            {
                {4,9,2},
                {3,5,7},
                {8,1,6}                    
            },
            {
                {2,7,6},
                {9,5,1},
                {4,3,8},   
            },
            {
                {6,1,8},
                {7,5,3},
                {2,9,4},   
            },
            {
                {8,3,4},
                {1,5,9},
                {6,7,2},   
            },
            {
                {4,3,8},
                {9,5,1},
                {2,7,6}
            },
            {
                {8,1,6},
                {3,5,7},
                {4,9,2},   
            },
            {
                {6,7,2},
                {1,5,9},
                {8,3,4},   
            },
            {
                {2,9,4},
                {7,5,3},
                {6,1,8},   
           }            
        };
        
        int minCost = 0;
        int tmpCost = 50;
        int tmp;
        
        for(int possibleSquare = 0 ; possibleSquare < 8; possibleSquare++){
            tmp = 0;
            for(int i = 0; i < 3; i++){
                for(int j = 0; j < 3 ; j++){
                    tmp += abs(possibleMagicSquares[possibleSquare][i][j] - s[i][j]);
                }
            }
            if(tmp == 0)  tmpCost = 0;
            if(tmp < tmpCost) tmpCost = tmp;
        }      
        
        minCost = tmpCost;           
        
        return minCost;
    }
        

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {        

        int[][] s = new int[3][3];

        for (int i = 0; i < 3; i++) {
            String[] sRowItems = scanner.nextLine().split(" ");
            scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

            for (int j = 0; j < 3; j++) {
                int sItem = Integer.parseInt(sRowItems[j]);
                s[i][j] = sItem;
            }
        }

        int result = formingMagicSquare(s);
        scanner.close();
        
        System.out.println(result);
    }
}