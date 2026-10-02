package JAVACOLLECTIONFRAMEWORK;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

import static java.lang.System.in;

public class MAPINTERFACE {
    public static void main(String[] args) {

        // MAP
        Map<String,String> map = new HashMap<>();

        //insertion
        map.put("in","India");
        map.put("in","India2");
        map.put("us","USA");
        map.put("en","England");

        System.out.println(map);


        Map<String,String> table = new HashMap<>();
        table.put("br","brazil");
        System.out.println("Before :"+table);
        table.put("fr","france");

        table.putAll(map);
        System.out.println("After :"+table);

        // deletion

        table.remove("in");
        System.out.println(table);

//        System.out.println(table.size());
//        table.clear();
//        System.out.println(table.size());

//        table.putIfAbsent("is","India4");
//        System.out.println(table);

        System.out.println(table.get("br"));

        System.out.println(table.getOrDefault("usa","none"));

        System.out.println(table.containsKey("us"));

        System.out.println(table.containsValue("france"));

        System.out.println(table);

        table.replace("br","indonesia");

        System.out.println(table);


        Set<String> keyset = table.keySet();
        System.out.println(keyset);

        Collection<String> valueset = table.values();
        System.out.println(valueset);

        // get all the entries from the map

        Set<Map.Entry<String,String>> entryset = table.entrySet();

        System.out.println("Printing Entries : "+entryset);

        Map<Integer,String> map2 = new HashMap<>();

        map2.put(1,"One");
        map2.put(2,"Two");
        map2.put(3,"Three");

//        for (Map.entry<Integer,String> entry : map2.entrySet()  ) {
//
//            System.out.println("Key : "+ entry.getKey() + "Values: "+ entry.getValue());
//        }












































    }
}
