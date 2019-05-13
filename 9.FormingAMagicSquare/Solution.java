/**
 * HackerRank URL: https://www.hackerrank.com/challenges/magic-square-forming/problem
 * @author Thodoris Kouleris
 */

import static java.lang.Math.abs;
import java.util.*;

public class Solution {
    
    static int formingMagicSquare(int[][] s) {
        
        // Eight possible magic squares
        int[][] possibleMagicSquare1 = {
            {4,9,2},
            {3,5,7},
            {8,1,6}
        };
        
        int[][] possibleMagicSquare2 = {
            {2,7,6},
            {9,5,1},
            {4,3,8},   
       };
        
        int[][] possibleMagicSquare3 = {
            {6,1,8},
            {7,5,3},
            {2,9,4},   
       };        
        
       int[][] possibleMagicSquare4 = {
            {8,3,4},
            {1,5,9},
            {6,7,2},   
       };
        
        int[][] possibleMagicSquare5 = {
            {4,3,8},
            {9,5,1},
            {2,7,6}
        };
        
        int[][] possibleMagicSquare6 = {
            {8,1,6},
            {3,5,7},
            {4,9,2},   
       };
        
        int[][] possibleMagicSquare7 = {
            {6,7,2},
            {1,5,9},
            {8,3,4},   
       };        
        
       int[][] possibleMagicSquare8 = {
            {2,9,4},
            {7,5,3},
            {6,1,8},   
       };       

        
        int minCost = 0;
        int tmpCost = 50;
        int tmp = 0;

        // Test every possible magic square and find the minimum cost
        
        for(int i = 0; i < 3; i++){
            for(int j = 0; j < 3 ; j++){
                tmp += abs(possibleMagicSquare1[i][j] - s[i][j]);
            }
        }
        if(tmp == 0)  tmpCost = 0;
        if(tmp < tmpCost) tmpCost = tmp;
            
        tmp = 0;
        for(int i = 0; i < 3; i++){
            for(int j = 0; j < 3 ; j++){
                tmp += abs(possibleMagicSquare2[i][j] - s[i][j]);
            }
        }
        if(tmp == 0)  tmpCost = 0;
        if(tmp < tmpCost) tmpCost = tmp;

        tmp = 0;
        for(int i = 0; i < 3; i++){
            for(int j = 0; j < 3 ; j++){
                tmp += abs(possibleMagicSquare3[i][j] - s[i][j]);
            }
        }
        if(tmp == 0)  tmpCost = 0;
        if(tmp < tmpCost) tmpCost = tmp;

        tmp = 0;
        for(int i = 0; i < 3; i++){
            for(int j = 0; j < 3 ; j++){
                tmp += abs(possibleMagicSquare4[i][j] - s[i][j]);
            }
        }
        if(tmp == 0)  tmpCost = 0;
        if(tmp < tmpCost) tmpCost = tmp;

        tmp = 0;
        for(int i = 0; i < 3; i++){
            for(int j = 0; j < 3 ; j++){
                tmp += abs(possibleMagicSquare5[i][j] - s[i][j]);
            }
        }
        if(tmp == 0)  tmpCost = 0;
        if(tmp < tmpCost) tmpCost = tmp;

        tmp = 0;
        for(int i = 0; i < 3; i++){
            for(int j = 0; j < 3 ; j++){
                tmp += abs(possibleMagicSquare1[i][j] - s[i][j]);
            }
        }
        if(tmp == 0)  tmpCost = 0;
        if(tmp < tmpCost) tmpCost = tmp;

        tmp = 0;
        for(int i = 0; i < 3; i++){
            for(int j = 0; j < 3 ; j++){
                tmp += abs(possibleMagicSquare6[i][j] - s[i][j]);
            }
        }
        if(tmp == 0)  tmpCost = 0;
        if(tmp < tmpCost) tmpCost = tmp;

        tmp = 0;
        for(int i = 0; i < 3; i++){
            for(int j = 0; j < 3 ; j++){
                tmp += abs(possibleMagicSquare7[i][j] - s[i][j]);
            }
        }
        if(tmp == 0)  tmpCost = 0;
        if(tmp < tmpCost) tmpCost = tmp;      
        
        tmp = 0;
        for(int i = 0; i < 3; i++){
            for(int j = 0; j < 3 ; j++){
                tmp += abs(possibleMagicSquare8[i][j] - s[i][j]);
            }
        }
        if(tmp == 0)  tmpCost = 0;
        if(tmp < tmpCost) tmpCost = tmp;         
        
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