package com.yourname;

import java.util.Arrays;
import java.util.Scanner;

public class Program_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] str = scanner.nextLine().split(" ");
        int[] ar = new int[str.length];
        for (int i = 0; i < ar.length; i++) {
            String s = str[i];
            int k = Integer.parseInt(s);
            ar[i] = k;
        }
        for (int i = 1; i < ar.length ; i++) {
            for (int j = 0; j < ar.length; j++) {
                if (ar[i] < ar[j]) {
                    int buffer = ar[i];
                    ar[i] = ar[j];
                    ar[j] = buffer;
                }
            }
        }
        System.out.println(Arrays.toString(ar));
    }
}
