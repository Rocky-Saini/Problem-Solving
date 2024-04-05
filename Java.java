import java.util.*;

public class Java {
    public static List<int[]> pairSum(int[] arr, int s) {
        // Write your code here.
        Arrays.sort(arr);
        int n = arr.length;
        List<int[]> l = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (arr[i] + arr[j] == s) {
                    int[] pair = new int[2];
                    pair[0] = arr[i];
                    pair[1] = arr[j];
                    Arrays.sort(pair);
                    l.add(pair);
                }
            }
        }
        return l;
    }
}
