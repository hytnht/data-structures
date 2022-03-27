package main.java.org.hy.algorithm.sorting;

import java.util.Arrays;

public class InsertionSort<T extends Comparable<T>> {
    private final T[] array;

    private void insert(int src, int dst) {
        T data = array[src];
        System.arraycopy(array, dst, array, dst + 1, src - dst);
        array[dst] = data;
    }

    InsertionSort(T[] array, boolean desc) {
        this.array = array;
        int current = 1;
        while (current < array.length) {
            for (int i = 0; i < current; i++) {
                if (!desc) {
                    if (array[i].compareTo(array[current]) > 0) {
                        insert(current, i);
                        break;
                    }
                } else {
                    if (array[i].compareTo(array[current]) < 0) {
                        insert(current, i);
                        break;
                    }
                }
            }
            current++;
        }
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (T i : array) {
            sb.append(i).append(", ");
        }
        sb.replace(sb.length() - 2, sb.length() - 1, ".");
        return sb.toString();
    }

    public static void main(String[] args) {
        Integer[] i1 = new Integer[]{6, 1, 35, 7, 2, 10, 5, 12, 8, 23, 10, 0, 9, 1};
        System.out.println("Integer random " + Arrays.toString(i1));
        InsertionSort<Integer> i1s = new InsertionSort<>(i1, false);
        System.out.println("--> Insertion sort: " + i1s + "\n");
        Integer[] i2 = new Integer[]{0, 1, 3, 7, 7, 9, 11, 25};
        System.out.println("Integer sorted " + Arrays.toString(i2));
        InsertionSort<Integer> i2s = new InsertionSort<>(i2, false);
        System.out.println("--> Insertion sort: " + i2s + "\n");
        Integer[] i3 = new Integer[]{0, 1, 7, 3, 9, 11, 10, 25};
        System.out.println("Integer nearly sorted " + Arrays.toString(i3));
        InsertionSort<Integer> i3s = new InsertionSort<>(i3, true);
        System.out.println("--> Insertion sort: " + i3s + "\n");
        Integer[] i4 = new Integer[]{6, 11, 0, 11, 10, 7, 1, 9, 11, 10, 9, 6, 9, 10};
        System.out.println("Integer many duplicates " + Arrays.toString(i4));
        InsertionSort<Integer> i4s = new InsertionSort<>(i4, true);
        System.out.println("--> Insertion sort: " + i4s + "\n");
        String[] s1 = new String[]{"Tokyo", "Paris", "Hanoi", "Washington", "London", "Moscow", "Berlin"};
        System.out.println("String random " + Arrays.toString(s1));
        InsertionSort<String> s1s = new InsertionSort<>(s1, false);
        System.out.println("--> Insertion sort: " + s1s + "\n");
        Double[] f1 = new Double[]{3.1, 9.2, 4.0, -1.2, 7.9, -9.5, 3.0, -6.7, -0.2, 1.9};
        System.out.println("Double random " + Arrays.toString(f1));
        InsertionSort<Double> f1s = new InsertionSort<>(f1, true);
        System.out.println("--> Insertion sort: " + f1s + "\n");

    }
}
