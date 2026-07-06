/*
 * ===========================================================
 * Program 02: Find Unique Elements in an Array
 * Day        : Day 07
 * Author     : Kanhaiya Singh Bhadauriya
 * ===========================================================
 *
 * Problem Statement:
 * Write a Java program to find and print all unique elements
 * in an array using only arrays and nested loops.
 * A unique element is an element that appears exactly once
 * in the array.
 *
 * Example:
 * Input:
 * 1 2 3 2 5
 *
 * Output:
 * Unique Elements:
 * 1
 * 3
 * 5
 *
 * Algorithm:
 * 1. Read all array elements from the user.
 * 2. For each element, count its occurrences in the array.
 * 3. If the count is exactly 1, print the element.
 *
 * Time Complexity : O(n²)
 * Space Complexity: O(1)
 * ===========================================================
 */
import java.util.Scanner;
public class FindUniqueElements {
    public static void main(String[] args) {
        int[] arr = new int[5];
        System.out.println("Enter elements in Array");
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        sc.close();
        int count=0;
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
            for (int j = i+1; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    count++;
                    break;
                }
            }
            
            if (count==0) {
                System.out.println(arr[i]);
            }
            else{
                System.out.println("No value is Unique");
            }
            count=0;
        }
    }
}
