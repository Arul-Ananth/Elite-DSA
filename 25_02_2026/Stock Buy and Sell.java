class Solution {
    public int maximumProfit(int[] prices) {
        int minPrice = Integer.MAX_VALUE;
        int maxProfit = 0;

        for (int p : prices) {
            if (p < minPrice) minPrice = p;
            else {
                int profit = p - minPrice;
                if (profit > maxProfit) maxProfit = profit;
            }
        }
        return maxProfit;
    }
}
}