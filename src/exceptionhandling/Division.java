package exceptionhandling;

import java.util.Scanner;

/**
 *
 * @author cacousins
 */
public class Division {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int numerator, denominator, result;

        System.out.print("Enter numerator : ");
        numerator = input.nextInt();

        System.out.print("Enter denominator : ");
        denominator = input.nextInt();

        if (denominator == 0) {
            System.out.println("Cannot divide by 0");
        } else {
            result = numerator / denominator;
            System.out.println("Result is :" + result);
        }

    }

}
