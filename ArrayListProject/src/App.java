import java.util.ArrayList;

public class App {
    public static void main(String[] args) throws Exception {

        // int primitive
        // Integer non permitive
        ArrayList<Integer> numbers = new ArrayList<Integer>();

        // Adding
        numbers.add(50);
        numbers.add(100);
        numbers.add(300);


        System.out.println("Iteration #1 :");
        // Retriving
        for (int i = 0; i < numbers.size(); i++) {
            System.out.println(numbers.get(i));
        }

        // Removing
        numbers.remove(numbers.size() - 1);

        // Slow remving
        numbers.remove(0);

        System.out.println("Iteration #2 :");
        // Second approach retrieving
        for (Integer value : numbers) {
            System.out.println(value);
        }

    }
}
