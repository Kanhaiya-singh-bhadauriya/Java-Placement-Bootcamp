/*
------------------------------------------------------------
Java Placement Bootcamp
Day 06

Problem:
Find First Duplicate Element

Author:
Kanhaiya Singh Bhadauriya
------------------------------------------------------------
*/
import java.util.Scanner;
public class FindFirstDuplicateElement {
    public static void main(String[] args) {
        int[] arr = new int[5];
        System.out.println("Enter values is Array");
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        sc.close();
        boolean FoundDuplicate = false;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i+1; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    System.out.println("Duplicate Element is : " + arr[i]);
                    FoundDuplicate = true;
                    break;
                }
            }
            if (!FoundDuplicate) {
                break;
            }
        }
        if (FoundDuplicate) {
            System.out.println("No duplicate value is found");
        }
    }
}
