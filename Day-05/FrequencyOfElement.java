/*
------------------------------------------------------------
Java Placement Bootcamp
Day 5

Problem:
Frequency of an Element in an Array

Author:
Kanhaiya Singh Bhadauriya
------------------------------------------------------------
*/
import java.util.Scanner;
public class FrequencyOfElement {
    public static void main(String[] args) {
        int[] arr = new int[5];
        System.out.println("Enter Array");
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        int target, count=0;
        System.out.println("Enter target value ");
        target = sc.nextInt();
        sc.close();
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                count++;
            }
        }
        System.out.println("frequency of element is :" + count);
    }
}
