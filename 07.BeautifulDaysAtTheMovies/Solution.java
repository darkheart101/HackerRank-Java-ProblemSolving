/**
 * HackerRank URL: https://www.hackerrank.com/challenges/beautiful-days-at-the-movies/problem
 * @author Thodoris Kouleris
 */
import static java.lang.Math.abs;
import java.util.*;

public class Solution {
        
    static int beautifulDays(int firstDay, int lastDay, int beautifulDayFactor) {
        int dayDifference = 0;
        int isDayBeautiful;
        int totalBeautifulDays = 0;
        
        for(int i = firstDay; i <= lastDay ; i++){
            isDayBeautiful = abs(i - reverseOf(i)) % beautifulDayFactor;
            if(isDayBeautiful == 0) totalBeautifulDays++;
        }
        
        return totalBeautifulDays;
    }
    
    static int reverseOf(int num){
        int reversed = 0;

        while(num != 0) {
            int digit = num % 10;
            reversed = reversed * 10 + digit;
            num /= 10;
        }        
        return reversed;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args){

        String[] ijk = scanner.nextLine().split(" ");

        int i = Integer.parseInt(ijk[0]);

        int j = Integer.parseInt(ijk[1]);

        int k = Integer.parseInt(ijk[2]);

        int result = beautifulDays(i, j, k);
        scanner.close();
        
        System.out.println(result);
    }
}