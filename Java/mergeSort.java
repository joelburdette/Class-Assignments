/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author joel
 */
import java.io.*;
import java.lang.*;
import java.util.*;

public class SortDriver {

    static <T extends Comparable<T>> void sort(T[] table, int p, int r) {
        if(table.length > 1) {
            int halfSize = table.length / 2;
            T[] leftTable = (T[]) new Comparable[halfSize];
            T[] rightTable = (T[]) new Comparable[table.length - halfSize];
            System.arraycopy(table, 0, leftTable, 0, halfSize);
            System.arraycopy(table, halfSize, rightTable, 0, table.length - halfSize);
            sort(leftTable, halfSize, table.length);
            sort(rightTable, halfSize, 0);
            merge(table, leftTable, rightTable);

        System.out.println("p= " + p + ", r= " + r + ", array: ");
        for (T i : table) {
            System.out.print(i + " ");
        }
        System.out.println();
    }
    }

    private static <T extends Comparable<T>> void merge(T[] outputSequence, T[] leftSequence, T[] rightSequence) {
        int i = 0; //left
        int j = 0; //right
        int k = 0; //output
        while (i < leftSequence.length && j < rightSequence.length) {
            if (leftSequence[i].compareTo(rightSequence[j]) < 0) {
                outputSequence[k++] = leftSequence[j++];
            } else {
                outputSequence[k++] = rightSequence[j++];
            }
        }
        while (i < leftSequence.length) {
            outputSequence[k++] = leftSequence[i++];
        }
        while (j < rightSequence.length) {
            outputSequence[k++] = rightSequence[j++];
        }
    }

    public static void main(String[] args) {
        Comparable [] array;

        array = new Comparable[args.length];
        for (int i = 0; i < args.length; i++) {
            array[i] = Integer.parseInt(args[i]);
        }

        sort(array, 0, args.length-1);

        System.out.println("Final: ");
        for (int i = 0; i < args.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }
}
