/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package java_prg_02_16_energy_drink_consumption;

/**
 *
 * @author bluebackdev
 * A soft drink company recently surveyed 12,467 of its customers and found
 * that approximately 14 percent of those surveyed purchase one or more
 * energy drinks per week. Of those customers who purchase energy drinks,
 * approximately 64 percent of them prefer citrus-flavored energy drinks.
 * Write a program that displays the following:
 *  - The approximate number of customers in the survey who purchase one or
 *    more energy drinks per week
 *  - The approximate number of customers in the survey who prefer citrus-
 *    flavored energy drinks
 */
public class JAVA_PRG_02_16_Energy_Drink_Consumption {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Define constants
        final int INT_CUSTOMERS = 12467;
        
        final float FLT_PERCENT_MULTIPLE = 0.14f;
        final float FLT_PERCENT_CITRUS = 0.64f;
        
        // Declare variables for storing percent of customers
        int intMultiple;
        int intCitrus;
        
        // Calculate number of customers, rounded to nearest int
        intMultiple = (int)(INT_CUSTOMERS * FLT_PERCENT_MULTIPLE);
        intCitrus = (int)(INT_CUSTOMERS * FLT_PERCENT_CITRUS);
        
        // Output result to the console
        System.out.println(intMultiple + " customers consume more than one" +
                            " energy drink per week and\n" + intCitrus +
                            " customers prefer citrus-flavored drinks");
    }
    
}
