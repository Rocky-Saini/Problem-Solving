import java.util.HashMap;
import java.util.Map;

public class Duplicate {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 2, 3, 4, 4, 5, 5, 5 };
        Map<Integer, Integer> duplicates = findDuplicatesWithFrequency(arr);

        System.out.println("Duplicates and their frequencies:");
        for (Map.Entry<Integer, Integer> entry : duplicates.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }

    public static Map<Integer, Integer> findDuplicatesWithFrequency(int[] arr) {
        Map<Integer, Integer> counts = new HashMap<>();
        Map<Integer, Integer> duplicates = new HashMap<>();

        // Count the frequency of each element in the array
        for (int num : arr) {
            int count = counts.getOrDefault(num, 0) + 1;
            counts.put(num, count);
            // Check if it's a duplicate
            if (count > 1) {
                duplicates.put(num, count);
            }
        }

        return duplicates;
    }
}
