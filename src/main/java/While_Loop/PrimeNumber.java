package While_Loop;

import java.util.Scanner;

/**
 *
 * @author maheshvari.keshari
 */
public class PrimeNumber {

    public static void main(String args[]) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter value: ");
        int n = s.nextInt();
        int i = 2;
        boolean result = true;
        if (n < 2) {
//            System.out.println("Not prime");
            result = false;
        }
        while (i < n) {
            if (n % i == 0) {
//                System.out.println("Not prime");
                result = false;
            }
            i++;
        }
        if(result){
        System.out.println("prime");
        }else{
        System.out.println("Not prime");
        }
    }
}
