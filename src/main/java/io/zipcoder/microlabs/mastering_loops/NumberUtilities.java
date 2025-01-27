package io.zipcoder.microlabs.mastering_loops;


public class NumberUtilities {


    public static String getEvenNumbers(int start, int stop) {
        String result = "";
        for (int i = 0; i < stop; i++) {
            if (i % 2 == 0) {
                result += i;
            }
        }
        return result;
    }


    public static String getOddNumbers(int start, int stop) {
        String result = "";
        for (int i = 0; i < stop; i++) {
            if (i % 2 != 0) {
                result += i;
            }
        }
        return result;
    }


    public static String getSquareNumbers(int start, int stop, int step) {
        String result = "";
        for (int i = start; i < stop; i += step) {
            result += String.valueOf((i*i));
        }
        return result;
    }

    public static String getRange(int start) {
        String result = "";
        for (int i = 0; i < start; i++) {
            result += i;
        }
        return result;
    }

    public static String getRange(int start, int stop) {
        String result = "";
        for (int i = start; i < stop; i++) {
            result += i;
        }
        return result;
    }

    public static String getRange(int start, int stop, int step) {
        String result = "";
        for (int i = start; i < stop; i += step) {
            result += i;
        }
        return result;
    }

    public static String getRangeStringBuilder(int start, int stop, int step) {
        StringBuilder str = new StringBuilder();
        for (int i = start; i < stop; i += step) {
            str.append(i);
        }
        return str.toString();
    }


    public static String getExponentiations(int start, int stop, int step, int exponent) {
        String result = "";
        for (int i = start; i < stop; i += step) {
            result += (int) (Math.pow(i, exponent));
        }
        return result;
    }
}


