import java.util.HashSet;
import java.util.Set;

public class SetOperations {
    public static void main(String[] args) {
        Set<String> set1 = new HashSet<>();
        set1.add("George");
        set1.add("Jim");
        set1.add("John");
        set1.add("Blake");
        set1.add("Kevin");
        set1.add("Michael");

        Set<String> set2 = new HashSet<>();
        set2.add("George");
        set2.add("Katie");
        set2.add("Kevin");
        set2.add("Michelle");
        set2.add("Ryan");

        Set<String> union = new HashSet<>(set1);
        union.addAll(set2);

        Set<String> difference = new HashSet<>(set1);
        difference.removeAll(set2);

        Set<String> intersection = new HashSet<>(set1);
        intersection.retainAll(set2);

        System.out.println("Union: " + union);
        System.out.println("Difference: " + difference);
        System.out.println("Intersection: " + intersection);
    }
}
