import java.util.LinkedList;
import java.util.ListIterator;

public class LinkedListIteratorss {
    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<>();
        for (int i = 0; i < 1000000; i++) {
            list.add(i);
        }

        // Using iterator
        long startTime = System.currentTimeMillis();
        ListIterator<Integer> iterator = list.listIterator();
        while (iterator.hasNext()) {
            iterator.next();
        }
        long endTime = System.currentTimeMillis();
        System.out.println("Time using iterator: " + (endTime - startTime) + " milliseconds");

        // Using get(index)
        startTime = System.currentTimeMillis();
        for (int i = 0; i < list.size(); i++) {
            list.get(i);
        }
        endTime = System.currentTimeMillis();
        System.out.println("Time using get(index): " + (endTime - startTime) + " milliseconds");
    }
}
