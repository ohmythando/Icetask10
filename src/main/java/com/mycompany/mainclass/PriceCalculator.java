/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mainclass;
import javax.swing.JOptionPane;
/**
 *
 * @author thand
 */
class PriceCalculator {
  // Array for prices
    public int[] prices = {200, 350, 700, 400};

    // Create a  method to calculate the sum of prices
    public int calculateSum() {
        int sum = 0;
        for (int price : prices) {
            sum += price;
        }
        //return the sum of the prices 
        return sum;
    }

    // Create a method to calculate the average of prices
    public double calculateAverage() {
        int sum = calculateSum();
        return sum / (double) prices.length;
    }

    // Create a method to get the maximum price
    public int getMaxPrice() {
        int max = prices[0];
        for (int price : prices) {
            if (price > max) {
                max = price;
            }
        }
        //return maximum price
        return max;
    }

    // Create a method to get the minimum price
    public int getMinPrice() {
        int min = prices[0];
        for (int price : prices) {
            if (price < min) {
                min = price;
            }
        }
        //return minimum price 
        return min;
    }

    // Input a getter for prices array
    public int[] getPrices() {
        //return prices
        return prices;
    }
}

class ItemManager {
    // Array for items
    public String[] items = {"Shirt", "Pants", "Sneakers", "Jacket"};
    public PriceCalculator priceCalculator;

    // Create a constructor to take PriceCalculator instance
    public ItemManager(PriceCalculator priceCalculator) {
        this.priceCalculator = priceCalculator;
    }

    // Create a method to get the item with the highest price
    public String getItemWithHighestPrice() {
        int[] prices = priceCalculator.getPrices();
        int maxPrice = priceCalculator.getMaxPrice();
        String highestPricedItem = "";
//use a forloop to loop until it finds the item with the highest price 
        for (int i = 0; i < prices.length; i++) {
            if (prices[i] == maxPrice) {
                highestPricedItem = items[i];
                break;
            }
        }
        //return the highest priced item in the array
        return highestPricedItem;
    }
}  
