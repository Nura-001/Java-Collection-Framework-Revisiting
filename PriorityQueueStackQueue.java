import java.util.PriorityQueue;
import java.util.Comparator;

public class PriorityQueueStackQueue {

    public static void main(String[] args) {

        // Stack behavior (LIFO)
        PriorityQueue<Integer> stack =
                new PriorityQueue<>(Comparator.reverseOrder());

        stack.add(10);
        stack.add(20);
        stack.add(30);

        System.out.println("Stack Pop: " + stack.poll());

        // Queue behavior (FIFO)
        PriorityQueue<Integer> queue =
                new PriorityQueue<>();

        queue.add(10);
        queue.add(20);
        queue.add(30);

        System.out.println("Queue Remove: " + queue.poll());
    }
}
