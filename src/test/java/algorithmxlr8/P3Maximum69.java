package algorithmxlr8;

import java.util.Scanner;

public class P3Maximum69 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String num = sc.next();


        if(!num.contains("6")){
            System.out.println(num);
        }
        else {
            char[] nums = num.toCharArray();
            for (int i = 0; i < nums.length; i++) {
                if(nums[i] == '6'){
                    nums[i] = '9';
                    break;
                }
            }
            System.out.println(nums);
        }
    }
}


/*
Maximum 69 Number
You are given a positive integer num consisting only of digits 6 and 9.
Return the maximum number you can get by changing at most one digit 6 to 9.
Read num from standard input (as a whole number), and print the maximum possible number.

Example 1:
Input: 9669
Output: 9969

Example 2:
Input: 9996
Output: 9999

Example 3:
Input: 9999
Output: 9999

Constraints:
1 <= num <= 10^4
num consists of only 6 and 9 digits
 */


/*
First check weather 6 contains or not
then convert num into char[] array
Iterate each element and  checking does it contain 6 ?
if contain 6, change it to 9;
display char[] array.
 */



/*
Approach: Greedy + Character Array

1. Read the number as a String.

2. Convert the String into a character array
   using toCharArray().

3. Iterate through the array from left to right.

4. Find the first occurrence of '6'.

5. Replace that '6' with '9' to maximize
   the number.

6. Use break to stop after one replacement,
   since only one digit can be changed.

7. If no '6' exists, the number remains unchanged.

8. Print the resulting character array.

Time Complexity: O(n)
Space Complexity: O(n)
*/


/*
I use a greedy approach. Since the leftmost digit has the highest place value, changing the first occurrence of 6 to 9 gives the maximum possible number.
I convert the input into a character array, iterate from left to right, and replace the first 6 with 9.
Then I break the loop to ensure only one digit is changed. The time complexity is O(n), and the space complexity is O(n).
 */