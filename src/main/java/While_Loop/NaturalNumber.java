package While_Loop;

import java.util.Scanner;

/**
 *
 * @author maheshvari.keshari
 */
public class NaturalNumber {
    public static void main(String args[]){
    
        Scanner s  = new Scanner(System.in);
        System.out.print("Enter value: ");
        int n = s.nextInt();
        int i = 1;
        while(i<=n){
        System.out.println(i);
        i++;
        }
    }
}
