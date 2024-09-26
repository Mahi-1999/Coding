package If_Else_Condition;

import java.util.Scanner;

/**
 *
 * @author maheshvari.keshari
 */
public class EvenNumber {
    public static void main(String [] args){
    
        Scanner s = new Scanner(System.in);
        System.out.print("Enter value to check No. is even or odd: ");
        int a = s.nextInt();
        if(a%2 == 0){
        System.out.println("Number is Even");
        }else{
        System.out.println("Number is odd");
        }
    }
    
}
