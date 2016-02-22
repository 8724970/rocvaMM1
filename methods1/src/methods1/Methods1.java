/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package methods1;
import java.util.Random;

/**
 *
 * @author krijn
 */
public class Methods1 {

    public static void main(String[] args) {
        String[] mList = {"rood", "geel", "blauw"};
        String[] rList = {"rood", "rood", "blauw"};
        TestArray(mList, rList);
        RandomInteger(5);
        log("doe je best");
    }
    
    private static void TestArray(String[] masterList1, String[] raadList1) {
        //Met deze code kun je kijken hoe arrays werken (en hoe entries van arrays met elkaar vergeleken kunnen worden. 
        double[] myList = {1.9, 2.9, 3.4, 3.5};
        //String[] masterList1 = {"rood", "geel", "blauw"};
        //String[] raadList1 = {"rood", "rood", "blauw"};
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

    private static void RandomInteger(int maxNumber) {
    //Deze code laat zien hoe je random getallen kan genereren
        Random randomGenerator = new Random();
        for (int idx = 1; idx <= 10; ++idx){
            int randomInt = randomGenerator.nextInt(maxNumber);
            log("Generated : " + randomInt);
        }
        log("Done.");
    }
  
    private static void log(String aMessage){
        System.out.println(aMessage);
    }    
}
