import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class App {

    public static void main(String[] args) throws Exception {

        HashMap<Integer, String> hashMap = new HashMap<Integer, String>();
        LinkedHashMap<Integer, String> linkedHashMap = new LinkedHashMap<Integer, String>();
        TreeMap<Integer, String> treeMap = new TreeMap<Integer, String>();

        readItems("HashMap", hashMap);

        readItems("LinkedHashMap", linkedHashMap);

        readItems("TreeMap", treeMap);

    }

    public static void readItems(String type, Map<Integer, String> map) {

        System.out.println(type);

        map.put(3, "Three");
        map.put(5, "Five");
        map.put(1, "One");
        map.put(0, "Zero");
        map.put(10, "Ten");

        for (Map.Entry<Integer, String> entry : map.entrySet()) {
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }

        System.out.println("====================================");

    }
}
