/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.scanner;

import java.util.Scanner;

/**
 *
 * @author maheshvari.keshari
 */
public class FahrenheitToCelsius {
    public static void main(String args[]){
        // Formula is - 5/9 * (f-32)
        Scanner s = new Scanner(System.in);
        System.out.print("Enter the value in Fahrenhheit : ");
        int f = s.nextInt();
        float c = (float) ((5.0/9)*(f-32));
        System.out.print("Celsius value : "+ c);

    }
    
}
