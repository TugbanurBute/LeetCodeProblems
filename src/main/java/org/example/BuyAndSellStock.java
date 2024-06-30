package org.example;

import java.util.HashMap;
import java.util.Map;

public class BuyAndSellStock {
    public int maxProfit(int[] prices) {
        // Initialize the minimum price to a large value and max profit to 0
        int minPrice = Integer.MAX_VALUE;
        int maxProfit = 0;

        // Iterate over the price array
        for (int price : prices) {
            // Update the minimum price if the current price is lower
            if (price < minPrice) {
                minPrice = price;
            }

            // Calculate the profit if selling at the current price
            int profit = price - minPrice;

            // Update the maximum profit if the current profit is higher
            if (profit > maxProfit) {
                maxProfit = profit;
            }
        }

        return maxProfit;
    }
}
