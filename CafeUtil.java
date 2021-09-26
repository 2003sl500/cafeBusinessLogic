import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Scanner;

public class CafeUtil{

    DecimalFormat f = new DecimalFormat("$###,###.00");
    Scanner input = new Scanner(System.in);
    // ArrayList<String> aLString = new ArrayList<>();
    // ArrayList<Double> aLDouble = new ArrayList<>();

    public int getStreakGoal(){
        int sum = 1;
        for(int i = 2; i <= 10; i++){
            sum += i;
        }
        return sum;
    }
    
    public int getStreakGoal(int numWeeks){
        int sum = 1;
        for(int i = 2; i <= numWeeks; i++){
            sum += i;
        }
        return sum;
    }

    public void printPriceChart(String productName, double price, int maxNumber){
        System.out.println("\n" + productName);
        for(int i = 1; i <= maxNumber; i++){
            double discount = ((i - 1) * .5);
            if(i > 1){
                System.out.println(i + " - " + f.format((price * i) - discount));
            } else {
                System.out.println(i + " - " + f.format(price * i));
            }
        }
    }

    public double getOrderTotal(double[] orderAmount){
        double sum = 0;
        for(int i = 0; i < orderAmount.length; i++){
           sum += orderAmount[i];
        }
        return sum;
    }

    public void displayMenu(ArrayList<String> menu, ArrayList<Double> prices){
        for(int i = 0; i < menu.size(); i++){
            System.out.println(i + " " + menu.get(i) + " -- " + f.format(prices.get(i)));
        }
    }

    ArrayList<String> customers = new ArrayList<>();
    public void addCustomer(){
        System.out.println("Please enter your name");
        String userName = input.nextLine();
        customers.add(userName);
        System.out.println("Hello, " + userName + ". There are " + (customers.size() - 1) + " customers ahead of you.");
        System.out.println(customers.toString() + "\n");
    }

    public void addManyCustomers(){
        // ArrayList<String> userName = new ArrayList<>();
        String tempInput = "";
        while(!tempInput.equals("q")){
            if(!tempInput.equals("q")){
                System.out.println("Please enter your name, press enter after each name. Enter q to finish.");
                tempInput = input.nextLine();
                customers.add(tempInput);
            }
        }
        customers.remove(customers.size()-1);
        System.out.println("Customers in the ArrayList:");
        System.out.println(customers.toString());
    }
}