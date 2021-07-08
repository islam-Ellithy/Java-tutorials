import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class App {
    public static void main(String[] args) throws Exception {

        HashMap<Integer, String> values = new HashMap<Integer, String>();

        values.put(1, "One");
        values.put(2, "Two");
        values.put(3, "Three");
        values.put(4, "Four");

        for (Map.Entry<Integer, String> entry : values.entrySet()) {
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }

        Set<Integer> keys = values.keySet();

        System.out.println("Keys");
        for (Integer key : keys) {
            System.out.println(key);
        }

    }
}
