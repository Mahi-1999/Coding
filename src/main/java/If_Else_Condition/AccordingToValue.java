package If_Else_Condition;

import java.util.Scanner;

/**
 *
 * @author maheshvari.keshari
 */
public class AccordingToValue {
    public static void main(String args[]){
    
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the value: ");
        String str = s.nextLine();
        char c = str.charAt(0);
        
        if(c>='A' && c<='Z'){
            System.out.println("Value is 1");
        }else if(c>='a' && c<='z'){
            System.out.println("Value is 0");
        }else{
            System.out.println("Value is -1");
        }
    }
}
