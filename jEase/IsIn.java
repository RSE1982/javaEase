package jEase;

public class IsIn {
    public boolean theArray(int x, int[] array) {
        boolean isIn = false;
        for (int n : array) {
            if (n == x) {
                isIn = true;
                break;
            }
        }
        return isIn;
    }

    public boolean theArray(String x, String[] array) {
        boolean isIn = false;
        for (String s : array) {
            if (s == x) {
                isIn = true;
                break;
            }
        }
        return isIn;
    }
}