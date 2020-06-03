/*
 *Program Name:     ExceptionHandling.java
        Author:     Colin Cousins
          Date:     June 02, 2020
   Description:     Demonstration of Exception Handling
 */
package exceptionhandling;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;


public class ExceptionHandling {

        public static void main(String[] args) throws IOException {
        
            String contentInFile = "Colin Cousins ";
            
            FileWriter fileWriter = new FileWriter("c:/csc/sample.txt");
            PrintWriter printWriter = new PrintWriter(fileWriter);
            
            printWriter.print(contentInFile);
            
            printWriter.printf("Blog name is %s","CAC Guide");
            printWriter.close();
            
          
    }
    
}
