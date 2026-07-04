/*
------------------------------------------------------------
Java Placement Bootcamp
Day 5

Problem:
Merge Two Arrays

Author:
Kanhaiya Singh Bhadauriya
------------------------------------------------------------
*/
import java.util.Scanner;
public class MergeTwoArrays {
    public static void main(String[] args) {
        int size1,size2;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of First array");
        size1 = sc.nextInt();
        System.out.println("Enter the size of Second array");
        size2 = sc.nextInt();
        int[] arr1 = new int[size1];
        int[] arr2 = new int[size2];
        int[] arr = new int[size1+size2];
        System.out.println("Enter the value in First array");
        for (int i = 0; i < arr1.length; i++) {
            arr1[i] = sc.nextInt();
        }
        System.out.println("Enter the value in Second array");
        for (int i = 0; i < arr2.length; i++) {
            arr2[i] = sc.nextInt();
        }
        sc.close();
        for (int i = 0; i < arr1.length; i++) {
            arr[i] = arr1[i];
        }
        for (int i = size1; i < arr.length; i++) {
            arr[i] = arr2[i-size1];
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}
