package Com.bridgelabz.day11and12.StockAndManagement;
import java.util.*;
public class StockAndManagement {
    private static int numOfStocks;
    private static String shareName;
    private static int numOfShare;
    private static int sharePrice;
    static int stockPrice;
    static int totalValue;
    public static int getNumOfStocks() {
        return numOfStocks;
    }
    public static void setNumOfStocks(int numOfStocks) {
        StockAccountManagement.numOfStocks = numOfStocks;
    }
    public static String getShareName() {
        return shareName;
    }
    public static void setShareName(String shareName) {
        StockAccountManagement.shareName = shareName;
    }
    public static int getNumOfShare() {
        return numOfShare;
    }
    public static void setNumOfShare(int numOfShare) {
        StockAccountManagement.numOfShare = numOfShare;
    }
    public static int getSharePrice() {
        return sharePrice;
    }
    public static void setSharePrice(int sharePrice) {
        StockAccountManagement.sharePrice = sharePrice;
    }
    public static int getStockPrice() {
        return stockPrice;
    }
    public static void setStockPrice(int stockPrice) {
        StockAccountManagement.stockPrice = stockPrice;
    }
    public static int getTotalValue() {
        return totalValue;
    }
    public static void setTotalValue(int totalValue) {
        StockAccountManagement.totalValue = totalValue;
    }

    public void addShare() {

        // user adds new Shares and its  details

        Scanner input = new Scanner(System.in);
        System.out.println("\nEnter the Name of Share");
        shareName = input.nextLine();
        System.out.println("Enter the number of Shares");
        numOfShare = input.nextInt();
        System.out.println("Enter the price for Shares");
        sharePrice = input.nextInt();
        stockPrice = numOfShare * sharePrice;
        System.out.println("\nValue of Stock " + shareName + " is = " + stockPrice);
        input.close();
    }

}

