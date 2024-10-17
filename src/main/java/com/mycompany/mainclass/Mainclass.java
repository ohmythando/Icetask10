/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.mainclass;
import javax.swing.JOptionPane;
/**
 *
 * @author thand
 */
public class Mainclass {

    public static void main(String[] args) {
         // Create ItemManager and PriceCalculator.
        PriceCalculator priceCalculator = new PriceCalculator();
        ItemManager itemManager = new ItemManager(priceCalculator);

        // Determine the most cost item by calculating the sum, average, maximum, and minimum.
        int sum = priceCalculator.calculateSum();
        double average = priceCalculator.calculateAverage();
        int maxPrice = priceCalculator.getMaxPrice();
        int minPrice = priceCalculator.getMinPrice();
        String highestPricedItem = itemManager.getItemWithHighestPrice();

        // Display results using JOptionPane
        //display sum of prices
        JOptionPane.showMessageDialog(null, "Sum of Prices: " + sum);
        //display average price
        JOptionPane.showMessageDialog(null, "Average Price: " + average);
        //display maximum price
        JOptionPane.showMessageDialog(null, "Maximum Price: " + maxPrice);
        //display minimum price
        JOptionPane.showMessageDialog(null, "Minimum Price: " + minPrice);
        //display item with the highest price
        JOptionPane.showMessageDialog(null, "Item with the Highest Price: " + highestPricedItem);
    }
}
  