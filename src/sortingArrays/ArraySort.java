package sortingArrays;

import java.util.Arrays;

public class ArraySort {

    private static String[] merge(String[] a, String[] b) {
        int newLength = a.length + b.length;

        String[] merged = new String[newLength];

        for (int i = 0, ai = 0, bi = 0; i < newLength; i++) {
            if (bi < b.length && ai < a.length) {
                if (a[ai].toLowerCase().compareTo(b[bi].toLowerCase()) < 0) {
                    merged[i] = a[ai];
                    ai++;
                }
                else {
                    merged[i] = b[bi];
                    bi++;
                }
            }
            else if (ai < a.length && bi == b.length) {
                merged[i] = a[ai];
                ai++;
            }
            else if (bi < b.length && ai == a.length) {
                merged[i] = b[bi];
                bi++;
            }
        }
        return merged;
    }

    public static String[] sort(String[] a) {
        if (a == null) {
            return null;
        }
        if (a.length == 1 || a.length == 0) {
            return a;
        }

        int mid = a.length / 2;

        String[] front = Arrays.copyOfRange(a, 0, mid);
        String[] back = Arrays.copyOfRange(a, mid, a.length);

        return merge(sort(front), sort(back));
    }

}
