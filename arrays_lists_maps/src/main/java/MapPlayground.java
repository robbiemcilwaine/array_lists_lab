import java.util.HashMap;

public class MapPlayground {
    public static void main(String[] args) {
        // reference type instead of primitive types - java uses autoboxing to automatically determine the type when methods are used
        HashMap<String, Integer> trainerHouseNumbers = new HashMap<>();

        trainerHouseNumbers.put("Colin", 16);
        trainerHouseNumbers.put("Zsolt", 45);
        trainerHouseNumbers.put("Thibyaa", 26);

        // can replace values using .put()
        trainerHouseNumbers.put("Zsolt", 57);

        int trainerHouse = trainerHouseNumbers.get("Zsolt");

        // .keySet() can be used to display the keys
        // .values() can be used to display values
        System.out.println(trainerHouseNumbers.keySet());

    }
}
