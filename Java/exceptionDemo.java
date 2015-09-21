package data.structures.pkg1;
import java.lang.*;
import java.util.*;

class ArrayListDriver {

    private void traverse(ArrayList arrayList0) {
        for (Object arrayList01 : arrayList0) {
            System.out.print(arrayList01 + " ");
        }
    }

    public ArrayListDriver() {
        ArrayList arrayList0;
        Integer tmpInteger;
        boolean tmpBoolean;

        arrayList0 = new ArrayList();

        System.out.println("Appending 5");
        arrayList0./**
                 * fill here
                 */
                add(5);
        System.out.print("arrayList0:");
        traverse(arrayList0);
        System.out.println();

        System.out.println("Appending 15");
        arrayList0./**
                 * fill here
                 */
                add(15);
        System.out.print("arrayList0:");
        traverse(arrayList0);
        System.out.println();

        System.out.println("Adding 10 at index 1");
        arrayList0./**
                 * fill here
                 */
                add(1, 10);
        System.out.print("arrayList0:");
        traverse(arrayList0);
        System.out.println();

        System.out.println("Appending 25, 30, 35");
        arrayList0./**
                 * fill here
                 */
                add(25);
        arrayList0./**
                 * fill here
                 */
                add(30);
        arrayList0./**
                 * fill here
                 */
                add(35);
        System.out.print("arrayList0:");
        traverse(arrayList0);
        System.out.println();

        System.out.println("Size= " + arrayList0./**
                 * fill here
                 */
                size());
        System.out.println("3rd element: " + arrayList0./**
                 * fill here
                 */
                get(3));

        System.out.println("The index of 10 is "
                + arrayList0./**
                 * fill here
                 */
                indexOf(10));

        System.out.println("The index of 20 is "
                + arrayList0./**
                 * fill here
                 */
                indexOf(20));

        System.out.println("Removing the element at index 2");
        tmpInteger = (int) arrayList0./**
                 * fill here
                 */
                remove(2);
        System.out.println(tmpInteger + " removed");
        System.out.print("arrayList0:");
        traverse(arrayList0);
        System.out.println();

        System.out.println("Removing the element at index 4");
        tmpInteger = (int) arrayList0./**
                 * fill here
                 */
                remove(4);
        System.out.println(tmpInteger + " removed");
        System.out.print("arrayList0:");
        traverse(arrayList0);
        System.out.println();

        System.out.println("Appending 5, 10, 15");
        arrayList0./**
                 * fill here
                 */
                add(5);
        arrayList0./**
                 * fill here
                 */
                add(10);
        arrayList0./**
                 * fill here
                 */
                add(15);
        System.out.print("arrayList0:");
        traverse(arrayList0);
        System.out.println();

        System.out.println("Removing 5");
        tmpBoolean = arrayList0./**
                 * fill here
                 */
                remove(new Integer(5));
        System.out.println("return value: " + tmpBoolean);
        System.out.print("arrayList0:");
        traverse(arrayList0);
        System.out.println();

        System.out.println("Removing 20");
        tmpBoolean = arrayList0./**
                 * fill here
                 */
                remove(new Integer(20));
        System.out.println("return value: " + tmpBoolean);
        System.out.print("arrayList0:");
        traverse(arrayList0);
        System.out.println();

        System.out.println("Replacing element at index 1");
        tmpInteger = (int) arrayList0./**
                 * fill here
                 */
                set(1, 10);
        System.out.println("replaced:" + tmpInteger);
        System.out.print("arrayList0:");
        traverse(arrayList0);
        System.out.println();
    }
}
    /*81
     Array access out-of-bound

     81
     java.lang.ArrayIndexOutOfBoundsException: Array index out of range: 10
     81
     java.lang.ArrayIndexOutOfBoundsException: 10
     81
     Partially handling .../*81
     Array access out-of-bound

     81
     java.lang.ArrayIndexOutOfBoundsException: Array index out of range: 10
     81
     java.lang.ArrayIndexOutOfBoundsException: 10
     81
     Partially handling ...
     java.lang.ArrayIndexOutOfBoundsException: 10*/

    public class ExceptionDemo {

        public void method0(int[] array0, int index) {
            /* if access out-of-bound, print error message and return */
            /* 	to caller */
            if (index >= array0.length) {
                System.out.println("Array access out-of-bound\n");
                return;
            }
            System.out.println(array0[index]);
        }

        public void method1(int[] array0, int index)
                throws ArrayIndexOutOfBoundsException {

            /* if access out-of-bound, throw the exception */
            if (index >= array0.length) {
                throw new ArrayIndexOutOfBoundsException(index);
            }
            System.out.println(array0[index]);
        }

        /* declare method2() to throw an ArrayIndexOutOfBoundsException */
        /*	object to caller */
        /*	Note: method2() does not check if index is out-of-bound */
        public void method2(int[] array0, int index)
                throws ArrayIndexOutOfBoundsException {
            System.out.println(array0[index]);
        }

        /* declare method3() to throw an ArrayIndexOutOfBoundsException */
        /*	object to caller */
        /*	before throwing, first partially handle the exception */
        /*	so, it prints the message Partially handling ... */
        public void method3(int[] array0, int index)
                throws ArrayIndexOutOfBoundsException {
            try {
                System.out.println(array0[index]);
            } catch (ArrayIndexOutOfBoundsException ex) {
                System.out.println("Partially handling ... ");
                System.out.println(array0[index]);
            }
        }
    public static void main(String[] args) {
        ExceptionDemo arrayListDriver = new ExceptionDemo();
        ExceptionDemo demo = new ExceptionDemo(); 
        int[] array0;

        array0 = new int[10];
        for (int i = 0; i < array0.length; i++) {
            array0[i] = i * i;
        }

        demo.method0(array0, 9);
        demo.method0(array0, 10);

        try {
            demo.method1(array0, 9);
            demo.method1(array0, 10);
        } catch (ArrayIndexOutOfBoundsException ex) {
            System.out.println(ex);
        }

        try {
            demo.method2(array0, 9);
            demo.method2(array0, 10);
        } catch (ArrayIndexOutOfBoundsException ex) {
            System.out.println(ex);
        }

        try {
            demo.method3(array0, 9);
            demo.method3(array0, 10);
        } catch (ArrayIndexOutOfBoundsException ex) {
            System.out.println(ex);
    }
}
}
