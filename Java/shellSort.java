/*
 * @author Joel Burdette
 */
import java.io.*;
import java.lang.*;

public class SortDriver {

    static <T extends Comparable<T>> void sort(T[] table) {
        int gap = table.length / 2;
        while (gap > 0) {
            for (int nextPos = gap; nextPos < table.length; nextPos++) {
                insert(table, nextPos, gap);
            }
            if (gap == 2) {
                gap = 1;
            } else {
                gap = (int) (gap / 2);
            }
            for (int i = 0; i < table.length; i++) {
                System.out.print(table[i] + " ");
            }
            System.out.println();
        }
    }

    static <T extends Comparable<T>> void insert(T[] table, int nextPos, int gap) {
        T nextVal = table[nextPos];
        while ((nextPos > gap - 1) && (nextVal.compareTo(table[nextPos - gap]) < 0)) {
            table[nextPos] = table[nextPos - gap];
            nextPos -= gap;
        }
        table[nextPos] = nextVal;
    }

    public static void main(String[] args) {
        Comparable[] array;

        array = new Comparable[args.length];
        for (int i = 0; i < args.length; i++) {
            array[i] = Integer.parseInt(args[i]);
        }

        sort(array);
    }
}
