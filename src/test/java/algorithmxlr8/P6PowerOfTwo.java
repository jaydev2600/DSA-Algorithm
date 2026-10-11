package algorithmxlr8;

import java.util.Scanner;

public class P6PowerOfTwo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();

        System.out.println(checkPower(n));
    }

    public static boolean checkPower(long n){
        if(n<=0){
            return false;
        }

        while (n>1) {
            if(n % 2 != 0){
                return false;
            }
            n = n/2;
        }
        return true;
    }
}


/*
Question: Power of Two

Given an integer n, return true if it is a power of two. Otherwise, return false.
An integer n is a power of two if there exists an integer x such that n == 2^x.
Read n from standard input, and print "true" or "false" (lowercase) to standard output.

Zero and every negative number are never powers of two.
The number 1 counts as a power of two, since 2^0 = 1.

Example 1:
Input: n = 1
Output: true

Explanation: 2^0 = 1, so 1 is a power of two.

Example 2:
Input: n = 16
Output: true

Explanation: 2^4 = 16, so 16 is a power of two.
Example 3:
Input: n = 3
Output: false

Explanation: There is no integer x for which 2^x equals 3, so 3 is not a power of two.

Constraints:
-2^31 <= n <= 2^31 - 1
 */


/*
Approach : Iterative Division

1. Read the integer n.

2. If n<=0, return false because zero and negative numbers are not power of zero

3. Use a while loop until n became 1

4. Check whether n is divisible by 2.

5. If n is odd while greater than 1,
    return false.

6. Otherwise, divide n by 2.

7. If n successfully reaches 1,
    return true.

8. Print the final boolean result only once.
 */

/*
I use an iterative approach to check whether a number is a power of two.
First, I handle zero and negative numbers by returning false.
Then, while the number is greater than one, I check whether it's divisible by two.
If it's not, I return false. Otherwise, I divide it by two and continue.
If the number eventually reaches one, I return true.
The time complexity is O(log n), and the space complexity is O(1).
 */