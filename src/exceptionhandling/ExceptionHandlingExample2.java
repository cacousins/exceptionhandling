/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package exceptionhandling;

/**
 *
 * @author cacousins
 */
public class ExceptionHandlingExample2 {
    public static void main(String[] args) {
        
        try {
            System.out.println(10 / 2);
            //System.out.println(10 / 0);//error is detected
            System.out.println(100 / 2);
            System.out.println(500 / 10);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        finally{
            System.out.println("this will always run");
        }
    }

}
