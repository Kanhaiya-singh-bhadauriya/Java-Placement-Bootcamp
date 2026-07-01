/*
Day 2
Topic: Arrays
Problem: Sum of Array
Time Complexity: O(n)
Author: Kanhaiya Singh Bhadauriya
*/

import java.util.Scanner;

public class SumOfArray{

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int[] arr = new int[5];

        System.out.println("Enter 5 numbers:");

        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        int sum = 0;

        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }

        System.out.println("Sum = " + sum);

        sc.close();
    }
}