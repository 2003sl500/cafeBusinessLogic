import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.text.DecimalFormat;

public class TestCafe {
    public static void main(String[] args) {
        CafeUtil cafeUtil = new CafeUtil();
        DecimalFormat f = new DecimalFormat("$###,###.00");

        System.out.println("----- Streak Goal Test -----\n");
        System.out.println("Purchases needed by week 10: " + cafeUtil.getStreakGoal());

        System.out.println("\n----- Price Chart Test -----");
        cafeUtil.printPriceChart("Chai Latte Mix", 4.5, 3);
        cafeUtil.printPriceChart("Specialty Coaster", 2.0, 5);

        System.out.println("\n----- Order Total Test -----");
        double[] lineItems = {1.3, 1.5, 4.0, 4.5};
        System.out.println("Order total: " + f.format(cafeUtil.getOrderTotal(lineItems)));

        System.out.println("\n----- Display Menu Test -----");
        List<String> loadMenu = Arrays.asList("drip coffee", "cappucino", "latte", "mocha");
        List<Double> loadPrices = Arrays.asList(1.5, 3.5, 4.5, 3.5);
        ArrayList<String> menu = new ArrayList<String>();
        ArrayList<Double> prices = new ArrayList<Double>();        
        menu.addAll(loadMenu);
        prices.addAll(loadPrices);
        cafeUtil.displayMenu(menu, prices);

        // The customers that print at the end, shows all the customers, 
        // from the addCustomer and addManyCustomers methods.
        System.out.println("\n----- Add Customer Test -----");
        for(int i = 0; i < 4; i++){
            cafeUtil.addCustomer();
        }

        System.out.println("\n----- Add Many Customers Test -----");
        cafeUtil.addManyCustomers();
    }
}
