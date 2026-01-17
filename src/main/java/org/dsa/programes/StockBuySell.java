package org.dsa.programes;

public class StockBuySell {

        static void main() {
           // int[] prices = new int[]{7,1,5,3,6,4};
           // int[] prices = new int[]{2,4,1};

           // System.out.println("Max Profit : + " + getMaxProfit(prices));
//            int buyDay = getBuyDay(prices);
//            int sellDay = getSellDay(prices, buyDay);
//            System.out.println("buyDay : " + buyDay + " : sellDay : " + sellDay);
//            if(buyDay == sellDay) System.out.println("No best time");
//            else System.out.println("Best time is : " + (prices[sellDay] - prices[buyDay]));
            //int[] prices = new int[]{7,1,5,3,6,4};
//            int[] prices = new int[]{2,4,1};
            int[] prices = new int[]{3,2,6,5,0,3};
            System.out.println("Max Profit : + " + getMaxProfit(prices));
        }

    public static int getMaxProfit(int[] prices) {

        int maxProfit = 0, buyDay = prices[0];

        for(int i : prices){
            if(i - buyDay > maxProfit){
                maxProfit = i - buyDay;
            }else if(i < buyDay){
                buyDay = i;
            }
        }
        return maxProfit;
    }
}
