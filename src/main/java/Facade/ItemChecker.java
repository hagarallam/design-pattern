package Facade;

import java.util.ArrayList;
import java.util.List;

public class ItemChecker {

    private static List<String> CURRENT_ITEMS  = new ArrayList<>(List.of(new String[]
            {"BOOK", "PEN", "PHONE", "APPLE", "WATER"}));

   public static boolean checkIfAllItemExists(List<String> items){
       boolean isAllExists = true;
       for(String item : items){
           if(!CURRENT_ITEMS.contains(item)){
               isAllExists  = false;
           }
       }
       return isAllExists;
   }

   public static void removeNonExistenceItem(List<String> items) {
       for (String item : items) {
           if (!CURRENT_ITEMS.contains(item)) {
               items.remove(item);
           }
       }
       items.stream().forEach(System.out::println);
   }

   public static void removeItemFromStock(List<String> item){
       CURRENT_ITEMS.removeAll(item);
       System.out.println("CURRENT STOCK IS :");
        CURRENT_ITEMS.stream().forEach(System.out::println);
   }


    public static void returnItemToStock(List<String> item){
        CURRENT_ITEMS.addAll(item);
        System.out.println("CURRENT STOCK IS :");
        CURRENT_ITEMS.stream().forEach(System.out::println);

    }

}
