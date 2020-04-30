package maps;


import java.util.HashMap;
import java.util.Map;

public class RestaurantExplorer {
    public static void main(String [] args) {
        // Step 1. Create a new empty HashMap.
        // The keys should be the names of the restaurant.
        // The values should be the restaurant objects.

        Map<String, Restaurant> RestaurantMap = new HashMap<String, Restaurant>();
        // Step 2. Add five restaurants to the map (hint: use put()).
        RestaurantMap.put("China Pavilion", new Restaurant("China Pavilion", "Chinese", 9));
        RestaurantMap.put("Los Arroyos", new Restaurant("Los Arroyos", "Mexican", 8));
        RestaurantMap.put("Flavor of India", new Restaurant("Flavor of India", "Indian", 6));
        RestaurantMap.put("Farmer Boy", new Restaurant("Farmer Boy", "American", 6));
        RestaurantMap.put("Via Vai", new Restaurant("Via Vai", "Italian", 7));


        // Step 3. Print the names of each restaurant (hint: use keySet()).
        System.out.println(RestaurantMap.keySet());

        // Step 4. Remove one of the restaurants by name. Check to make sure
        // it no longer exists and print out the result (hint: use containsKey()).
        RestaurantMap.remove("Via Vai");
        System.out.println(RestaurantMap.containsKey("Via Vai"));
        // Step 5. Print the restaurant objects (hint: use values())
        System.out.println(RestaurantMap.values());

        // Step 6. Print the restaurant names and objects (hint: use entrySet()).
        System.out.println(RestaurantMap.entrySet());
    }
}
