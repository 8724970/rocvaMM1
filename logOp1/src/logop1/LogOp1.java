/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package logop1;
import java.util.Scanner;

/**
 *
 * @author krijn
 */
public class LogOp1 {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);  // Reading from System.in
        System.out.println("Geef eerste boolean a (true of false)");
        boolean a = reader.nextBoolean(); // Scans the next token of the input as an int.
        
        System.out.println("Geef tweede boolean b (true of false)");
        boolean b = reader.nextBoolean();

     System.out.println("a and b are true:  a && b = " + (a&&b));

     System.out.println("a or b is true:  a || b = " + (a||b) );

     System.out.println("a and b are not true:  !(a && b) = " + !(a && b));
    }
    
}

