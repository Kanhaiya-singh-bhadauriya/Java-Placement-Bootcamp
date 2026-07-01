/*
------------------------------------------------------------
Java Placement Bootcamp
Day 2

Problem:
Linear Search in an Array

Example:
Input:
10 25 30 45 50
45

Output:
Element found at index 3

Time Complexity: O(n)
Space Complexity: O(1)

Author: Kanhaiya Singh Bhadauriya
------------------------------------------------------------
*/
import java.util.Scanner;
public class LinearSearch {
    public static void main(String[] args) {
        int[] arr = new int[5];
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 5 numbers:");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        sc.close();
        System.out.println("Enter the number to search:");
        int target = sc.nextInt();
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                System.out.println("Number found at index: " + i);
            }
        }
        System.out.println("Number not found in the array.");
    }
}