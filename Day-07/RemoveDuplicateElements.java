/*
 * ===========================================================
 * Program 03: Remove Duplicate Elements from an Array
 * Day        : Day 07
 * Author     : Kanhaiya Singh Bhadauriya
 * ===========================================================
 *
 * Problem Statement:
 * Write a Java program to remove duplicate elements from an
 * array using only arrays and nested loops.
 * Print each distinct element only once while maintaining
 * the original order of appearance.
 *
 * Example:
 * Input:
 * 1 2 1 3 2
 *
 * Output:
 * 1
 * 2
 * 3
 *
 * Algorithm:
 * 1. Read all array elements from the user.
 * 2. For each element, check whether it has already appeared.
 * 3. If it has already appeared, skip it.
 * 4. Otherwise, print the element.
 *
 * Time Complexity : O(n²)
 * Space Complexity: O(1)
 * ===========================================================
 */
import java.util.Scanner;
public class RemoveDuplicateElements {
    public static void main(String[] args) {
        int[] arr = new int[5];
        System.out.println("Enter 5 values into Array");
        Scanner  sc = new Scanner(System.in);
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        sc.close();
        boolean isalready = false;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < i; j++) {
                if (arr[i] == arr[j]) {
                    isalready = true;
                    break;
                }
            }
            if(isalready){
                isalready=false;
                continue;
            }
            System.out.println(arr[i]);
        }
    }
}
