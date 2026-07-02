/*
------------------------------------------------------------
Java Placement Bootcamp
Day 3

Problem:
Find Maximum Element in an Array

Example:
Input:
12 8 45 21 10

Output:
Maximum Element = 45

Time Complexity: O(n)
Space Complexity: O(1)

Author: Kanhaiya Singh Bhadauriya
------------------------------------------------------------
*/

import java.util.Scanner;
public class MaximumElement {
    public static void main(String[] args){
        int[] arr = new int[5];
        System.out.println("Enter 5 integer values ");
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        sc.close();
        int max=arr[0];
        for (int i = 1; i < arr.length; i++) {
            if(max<arr[i]){
                max = arr[i];
            }
        }
        System.out.println("Maximum element is " + max );
    }
}