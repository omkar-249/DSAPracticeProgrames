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

        private static int getMaxProfit(int[] prices){
            int buyDay = -1, sellDay = prices.length-1, i = prices.length-1;
            while(i >= 0){
                if(prices[i] > prices[sellDay] && i > buyDay){
                    sellDay = i;
                } else if ((buyDay == -1 || prices[i] < prices[buyDay]) && i < sellDay) {
                    buyDay = i;
                }
                System.out.println("Buyday : " + buyDay + " : sellDay : " + sellDay);
                i--;
            }
            System.out.println("Buyday : " + buyDay + " : sellDay : " + sellDay);
            if(buyDay == -1 || buyDay == sellDay) return 0;
            return prices[sellDay] - prices[buyDay];
        }

        private static int getBuyDay(int[] prices){

            int currMinPrice = prices[0], currBuyDay = 0;
            for(int i = 0; i < prices.length; i++){
                if(prices[i] < currMinPrice) {
                    currMinPrice = prices[i];
                    currBuyDay = i;
                }
            }
            return currBuyDay;
        }

        private static int getSellDay(int[] prices, int buyDay){

            int sellDay = buyDay, currMaxProfit = 0;
            for(int i = buyDay + 1; i < prices.length; i++){
                if((prices[i] - prices[buyDay]) > currMaxProfit){
                    sellDay = i;
                    currMaxProfit = prices[i] - prices[buyDay];
                }
            }
            return sellDay;
        }
}
