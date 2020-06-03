package exceptionhandling;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author cacousins
 */
public class Division_1 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int numerator, denominator, result;
        try {
            System.out.print("Enter numerator : ");
            numerator = input.nextInt();
            System.out.print("Enter denominator : ");
            denominator = input.nextInt();
            result = numerator / denominator;
            System.out.println("Result is " + result);
        } 
        
        
        catch (ArithmeticException mistake) {
            System.out.println(mistake.getMessage());
            //System.out.println(mistake.getStackTrace());
            // System.out.println(mistake.toString());
        } 
        
        
        catch (InputMismatchException mistake) {
            System.out.println("Wrong Data!");
        }

        System.out.println("End of program");
    }

}
