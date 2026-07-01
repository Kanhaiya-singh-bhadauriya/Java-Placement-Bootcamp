/*
------------------------------------------------------------
Java Placement Bootcamp
Day 2

Problem:
Count Even and Odd Numbers in an Array

Example:
Input:
10 15 8 7 20

Output:
Even = 3
Odd = 2

Time Complexity: O(n)
Space Complexity: O(1)

Author: Kanhaiya Singh Bhadauriya
------------------------------------------------------------
*/
import  java.util.Scanner;
public class EvenOdd {
    public static void main(String[] args) {
        int[] arr = new int[5];
        int even=0,odd=0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 5 numbers:");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        sc.close();
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0) {
                even++;
            } else {
                odd++;
            }
        }
        System.out.println("Even numbers count = " + even);
        System.out.println("Odd numbers count = " + odd);
    }}
