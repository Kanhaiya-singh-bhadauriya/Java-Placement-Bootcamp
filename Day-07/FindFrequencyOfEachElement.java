/*
 * ===========================================================
 * Program 01: Find Frequency of Each Element in an Array
 * Day        : Day 07
 * Author     : Kanhaiya Singh Bhadauriya
 * ===========================================================
 *
 * Problem Statement:
 * Write a Java program to find the frequency of each distinct
 * element in an array using only arrays and nested loops.
 * Do not use HashMap, ArrayList, or any Collection Framework.
 * Each element should be printed only once along with its frequency.
 *
 * Example:
 * Input:
 * 1 2 1 3 2
 *
 * Output:
 * Frequency of 1 is 2
 * Frequency of 2 is 2
 * Frequency of 3 is 1
 *
 * Algorithm:
 * 1. Read all array elements from the user.
 * 2. For each element, check whether it has already appeared.
 * 3. If it has already appeared, skip it.
 * 4. Otherwise, count its occurrences in the remaining array.
 * 5. Print the element and its frequency.
 *
 * Time Complexity : O(n²)
 * Space Complexity: O(1)
 * ===========================================================
 */
import java.util.Scanner;
public class FindFrequencyOfEachElement {
    public static void main(String[] args) {
        int[] arr = new int[5];
        System.out.println("Enter values in Array");
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        sc.close();
        int count=1;
        boolean isduplicate = false;
        for (int i = 0; i < arr.length; i++) {
            for (int j2 = 0; j2 < i; j2++) {
                if(arr[i] == arr[j2] ){
                    isduplicate = true;
                }
            }
            
            for (int j = i+1; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    count++;
                }
            }
            if (isduplicate) {
                isduplicate=false;
                continue;
            }
            System.out.println("Frequency of " + arr[i] + " is " + count);
            count=1;
        }
    }
}
