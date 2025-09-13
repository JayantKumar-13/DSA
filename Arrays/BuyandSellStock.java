import java.util.*;
public class BuyandSellStock {                        // TC is O(n)
    public static int BuyandSellStocks(int prices[]){
        int BuyPrice = Integer.MAX_VALUE;
        int MaxProfit = 0;
        for(int i=0;i<prices.length;i++){
            if(BuyPrice<prices[i]){
                int profit = prices[i] - BuyPrice;
                MaxProfit = Math.max(MaxProfit, profit);
            }
            else{
                BuyPrice = prices[i];
            }
        }
        return MaxProfit;
    }
    public static void main(String[] args) {
        int prices[] = {7,1,5,3,6,4};
        System.out.println(BuyandSellStocks(prices));
    }
}
