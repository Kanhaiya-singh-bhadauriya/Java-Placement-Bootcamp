/*
Day 1
Topic: Arrays
Problem: Largest and Smallest Element
Time Complexity: O(n)
Author: Kanhaiya Singh Bhadauriya
*/

import java.util.Scanner;

public class LargestSmallest {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int[] arr = new int[5];

        System.out.println("Enter 5 numbers:");

        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        int max = arr[0];
        int min = arr[0];

        for (int i = 0; i < arr.length; i++) {

            if (arr[i] > max) {
                max = arr[i];
            }

            if (arr[i] < min) {
                min = arr[i];
            }
        }

        System.out.println("Largest = " + max);
        System.out.println("Smallest = " + min);

        sc.close();
    }
}