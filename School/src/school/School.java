/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package school;

/**
 *
 * @author krijn
 */
public class School {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // 
      Student jJansen = new Student("Jan Jansen");
      Student gMadeira = new Student("Geoffrey Madeira");
      
      
      jJansen.addVakCijfer("AO", 8);
      jJansen.addVakCijfer("Databases", 5);
      jJansen.addVakCijfer("Engels", 9);
      jJansen.printCijfers();
      System.out.printf("The average grade is %.2f", jJansen.getGemiddeldCijfer());
      
      System.out.println("\n###");
      gMadeira.addVakCijfer("AO", 7); 
      gMadeira.addVakCijfer("engels", 8);
      gMadeira.printCijfers();
      System.out.printf("The average grade is %.2f",gMadeira.getGemiddeldCijfer());
      System.out.println("\n");
      
    }
    
}
