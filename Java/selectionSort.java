/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package selectionsort;

import java.io.*;
import java.lang.*;

public class SelectionSort {

    static void sort(Comparable[] table) {
        int n = table.length;
        for(int fill = 0; fill < n-1; fill++) {
            int posMin = fill;
            
            for(int next = fill + 1; next < n; next++) {
                if (table[next].compareTo(table[posMin]) < 0) {    
                    posMin = next;
                }
            }
            
            Comparable temp = table[fill];
            table[fill] = table[posMin];
            table[posMin] = temp;   
            for(int i = 0; i <n; i++){
                System.out.print(table[i] + " ");
            }
            System.out.println();
        }
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
    }
}
