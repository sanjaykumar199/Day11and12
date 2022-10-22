package Com.bridgelabz.day11and12.StockAndManagement;
import java.util.*;
public class StockPortfolio extends StockAndManagement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the total number of Stocks");
        setNumOfStocks(sc.nextInt());
        for (int i = 1; i <= getNumOfStocks(); i++) {
            StockAccountManagement st = new StockAccountManagement();
            st.addShare();
            totalValue += stockPrice;
        }
        System.out.println("\nTotal Value is " + totalValue);

    }

}
}
