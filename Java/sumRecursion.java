package recursion;

import java.io.*;
import java.lang.*;

public class Recursion {

    public static int sum(int[] array, int index) {
        if (index == 0) {
            return array[0];
        } else {
            return array[index] + sum(array, index - 1);
        }
    }

    public static void main(String[] args) {
       int[] array0 = new int[args.length];
        for(int i=0; i<args.length; i++)
            array0[i]=Integer.parseInt(args[i]);
        System.out.println(sum(array0, array0.length - 1));
    }
}
