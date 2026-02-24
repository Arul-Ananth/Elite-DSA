package Tasks_completed_23_02_2026;

class MoveZerosToEnd {
    void pushZerosToEnd(int[] arr, int n) {
        int write = 0;
        for (int i = 0; i < n; i++) {
            if (arr[i] != 0) {
                int t = arr[write];
                arr[write] = arr[i];
                arr[i] = t;
                write++;
            }
        }
    }
}