package algorithmxlr8;

import java.util.Scanner;

public class P1FizzBuzz {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n=scanner.nextInt();

        for (int i = 1; i <=n; i++) {
            if (i%3 == 0 && i%5==0){
                System.out.println("FizzBuzz");
            } else if(i%3==0){
                System.out.println("Fizz");
            } else if (i%5==0) {
                System.out.println("Buzz");
            }
            else {
                System.out.println(i);
            }
        }
    }
}
/*
Given an integer n, print the numbers from 1 to n, one per line.
For each number i (1 ≤ i ≤ n):
If i is divisible by 3 and 5, print "FizzBuzz".
Else if i is divisible by 3, print "Fizz".
Else if i is divisible by 5, print "Buzz".
Otherwise, print i.
Read n from standard input, and print your n answers to standard output, one per line.

Example 1:
Input: n = 3
Output: 1, 2, Fizz

Example 2:
Input: n = 5
Output: 1, 2, Fizz, 4, Buzz

Example 3:
Input: n = 15
Output: 1, 2, Fizz, 4, Buzz, Fizz, 7, 8, Fizz, Buzz, 11, Fizz, 13, 14, FizzBuzz

Constraints:
1 <= n <= 10^4
 */


/*
Explanation of code

I use a for loop to iterate from 1 to n.
For each number, I first check whether it is divisible by both 3 and 5 using the modulo operator.
If both conditions are true, I print FizzBuzz.

Otherwise, I check divisibility by 3
I print Fizz.

Otherwise, I check divisibility by 5
I print Buzz.

If neither condition is satisfied, I print the number itself.

The time complexity is O(n), and the auxiliary space complexity is O(1).
 */