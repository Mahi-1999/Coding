package com.coding;
import java.util.Scanner;
/**
 *
 * @author maheshvari.keshari
 */

public class Fibonacci {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        
        int n = s.nextInt();
        System.out.println(fibonacci(n));
        
        s.close(); // Closing the scanner to avoid resource leak
    }

    public static int fibonacci(int n) {
        // Handle edge cases for n = 1 and n = 2
        if (n == 1 || n == 2) {
            return 1;
        }

        // Create an array to store Fibonacci numbers up to n
        int[] fib = new int[n + 1];
        
        // Base cases
        fib[1] = 1;
        fib[2] = 1;
        
        // Build the Fibonacci sequence up to n
        for (int i = 3; i <= n; i++) {
            fib[i] = fib[i - 1] + fib[i - 2];
        }
        
        // Return the n-th Fibonacci number
        return fib[n];
    }
}