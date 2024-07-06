import java.util.Comparator;
import java.util.PriorityQueue;

class MyPriorityQueue<E> extends PriorityQueue<E> {
    public MyPriorityQueue(Comparator<? super E> comparator) {
        super(comparator);
    }

    public static void main(String[] args) {
        Comparator<Integer> comparator = new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o2 - o1;
            }
        };

        MyPriorityQueue<Integer> queue = new MyPriorityQueue<>(comparator);
        queue.add(3);
        queue.add(1);
        queue.add(2);

        System.out.println("PriorityQueue: " + queue.poll());
        System.out.println("PriorityQueue: " + queue.poll());
        System.out.println("PriorityQueue: " + queue.poll());
    }
}
