package com.yourname;

import java.util.Scanner;

public class Program_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] str = scanner.nextLine().split(" ");
        int[] ar = new int[str.length];
        for (int i = 0; i < ar.length; i++) {
            String s = str[i];
            int k = Integer.parseInt(s);
            ar[i] = k;
        }
        int max = ar[0];
        int min = ar[0];
        for (int f = 0; f < ar.length; f++) {
            if (ar[f] > max) {
                max = ar[f];
            }
            if (ar[f] < min) {
                min = ar[f];
            }
        }

        System.out.println("Самым большим елементом является " + max);
        System.out.println("Самым маленьким елементом является " + min);
    }
}
