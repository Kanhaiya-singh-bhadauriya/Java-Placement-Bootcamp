/*
------------------------------------------------------------
Java Placement Bootcamp
Day 06

Problem:
Find Common Elements

Author:
Kanhaiya Singh Bhadauriya
------------------------------------------------------------
*/
import java.util.Scanner;
public class FindCommonElements {
    public static void main(String[] args) {
        int[] arr1 = new int[5];
        int[] arr2 = new int[5];

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the values in First Array");
        for (int i = 0; i < arr1.length; i++) {
            arr1[i] = sc.nextInt();
        }
        System.out.println("Enter the values in Second Array");
        for (int i = 0; i < arr2.length; i++) {
            arr2[i] = sc.nextInt();
        }
        sc.close();
        boolean found = false;
        for (int  i = 0; i < arr1.length; i++) {
            for (int j = 0; j < arr2.length; j++) {
                if (arr1[i] == arr2[j]) {
                    System.out.println("Common element is " + arr1[i]);
                    found = true;
                }
            }
        }
        if (!found) {
            System.out.println("No common element found");
        }
    }
}
