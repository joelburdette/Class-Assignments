import java.io.*;
import java.lang.*;

public class SortDriver {

    static <T extends Comparable<T>> void sort(T[] table) {
        for (int nextPos = 1; nextPos < table.length; nextPos++) {
            insert(table, nextPos);
        }
    }

    static <T extends Comparable<T>> void insert(T[] table, int nextPos) {
        T nextVal = table[nextPos];
        while (nextPos > 0 && nextVal.compareTo(table[nextPos - 1]) < 0) {
            table[nextPos] = table[nextPos - 1];
            nextPos--;
        }
        
        table[nextPos] = nextVal;
        for(int i = 0; i <table.length; i++){
                System.out.print(table[i] + " ");
            }
            System.out.println();
    }

    public static void main(String[] args) {
        Comparable[] array;
        array = new Comparable[args.length];
        for (int i = 0; i < args.length; i++) {
            array[i] = Integer.parseInt(args[i]);
        }
        sort(array);
        for (int i = 0; i < args.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }
}
