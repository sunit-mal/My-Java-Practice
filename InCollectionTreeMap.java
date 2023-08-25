/*
 * Tree Map Basically use to store data with a unique key.And it store value in a sorted order according
 * keys.
 * Syntex: Map<KeyDataType , ValueDataType> refarence = new TreeMap<>();
 */

import java.util.Comparator;
import java.util.Map;
import java.util.TreeMap;

public class InCollectionTreeMap {
    public static void main(String[] args) {
        Map<Integer, String> m = new TreeMap<>(Comparator.reverseOrder());    
                                //  Comparator.reverseOrder() use basically reverce the normal process

        // put(Key,Value) use for insertion
        m.put(1, "One");
        m.put(3, "Three");
        m.put(4, "Four");
        m.put(2, "Two");

        System.out.println(m);

        // containsKey(key) & containsValu(value) use to check that the value present or
        // not
        System.out.println(m.containsKey(3));
        System.out.println(m.containsValue("four"));

        // putIfAbsent(key,value) use for insert value, condition in the key already
        // present then it skip this insertion
        m.putIfAbsent(3, "three");
        System.out.println(m);

        // remove(key) use to remove a key and value from map
        m.remove(4);
        System.out.println(m);

        // Iterate process
        // Process 1:
        for (Map.Entry<Integer, String> variable : m.entrySet()) {
            System.out.print(variable.getKey());
            System.out.println("\t" + variable.getValue());
        }
        // Process 2:
        for (Integer key : m.keySet()) { // for iterate keys
            System.out.println(key);
        }
        for (String value : m.values()) { // for iterate values
            System.out.println(value);
        }
    }
}
