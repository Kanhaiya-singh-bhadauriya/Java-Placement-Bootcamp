/*
------------------------------------------------------------
Java Placement Bootcamp
Day 4

Problem:
Find Second Largest Element in an Array

Description:
Write a Java program to find the second largest distinct element
from an array of 5 integers.

Example:
Input:
10 40 20 50 30

Output:
Second Largest Element = 40

Assumption:
The array contains at least two distinct elements.

Time Complexity: O(n)
Space Complexity: O(1)

Author: Kanhaiya Singh Bhadauriya
------------------------------------------------------------
*/
import java.util.Scanner;
public class SecondLargestElement {
    public static void main(String[] args){
        int[] arr = new int[5];
        System.out.println("Enter 5 values in Array");
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        sc.close();
       int largestelement=arr[0];
       int secondLargest=arr[0];
       for (int i = 1; i < arr.length; i++) {
        if (arr[i] == largestelement) {
            continue;
        }
        else if (arr[i]>largestelement) {
            secondLargest = largestelement;
           largestelement =arr[i]; 
        } 
        else if(arr[i]>secondLargest){
            secondLargest = arr[i];
        }
       }
       System.out.println("Second Largest Element is " + secondLargest);
    }
}
