import java.util.*;

public class MaxElement {
    public static <E extends Comparable<E>> E max(E[] list) {
        if (list == null || list.length == 0) {
            return null;
        }
        E max = list[0];
        for (E element : list) {
            if (element.compareTo(max) > 0) {
                max = element;
            }
        }
        return max;
    }

    public static void main(String[] args) {
        String[] strArray = {"apple", "orange", "banana", "pear"};
        String maxStr = max(strArray);
        System.out.println("Max String: " + maxStr);
    }
}
