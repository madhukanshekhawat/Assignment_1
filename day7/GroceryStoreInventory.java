package day7;

import java.util.HashMap;
import java.util.Map;

public class GroceryStoreInventory {
    private static void displayInventory(HashMap<String, Integer> stock) {
        for(Map.Entry<String, Integer> entry : stock.entrySet()){
            System.out.println("Name: " + entry.getKey()+","+"Stock Available is "+entry.getValue());
        }
    }
    public static void main(String[] args) {
        HashMap<String, Integer> stock = new HashMap<>();


        stock.put("Bread",20);
        stock.put("Butter",50);
        stock.put("Fresh Juice",30);
        stock.put("Milk",50);
        stock.put("Eggs",75);

        System.out.println("Current Stock");
        displayInventory(stock);

        stock.put("Milk",25);
        stock.put("Eggs",40);

        System.out.println("Updated Stock");
        displayInventory(stock);

//        String item = "Bananas";
          String item = "Egg";
        if (stock.containsKey(item)) {
            System.out.println("\nStock of " + item + ": " + stock.get(item));
        } else {
            System.out.println("\n" + item + " is not in the Stock.");
        }

        stock.remove("Bread");
        System.out.println("\nStock after removing Bread:");
        displayInventory(stock);

        System.out.println("\nContains Juice? " + stock.containsKey("Fresh Juice"));
        System.out.println("Contains 12 units of Milk ? " + stock.containsValue(12));


        System.out.println("\nSize of Stock: " + stock.size());

        stock.compute("Milk", (k, v) -> (v == null) ? 0 : v + 10);
        System.out.println("\nStock after computing new value for Milk:");
        displayInventory(stock);

        stock.merge("Eggs", 10, Integer::sum);
        System.out.println("\nInventory after merging value for Eggs:");
        displayInventory(stock);


        stock.clear();
        System.out.println("\nInventory after clearing:");
        displayInventory(stock);
        System.out.println("Oops! Nothing to show");
    }


}

