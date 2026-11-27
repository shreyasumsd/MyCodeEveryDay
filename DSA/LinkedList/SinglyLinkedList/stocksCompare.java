package DSA.LinkedList.SinglyLinkedList;

public class stocksCompare 
{
    public static void getStockProfit(int[] array) 
    {
        if(array==null)
        {
            System.out.println("array is null");
            return;
        }
        int maxProfit = 0;

        for (int buy = 0; buy < array.length; buy++) 
        {
            for (int sell = buy + 1; sell < array.length; sell++) 
            {

                int profit = array[sell] - array[buy];

                if (profit > maxProfit) 
                {

                    maxProfit = profit;
                    System.out.println("buying prize: "+array[buy]+" selling prize: "+array[sell]+" profit: "+maxProfit);
                }

            }
        }

        System.out.println(maxProfit);
    }

    public static int getProfit(int[] stockPrices)
    {
        int minPrice = stockPrices[0];
        int maxProfit = 0;

        for(int buy = 1; buy < stockPrices.length; buy++)
        {
            int profit = stockPrices[buy] - minPrice;

            if(profit > maxProfit)
            {
                maxProfit = profit;
            }

            if(stockPrices[buy] < minPrice)
            {
                minPrice = stockPrices[buy];
            }
        }

        return maxProfit;
    }

    static void main(String[] args) 
    {
        int [] array={7,1,5,3,6,4};
        // int [] array={0};
        //int [] array=null;
        //int[] array={};

        int [] prices = {7,1,5,3,6,4};
        getStockProfit(array);
        
        int result = getProfit(prices);
        System.out.println("Maximum Profit: " + result);
    }
}