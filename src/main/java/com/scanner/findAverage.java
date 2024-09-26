package com.scanner;

import java.util.Scanner;

/**
 *
 * @author maheshvari.keshari
 */
public class findAverage {
    public static void main(String arges[]){
    
        Scanner s = new Scanner(System.in);
        System.out.println("Enter First number");
        int a = s.nextInt();
        System.out.println("Enter Second number");
        int b = s.nextInt();
        System.out.println("Enter Third number");
        int c = s.nextInt();
        int avg = (a+b+c)/3;
        System.out.println("Average of 3 Number-" +avg);
        
    }
    
}
