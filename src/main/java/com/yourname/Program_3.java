package com.yourname;
import java.util.Scanner;
public class Program_3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] str = scanner.nextLine().split(" ");
        int[] arr = new int[str.length];
        for (int i = 0; i < arr.length; i++) {
            String s = str[i];
            int k = Integer.parseInt(s);
            arr[i] = k;
        }
        int max = arr[0];
        int min = arr[0];
        for (int f = 0; f < arr.length; f++) {
            if (arr[f] > max) {
                max = arr[f];
            }
            if (arr[f] < min) {
                min = arr[f];
            }
        }
        int array2[][] = new int[][]{
                {max, max, max, max},
                {min, min, min, min},
                {max, max, max, max},
                {min, min, min, min}};
        for (int i = 0; i < 4; i++) {
            for (int j = 0;j < 4; j++) {
                System.out.print(array2[i][j] + "\t");
            }
            System.out.println();
        }
    }
}