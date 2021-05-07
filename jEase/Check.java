package jEase;

public class Check {
    public boolean validDate(int d, int m, int y) {
        int[] monthsThirty0 = { 4, 6, 7, 11 };
        int[] monthsThirty1 = { 1, 3, 5, 7, 8, 10, 12 };
        int daysInMonth = 0;
        IsIn X = new IsIn();

        if (y > 0) {
            if ((m > 0) && (m <= 12)) {
                if (X.theArray(m, monthsThirty0)) {
                    daysInMonth = 30;
                } else if ((X.theArray(m, monthsThirty1))) {
                    daysInMonth = 31;
                } else if (y % 4 == 0) {
                    daysInMonth = 29;
                } else {
                    daysInMonth = 28;
                }
            }
        }

        if (daysInMonth > 0) {
            return (d <= daysInMonth);
        } else {
            return false;
        }
    }

    public boolean isEven(int i) {
        return (i % 2 == 0);
    }
}