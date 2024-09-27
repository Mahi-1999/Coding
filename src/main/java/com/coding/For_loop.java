package com.coding;

import java.util.Scanner;

/**
 *
 * @author maheshvari.keshari
 */
public class For_loop {

    public static void main(String args[]) {
        Scanner s = new Scanner(System.in);
        int a = s.nextInt();
        int sum = 0;
        for (int i = 0; i <= a; i++) {
            sum = sum + i;
        }
        System.out.print("Sum of " + a +" natural No. " + sum);
    }
}
