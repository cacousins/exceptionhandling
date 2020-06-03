/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bicycle;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author cacousins
 */
public class TestBicycle {

    public static void main(String[] args) {

        Bicycle[] myBicycle = new Bicycle[2];
        try {
            myBicycle[0] = new Bicycle("Hero", "red");
            System.out.println("Bike make is : " + myBicycle[0].getMake()
                    + " and colour is " + myBicycle[0].getColour());

            myBicycle[1] = new Bicycle("Hero", "green");
            System.out.println("Bike make is : " + myBicycle[1].getMake()
                    + " and colour is " + myBicycle[1].getColour());

        } catch (InvalidColourException ex) {
            System.out.println(ex.getMessage());
        }

    }

}
