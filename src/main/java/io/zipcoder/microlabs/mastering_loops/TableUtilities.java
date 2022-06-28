package io.zipcoder.microlabs.mastering_loops;

public class TableUtilities {
    public static String getSmallMultiplicationTable() {
        return getMultiplicationTable(10);

    }

    public static String getLargeMultiplicationTable() {
        return getMultiplicationTable(20);
    }

    public static String getMultiplicationTable(int tableSize) {
        StringBuilder s = new StringBuilder();
        for (int i = 1; i < 4; i++) {
            for (int j = 1; j < 4; j++) {
                s.append(String.format("%3d |", i * j));
            }
            s.append("\n");
        }
        return s.toString();
    }
}
