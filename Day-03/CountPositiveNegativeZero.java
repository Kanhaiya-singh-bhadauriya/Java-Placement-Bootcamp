/*
------------------------------------------------------------
Java Placement Bootcamp
Day 3

Problem:
Count Positive, Negative, and Zero Elements in an Array

Example:
Input:
10 -5 0 25 -1

Output:
Positive = 2
Negative = 2
Zero = 1

Time Complexity: O(n)
Space Complexity: O(1)

Author: Kanhaiya Singh Bhadauriya
------------------------------------------------------------
*/
import java.util.Scanner;
public class CountPositiveNegativeZero {
    public static void main(String[] args){
        int[] arr = new int[5];
        System.out.println("Enter 5 integer");
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        sc.close();
        int positive=0,negative=0,zero=0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]==0) {
                zero++;
            }
            else if(arr[i]>0){
                positive++;
            }
            else{
                negative++;
            }
        }
        System.out.println("Positive :" + positive);
        System.out.println("Negative :" + negative);
        System.out.println("Zero :" + zero);
    }
}
