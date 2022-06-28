package io.zipcoder.microlabs.mastering_loops;

public class TableUtilities {
    public static String getSmallMultiplicationTable() {
        return getMultiplicationTable(10);

    }

    public static String getLargeMultiplicationTable() {
        return getMultiplicationTable(20);
    }

    public static String getMultiplicationTable(int tableSize) {
        String table = "";
        for(int i = 0; i <tableSize;i++){
            for(int j = 0; j <tableSize; j++){
                table = table + String.format("%3d",j*i);
            }
            table = table + "\n";
        }
        return table;
    }
}
