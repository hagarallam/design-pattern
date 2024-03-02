package Facade;

public class PriceCalculator {

    private static double userTotalAmount = 100 ;

    public static boolean checkIfValidPurchase(double totalPrice ){
        return userTotalAmount >= totalPrice;
    }

    public static void decreaseUserTotal(double cost){
        userTotalAmount -= cost;
        System.out.println("Current amount is "+userTotalAmount);
    }

    public static void increaseUserTotal(double refund){
        userTotalAmount += refund;
        System.out.println("Current amount is "+userTotalAmount);

    }
}
