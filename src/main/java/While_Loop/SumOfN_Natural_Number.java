package While_Loop;

import java.util.Scanner;

/**
 *
 * @author maheshvari.keshari
 */
public class SumOfN_Natural_Number {
    public static void main(String args[]){
    
        Scanner s = new Scanner(System.in);
        System.out.print("Enter value: ");
        int n = s.nextInt();
        int sum = 0, i = 1;
        while (i<=n){
        sum = sum+i;
        i++;
        }
        System.out.println("Sum of "+n+" Natural Number: " +sum);
    }
}
