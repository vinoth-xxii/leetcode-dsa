class Solution {    //passes only for certain conditons
    public int maxProfit(int[] prices) {
       int min_pt = 0;
       int total = 0;
       for(int i = 1; i < prices.length; i++){ //just traversing the array
            if(prices[i] < prices[min_pt]){ //whenever i get new minimum, i will update the max
                min_pt = i;
                // total = 0;
            }
            else{
                int difference = prices[i] - prices[min_pt];
                total = Math.max(difference, total);
            }
       }

       return total;
    }
}