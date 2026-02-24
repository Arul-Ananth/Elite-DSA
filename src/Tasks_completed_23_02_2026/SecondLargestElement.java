package Tasks_completed_23_02_2026;

class SecondLargestElement {
    public int getSecondLargest(int[] arr) {
        int first = Integer.MIN_VALUE;
        int second = Integer.MIN_VALUE;

        for (int x : arr) {
            if (x > first) {
                second = first;
                first = x;
            } else if (x < first && x > second) {
                second = x;
            }
        }
        return (second == Integer.MIN_VALUE) ? -1 : second;
    }
}