package com.scanner;

import java.util.Scanner;

/**
 *
 * @author maheshvari.keshari
 */
public class CalculateSI {

    //Formula = (P*R*T)/100
    public static void main(String args[]) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter value of Principal: ");
        int p = s.nextInt();
        System.out.println("Enter value of Rate: ");
        int r = s.nextInt();
        System.out.println("Enter value of Time: ");
        int t = s.nextInt();

        double si = (p * r * t) / 100;
        System.out.println("SI: " + si);

    }
}
