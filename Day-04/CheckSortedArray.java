/*
------------------------------------------------------------
Java Placement Bootcamp
Day 4

Problem:
Check if an Array is Sorted

Description:
Write a Java program to check whether an array
is sorted in ascending order.

Example:
Input:
10 20 30 40 50

Output:
Array is Sorted

Time Complexity: O(n)
Space Complexity: O(1)

Author: Kanhaiya Singh Bhadauriya
------------------------------------------------------------
*/
import java.util.Scanner;
public class CheckSortedArray {
    public static void main(String[] args) {
        int[] arr = new int[5];
        boolean isSorted= true;
        System.out.println("Enter 5 values in array");
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        sc.close();
        int check = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (check <= arr[i]) {
                check = arr[i];
            }
            else{
                isSorted = false;
                break;
            }
        }
        if (isSorted) {
            System.out.println("Array is sorted");
        }
        else{
            System.out.println("Array is not sorted");
        }
    }
}
