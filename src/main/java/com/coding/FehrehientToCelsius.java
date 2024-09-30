package com.coding;

import java.util.Scanner;

/**
 *
 * @author maheshvari.keshari
 */
public class FehrehientToCelsius {
    public static void main(String args[]){
     Scanner s = new Scanner(System.in);
     System.out.println("Enter value of starting Fahrenheit: ");
     int sf = s.nextInt();
     System.out.println("Enter value of ending Fahrenheit: ");
     int ef = s.nextInt();
     System.out.println("Enter value of sep Fahrenheit: ");
     int wf = s.nextInt();
     float celsius;
     while(sf<=ef){
     
         celsius = (float) ((5.0/9)*(sf-32));
         
         System.out.println("Celsius of Fahrenheit "+ sf + ":" + celsius);
         sf = sf+wf;
     }
    }
}
