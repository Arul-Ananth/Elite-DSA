package Tasks_completed_24_02_2026;

public class RotateArray {
    void rotateArr(int[] arr, int d) {
        int n = arr.length;
        if (n == 0) return;
        d %= n;

        int g = gcd(d, n);
        for (int start = 0; start < g; start++) {
            int temp = arr[start];
            int j = start;

            while (true) {
                int k = j + d;
                if (k >= n) k -= n;
                if (k == start) break;
                arr[j] = arr[k];
                j = k;
            }
            arr[j] = temp;
        }
    }

    int gcd(int a, int b) {
        while (b != 0) {
            int t = a % b;
            a = b;
            b = t;
        }
        return a;
    }
}