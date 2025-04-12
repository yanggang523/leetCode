/** 
 * Forward declaration of guess API.
 * @param  num   your guess
 * @return 	     -1 if num is higher than the picked number
 *			      1 if num is lower than the picked number
 *               otherwise return 0
 * int guess(int num);
 */

public class Solution extends GuessGame {
    public int guessNumber(int n) {
        // int num = Integer.MAX_VALUE/2;
        int b = 1;
        int f = Integer.MAX_VALUE;
        int flag = 2;
        while (flag != 0){
            flag = guess(b + (f - b)/2);
            if (flag == 1){
                b = b + (f - b)/2 + 1;
            }
            if (flag == -1){
                f = b + (f - b)/2 - 1;
            }
                
        }
        return b + (f - b)/2;
    }
}