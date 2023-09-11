package org.peronal;
import java.util.ArrayList;
import java.util.Arrays;

public class Sorter {
    public static double[] sort(double[] arg) {
        System.out.println("Before Numbers");
        System.out.println(Arrays.toString(arg));
        double temp;
        for (int i = 0; i < arg.length; i++) {
            for (int j = i; j < arg.length; j++) {
                if (arg[i] > arg[j]) {
                    temp = arg[i];
                    arg[i] = arg[j];
                    arg[j] = temp;
                }
            }
        }
        System.out.println("After Numbers");
        return arg;
    }

    public static String[] sort(String[] arg) {
        System.out.println("Before String");
        System.out.println(Arrays.toString(arg));
        String temp;
        for (int i = 0; i < arg.length; i++) {
            for (int j = i; j < arg.length; j++) {

                if (arg[i].compareTo(arg[j]) > 0) {
                    temp = arg[i];
                    arg[i] = arg[j];
                    arg[j] = temp;
                }
            }
        }
        System.out.println("After Strings");
        return arg;
    }
}
