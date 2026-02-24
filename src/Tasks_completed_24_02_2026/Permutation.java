package Tasks_completed_24_02_2026;

public class Permutation {
    void nextPermutation(int[] arr) {
        int n = arr.length;
        int i = n - 2;

        while (i >= 0 && arr[i] >= arr[i + 1]) i--;

        if (i >= 0) {
            int j = n - 1;
            while (arr[j] <= arr[i]) j--;
            int t = arr[i];
            arr[i] = arr[j];
            arr[j] = t;
        }

        int l = i + 1, r = n - 1;
        while (l < r) {
            int t = arr[l];
            arr[l] = arr[r];
            arr[r] = t;
            l++;
            r--;
        }
    }
}