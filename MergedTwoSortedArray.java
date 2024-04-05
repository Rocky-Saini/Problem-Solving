
public class MergedTwoSortedArray {
    public static int[] merge(int[] A, int[] B) {
        int n = A.length; // size of arr1
        int m = B.length; // size of arr2

        int[] C = new int[n + m];
        int i = 0;
        int j = 0;
        int k = 0;
        while (i < n && j < m) {
            if (A[i] <= B[j]) {
                C[k] = A[i];
                i++;
                k++;
            } else {
                C[k] = B[j];
                j++;
                k++;
            }
        }
        while (i < n) {
            C[k] = A[i];
            i++;
            k++;
        }
        while (j < m) {
            C[k] = B[j];
            j++;
            k++;
        }
        return C;
    }

    public static void main(String[] args) {
        int A[] = { 1, 2, 3, 4 };
        int B[] = { 5, 6, 7, 8, 9 };
        int[] merged = merge(A, B);

        System.out.print("Merged array: ");
        for (int num : merged) {
            System.out.print(num + " ");
        }
    }
}