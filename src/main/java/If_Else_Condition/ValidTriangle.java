package If_Else_Condition;

import java.util.Scanner;

/**
 *
 * @author maheshvari.keshari
 */
public class ValidTriangle {
    
    public static void main(String args[]){
    
        Scanner s = new Scanner(System.in);
        System.out.print("Enter value of A: ");
        int A = s.nextInt();
        System.out.print("Enter value of B: ");
        int B = s.nextInt();
        System.out.print("Enter value of C: ");
        int C = s.nextInt();
        
        if (A>=B && B>=C){
            System.out.print("A is greater");
        }else if(B>=C && C>=A){
            System.out.print("B is greater");
        }else{
            System.out.print("C is greater");
        }
        
    }
    
}
