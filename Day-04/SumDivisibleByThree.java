/*
------------------------------------------------------------
Java Placement Bootcamp
Day 4

Problem:
Sum of Elements Divisible by 3

Description:
Write a Java program to calculate the sum of all
elements in an array that are divisible by 3.

Example:
Input:
6 10 9 7 12

Output:
Sum of elements divisible by 3 = 27

Algorithm:
1. Read 5 integer values into an array.
2. Traverse the array using a loop.
3. Check whether each element is divisible by 3.
4. If divisible, add it to the sum.
5. Display the final sum.

Time Complexity: O(n)
Space Complexity: O(1)

Author: Kanhaiya Singh Bhadauriya
------------------------------------------------------------
*/
import java.util.Scanner;
public class SumDivisibleByThree {
    public static void main(String[] args) {
        int[] arr = new int[5];
        System.out.println("Enter 5 values");
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < arr.length; i++) {
            arr[i]= sc.nextInt();
        }
        sc.close();
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]%3==0) {
                sum += arr[i];
            }
        }
        System.out.println("The sum is " + sum);
    }
}
