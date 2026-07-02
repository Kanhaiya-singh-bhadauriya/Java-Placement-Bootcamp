/*
------------------------------------------------------------
Java Placement Bootcamp
Day 3

Problem:
Reverse an Array

Example:
Input:
10 20 30 40 50

Output:
50 40 30 20 10

Time Complexity: O(n)
Space Complexity: O(1)

Author: Kanhaiya Singh Bhadauriya
------------------------------------------------------------
*/
import java.util.Scanner;
public class ReverseArray {
  public static void main(String[] args){
    int[] arr = new int[5];
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter 5 values in the array");
    for (int i = 0; i < arr.length; i++) {
        arr[i] = sc.nextInt();
    }
    sc.close();
    for (int i = arr.length-1; i >= 0; i--) {
        System.out.println(arr[i]);
    }
  }  
}
