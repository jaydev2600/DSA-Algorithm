package algorithmxlr8;

import java.util.Scanner;

public class P5NumberOfSteps {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        int count = 0;

        while(num>0){
            if(num % 2 == 0){
                count++;
                num = num / 2;
            }
            else{
                num = num -1;
            }
            count++;
        }
        System.out.println(count);
    }
}


/*
Given an integer num, return the number of steps to reduce it to zero.
In one step, if the current number is even, divide it by 2. Otherwise, subtract 1 from it.
Read num from standard input, and print the number of steps.

Example 1:
Input: 14
Output: 6

Example 2:
Input: 8
Output: 4

Example 3:
Input: 123
Output: 12
*/


/*
Time complexity: O(log n)
Why?
- If the number is even, we divide it by 2.
- If the number is odd, we subtract 1, making it even (unless it becomes zero).
- Therefore, for positive numbers, the value is approximately halved every one or two steps.

 */


/*
Approach: Iterative Simulation

1. Read an integer num from standard input.

2. Initialize count = 0 to track the steps.

3. Use a while loop until num becomes 0.

4. If num is even (num % 2 == 0),
   divide it by 2.

5. Otherwise, subtract 1 from num.

6. Increment count after each operation.

7. When num becomes 0, stop the loop.

8. Print count.

Time Complexity: O(log n) for n > 0.
Space Complexity: O(1).

Note: Assumes num >= 0.
*/

/*
I use an iterative approach to reduce the given number to zero.
I initialize a counter to track the number of operations.
While the number is greater than zero, I check whether it is even or odd using the modulo operator.
If it's even, I divide it by two;
otherwise, I subtract one.
After each operation, I increment the counter.
Finally, I return the number of steps. The time complexity is O(log n), and the space complexity is O(1).
 */