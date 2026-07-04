/*
------------------------------------------------------------
Java Placement Bootcamp
Day 5

Problem:
Find Missing Number

Author:
Kanhaiya Singh Bhadauriya
------------------------------------------------------------
*/
import java.util.Scanner;
public class FindMissingNumber {
    public static void main(String[] args) {
        int[] arr = new int[4];
    System.out.println("Enter the values in  Array");
    Scanner sc = new Scanner(System.in);
    for(int i = 0; i< arr.length;i++){
        arr[i] = sc.nextInt();
    }
    sc.close();
    int totalsum=15;
    int sum=0;
    for (int i = 0; i < arr.length; i++) {
        sum += arr[i];
    }
    sum = totalsum-sum;
    System.out.println("The missing value is :" + sum);
    }
}

