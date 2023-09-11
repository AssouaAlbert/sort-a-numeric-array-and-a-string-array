package org.peronal;


import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        double[] numArg1 = {49, 1, 3, 200, 2, 4, 70, 5};
        String[] stringArg1 = {"a", "sdas", "utyu", "jg", "zfczx", "ljk", "bddfg", "hjgfhj", "ou", "er", "yuu", "iiu", "uytu", "fgjf", };
        double[] res = Sorter.sort(numArg1);
        System.out.println(Arrays.toString(res));
        String[] resString = Sorter.sort(stringArg1);
        System.out.println(Arrays.toString(resString));
    }
}