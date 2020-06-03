/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package bicycle;

/**
 *
 * @author cacousins
 */
public class InvalidColourException extends Exception {

    public InvalidColourException(String colour) {
        super("You tried to create an object with the colour " + colour + 
                " That's not allowed");
    }

        
}
