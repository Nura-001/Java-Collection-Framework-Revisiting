import java.util.ArrayList;
import java.util.Collections;

public class KthSmallestElement {

    public static void main(String[] args) {

        // Creating an ArrayList
        ArrayList<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(4);
        list.add(7);
        list.add(1);
        list.add(9);

        int k = 3; // kth smallest element

        // Sorting the ArrayList
        Collections.sort(list);

        // kth smallest element is at index k-1
        System.out.println("Kth Smallest Element: " + list.get(k - 1));
    }
}
