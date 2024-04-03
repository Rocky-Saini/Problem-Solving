import java.util.ArrayList;
import java.util.Collections;

public class h {
    public static void main(String[] args) {
        // Create two ArrayLists with the same values
        ArrayList<Integer> list1 = new ArrayList<>();
        list1.add(2);
        list1.add(3);
        list1.add(8);
        list1.add(9);

        ArrayList<Integer> list2 = new ArrayList<>();
        list2.add(1);
        list2.add(3); // Same value as list1
        list2.add(8); // Same value as list1
        list2.add(10);

        // Combine the two ArrayLists
        ArrayList<Integer> combinedList = new ArrayList<>(list1);
        combinedList.addAll(list2);

        // Sort the combined ArrayList
        Collections.sort(combinedList);

        // Print the sorted combined list
        System.out.println("Sorted combined list: " + combinedList);
    }
}
