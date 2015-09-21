import java.io.*;
import java.lang.*;
import java.util.*;

public class Quicksort {
	static void sort(int[] table, int p, int r) {
		if(p<r) {
			int pivIndex = partition(table, p, r);
                        
			System.out.print("p= " + p + ", r= " + r 
				+ ", array: ");
			for(int i: table) 
				System.out.print(i + " ");
			System.out.println();
			sort(table, p, pivIndex -1);
                        sort(table, pivIndex + 1, r);
		}
	}

	static int partition(int[] array, int p, int r) {
	}

	public static void main(String[] args) {
		int[] array;

		array=new int[args.length];
		for(int i=0; i<args.length; i++) {
			array[i]=Integer.parseInt(args[i]);
		}

		sort(array, 0, args.length-1);

		System.out.println("Final: ");
		for(int i=0; i<args.length; i++) {
			System.out.print(array[i] + " ");
		}
		System.out.println();
	}
}
