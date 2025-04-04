package RajaSoftware;

public class buyandsellshare {
    public static void main(String[] args) {
        int[] prices = {1, 5, 2, 3, 7, 6, 4, 5};

        if(prices.length < 2){
            System.out.println("Not enough data to calculate profit");
            return;
        }
        int minPrice = prices[0];   //minimum price seen so far
        int maxProfit = 0;          //maximum profit

        for(int i=1;i<prices.length;i++){
            if(prices[i]<minPrice){
                minPrice = prices[i];
            }
 // Calculate profit if selling at current price
            int profit = prices[i] - minPrice;
                // Update maxProfit if we get a higher profit
                if(profit>maxProfit){
                    maxProfit = profit;
                }
        }

System.out.println("Maximum proft: " +maxProfit);
    }
}
