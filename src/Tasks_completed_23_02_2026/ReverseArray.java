package Tasks_completed_23_02_2026;

class ReverseArray {
    public void reverseArray(int[] arr) {
        int l = 0, r = arr.length - 1;
        while (l < r) {
            int t = arr[l];
            arr[l] = arr[r];
            arr[r] = t;
            l++;
            r--;
        }
    }
}