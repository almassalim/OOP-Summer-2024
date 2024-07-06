import java.util.ArrayList;

public class MaxElementInArrayList {
    public static <E extends Comparable<E>> E max(ArrayList<E> list) {
        if (list == null || list.isEmpty()) {
            return null;
        }
        E max = list.get(0);
        for (E element : list) {
            if (element.compareTo(max) > 0) {
                max = element;
            }
        }
        return max;
    }

    public static void main(String[] args) {
        ArrayList<Integer> intList = new ArrayList<>();
        intList.add(1);
        intList.add(3);
        intList.add(2);
        intList.add(5);
        intList.add(4);
        Integer maxInt = max(intList);
        System.out.println("Max Integer: " + maxInt);
    }
}
