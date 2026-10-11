package algorithmxlr8;

import java.util.Scanner;

public class P2Chessboard {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String coordinates  = scanner.next();
        String result = checkCoordinates(coordinates) ? "White" : "Black";
        System.out.println(result);
    }

    public static boolean checkCoordinates(String input){
        return (input.charAt(0)+1+input.charAt(1)) % 2 == 0;
    }


    public static boolean checkCoordinates1(String input) {
        int column = input.charAt(0) - 'a' + 1;
        int row = input.charAt(1) - '0';
        return (column + row) % 2 != 0;
    }
}

/*
You are given a chessboard square in algebraic notation, e.g. "a1".
A chessboard has 8 rows and 8 columns. The columns are labeled 'a' through 'h', and the rows are labeled 1 through 8. Squares alternate between two colors, White and Black.
Read the coordinate string from standard input, and print the color of that square: "White" or "Black".

Example 1:
Input: a1
Output: Black

Example 2:
Input: h3
Output: White

Example 3:
Input: c7
Output: Black
 */


/*
here we used char value of alphabets
first we extract the first char bcz it's alphabets and get digit value of it using charAt() then add 1
second, we extract the second char value, by default it number
then addition of all it and check it does it % == 0 then return the value as boolean
we get either true of false

we use ternary operator to display either white or black based on the true false values.
Note: we add +1 bcz it can help use to check does it % == 0 or not

There are two ways to we can solve it.

//
String result = checkCoordinates(coordinates) ? "White" : "Black";
return (input.charAt(0) + 1 + input.charAt(1)) % 2 == 0;

String result = checkCoordinates(coordinates) ? "Black" : "White";
return (input.charAt(0) + input.charAt(1)) % 2 == 0;

String result = checkCoordinates(coordinates) ? "White" : "Black";
return (input.charAt(0) + input.charAt(1)) % 2 != 0;

 */


/*
Approach: Character Values + Modulo Operator

1. Read the chessboard coordinate as a String.

2. Extract both characters using charAt():
   - charAt(0) returns the column letter.
   - charAt(1) returns the row digit character.

3. Java converts the characters into their numeric
   Unicode values during arithmetic operations.

4. Add the two character values and 1.

5. Apply % 2 to check whether the sum is even.

6. The +1 reverses the parity, allowing us to
   associate an even result with White.

7. The method returns true for White and
   false for Black.

8. Use a ternary operator to print the color.

Time Complexity: O(1)
Space Complexity: O(1)
*/