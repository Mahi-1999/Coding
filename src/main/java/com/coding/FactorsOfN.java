/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.coding;

import java.util.Scanner;

/**
 *
 * @author maheshvari.keshari
 */
public class FactorsOfN {
    public static void main(String args[]){
     Scanner s = new Scanner(System.in);
     System.out.println("Enter value: ");
     int n = s.nextInt();
     int i = 1;
     while(i<=n){
     if(n%i == 0){
          System.out.println(i);
     }
     i++;
     }
    }
}
