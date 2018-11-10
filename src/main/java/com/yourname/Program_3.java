package com.yourname;

import java.util.Scanner;
// Не сделал
public class Program_3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] str = scanner.nextLine().split(" ");
        int[] ar = new int[str.length];
        for (int i = 0; i < ar.length; i++) {
            String s = str[i];
            int k = Integer.parseInt(s);
            ar[i] = k;
        }


    }
}
