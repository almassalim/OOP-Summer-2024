import java.util.ArrayList;
import java.util.HashSet;

public class DistinctElement {
    public static <E> ArrayList<E> removeDuplicates(ArrayList<E> list) {
        HashSet<E> set = new HashSet<>(list);
        ArrayList<E> newList = new ArrayList<>(set);
        return newList;
    }

    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("apple");
        list.add("orange");
        list.add("apple");
        list.add("pear");
        ArrayList<String> newList = removeDuplicates(list);
        System.out.println("Distinct elements: " + newList);
    }
}
