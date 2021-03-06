/*
 * Vergeet niet bij je eigen code hier je naam,
 * versienummer, datum, enzovoort neer te zetten.
 */
package basisjava1;

import java.util.Random;

/**
 *
 * @author Hoogendorp
 */
public class BasisJava1 {


    public static void main(String[] args) {
        TestArray();
        RandomInteger();
        log("doe je best");
    }
    
    private static void TestArray() {
        //Met deze code kun je kijken hoe arrays werken (en hoe entries van arrays met elkaar vergeleken kunnen worden. 
        double[] myList = {1.9, 2.9, 3.4, 3.5};
        String[] masterList1 = {"rood", "geel", "blauw"};
        String[] raadList1 = {"rood", "rood", "blauw"};
        int y = 0;
        for (int i = 0; i < masterList1.length; i++) {
            if(masterList1[i].equals(raadList1[i])) {
                System.out.println("positie " + i + " zelfde kleur zelfde plek " +masterList1[i]);
                y++;
            }
        }
        System.out.println("er zijn " +y+ " zwarte pinnetjes");
      
        // getallen bij elkaar optellen gaat alsvolgt:
        double total = 0;
        for (int i = 0; i < myList.length; i++) {
            total += myList[i];
        }
        System.out.println("Total is " + total);
      
        // Finding the largest element
        double max = myList[0];
        for (int i = 1; i < myList.length; i++) {
            if (myList[i] > max) max = myList[i];
        }
        System.out.println("Max is " + max);
    
    }

    private static void RandomInteger() {
    //Deze code laat zien hoe je random getallen kan genereren
        Random randomGenerator = new Random();
        for (int idx = 1; idx <= 10; ++idx){
            int randomInt = randomGenerator.nextInt(100);
            log("Generated : " + randomInt);
        }
        log("Done.");
    }
  
    private static void log(String aMessage){
        System.out.println(aMessage);
    }    
}
