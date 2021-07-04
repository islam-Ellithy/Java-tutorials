import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class App {
    public static void main(String[] args) throws Exception {

        /*
         * [0][1][2][3][4][5]
         */
        List<Integer> arrayList = new ArrayList<Integer>();

        /*
         * previous next [0]<->[1]<->[2]<->[3]
         */
        List<Integer> linkedList = new LinkedList<Integer>();

        doTimings("ArrayList", arrayList);

        doTimings("LinkedList", linkedList);

    }

    public static void doTimings(String type, List<Integer> list) {
        for (int i = 0; i < 1E5; i++) { // 100000
            list.add(i);
        }

        long start = System.currentTimeMillis();

        // Add items at end of list best is ArrayList

        /*
         * for (int i = 0; i < 1E5; i++) { list.add(i); }
         */

        // Add item at 0 best is LinkedList
        /*
         * for (int i = 0; i < 1E5; i++) { list.add(list.size() - 100, i); }
         */
        // Add item at 0 best is LinkedList
        for (int i = 0; i < 100; i++) {
            list.remove(list.size() - 1);
        }

        long end = System.currentTimeMillis();

        System.out.println(type + " Timing : " + (end - start));
    }
}
