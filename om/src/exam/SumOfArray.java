package exam;

import java.util.Scanner;
public class SumOfArray {
    public static void main(String args[]) {
        Scanner obj = new Scanner(System.in);
        int[] array = new int[5];
        int sum = 0;
        System.out.println("Enter the elements:");
        for (int i = 0; i < 5; i++) {
            array[i] = obj.nextInt();
        }
        for (int number : array) {
            sum = sum + number;
        }
        System.out.println("Sum of array elements is:" + sum);
    }
}