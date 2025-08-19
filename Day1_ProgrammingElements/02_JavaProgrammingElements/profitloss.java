// Create a program to calculate the profit and loss in number and percentage based on the cost price of INR 129 and the selling price of INR 191. 
// Hint => 
// Use a single print statement to display multiline text and variables.
// Profit = selling price - cost price
// Profit Percentage = profit / cost price * 100
// I/P => NONE
// O/P => 
// The Cost Price is INR ___ and Selling Price is INR ___
// The Profit is INR ___ and the Profit Percentage is ___

public class profitloss {
    
    public static int calculateProfitPercentage(int costprice, int sellingprice) {
        int profit = sellingprice - costprice;
        int profitpercentage = (profit / costprice) * 100;
        return profitpercentage;
    
    }
    public static void main(String args[]){
        int costprice = 129;
        int sellingprice = 191;
        int profit  = sellingprice -costprice;
        int profitpercentage=calculateProfitPercentage(costprice, sellingprice);
        System.out.println("The Cost Price is INR: " + costprice + " and Selling price is INR: " + sellingprice);
        System.out.println("Profit is INR: " + profit +" and the Profit Percentage is: " + profitpercentage + "%");

    }
    
}
