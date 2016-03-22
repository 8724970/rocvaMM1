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
// The student class definition
public class Student {
   // Private member variables
   private String naam;
   // Courses taken and grades for the courses are kept in 2 arrays of the same length
   private String[] vakken;
   private int[] cijfers;     // A grade is between 0 to 100
   private int numVakken;   // Number of courses taken so far
   private static final int MAX_VAKKEN = 30;  // maximum courses
 
   // Constructor
   public Student(String naam) {
      this.naam = naam;
      vakken = new String[MAX_VAKKEN];  // allocate arrays
      cijfers = new int[MAX_VAKKEN];
      numVakken = 0;                     // no courses so far
   }
 
   // Public getter for private variable name
   public String getNaam() {
      return naam;
   }
 
 
   // Describe itself
   public String toString() {
      return naam;
   }
 
   // Add a course and grade
   public void addVakCijfer(String vak, int cijfer) {
      vakken[numVakken] = vak;
      cijfers[numVakken] = cijfer;
      ++numVakken;
   }
 
   // Print all courses taken and their grades
   public void printCijfers() {
      System.out.print(this);   // toString()
      for (int i = 0; i < numVakken; ++i) {
         System.out.print(" " + vakken[i] + ":" + cijfers[i]);
      }
      System.out.println();
   }
 
   // Compute the average grade
   public double getGemiddeldCijfer() {
      int sum = 0;
      for (int i = 0; i < numVakken; ++i) {
         sum += cijfers[i];
      }
      return (double)sum/numVakken;
   }
}
