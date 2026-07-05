import java.util.Scanner;
public class LeftRotateArray {
    public static void main(String[] args) {
        int[] arr = new int[5];
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter values in Array");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        sc.close();
        int temp=arr[0];
        for (int i = 0; i < arr.length-1; i++) {
            arr[i] = arr[i+1];
        }
        arr[arr.length-1] = temp;

        System.out.println("New array with same values but after left rotation the new values on indexes are changed");
        for (int i = 0; i < arr.length; i++) {
            System.out.println("Value at index " + i + " is " + arr[i]);
        }
    }
}
