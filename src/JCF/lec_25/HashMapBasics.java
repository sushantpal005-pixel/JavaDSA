package JCF.lec_25;

import java.util.*;

public class HashMapBasics {
    static void main() {
        Map<String, String> mapping = new HashMap<>();
//        Map<String, String> mapping = new LinkedHashMap<>(); // preserves insertion order
//        Map<String, String> mapping = new TreeMap<>(); // maintains sorted order

        // Insertion
        mapping.put("in", "India");
        mapping.put("en", "England");
        mapping.put("us", "United States");

        System.out.println(mapping);

        Map<String, String> table = new HashMap<>();
        table.put("br", "brazil");

        System.out.println("Before: " + table);
        table.putAll(mapping);
        System.out.println("After: " + table);


        // Deletion
        table.remove("en");
        System.out.println(table);

        System.out.println(table.get("br"));

        System.out.println(table.getOrDefault("usa", "NONE"));

        System.out.println(table.containsKey("in"));

        System.out.println(table.containsValue("United States of America"));
        System.out.println(table);

        table.replace("in", "Indonesia");
        System.out.println(table);

        Set<String> keySet = table.keySet();
        System.out.println(keySet);

        Collection<String> valueSet =  table.values();
        System.out.println(valueSet);

        // get all the entries from map
        Set<Map.Entry<String, String>> entrySet = table.entrySet();
        System.out.println("Printing Entries: " + entrySet);






//        table.putIfAbsent("is", "India3");
//        System.out.println(table);
//        System.out.println(table.size());
//        table.clear();
//        System.out.println(table.size());



    }
}
