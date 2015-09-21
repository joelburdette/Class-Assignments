package stackarraydriver;

/**
 * @author Joel Burdette
 */
import java.lang.*;
import java.io.*;
import java.util.*;

class MyStack {

    /**
     * declare and initialize array
     */
    /**
     * assume that maximum capacity is 20
     */
    Integer[] array0 = new Integer[20];

    /**
     * return true if stack empty. Otherwise, return false
     */
    public boolean empty() {
        //for(int i = 0; i < array0.length; i++){
        if (array0[0] == null) {
            return true;
        }
        return false;
    }

    /**
     * return the item argument
     */
    public Integer push(Integer item) {
            //Integer[] array1 = array0;
        //Integer hold;
        for (int i = array0.length - 2; i > 0; i--) {
            array0[i] = array0[i - 1];
        }
        array0[0] = item;
        return item;
    }

    /**
     * return null if stack empty
     */
    public Integer peek() {
        return array0[0];

    }

    /**
     * return null if stack empty
     */
    public Integer pop() {
        if (empty()) {
            return null;
        }
        int number = array0[0];
        for (int i = 1; i < array0.length; i++) {
            array0[i - 1] = array0[i];
        }
        return number;
    }
}

class ExceptionDemo {

    public static void method0(int[] array0, int index) {
        /* if access out-of-bound, print error message and return */
        /* 	to caller */
        if (index >= array0.length) {
            System.out.println("Array access out-of-bound\n");
            return;
        }
        System.out.println(array0[index]);
    }

    public static void method1(int[] array0, int index)
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
    public static void method2(int[] array0, int index)
            throws ArrayIndexOutOfBoundsException {
        System.out.println(array0[index]);
    }

    /* declare method3() to throw an ArrayIndexOutOfBoundsException */
    /*	object to caller */
    /*	before throwing, first partially handle the exception */
    /*	so, it prints the message Partially handling ... */
    public static void method3(int[] array0, int index)
            throws ArrayIndexOutOfBoundsException {
        try {
            System.out.println(array0[index]);
        } catch (ArrayIndexOutOfBoundsException ex) {
            System.out.println("Partially handling ... ");
            System.out.println(array0[index]);
        }
    }

//public class StackArrayDriver {
    public static void main(String[] args) {
        int[] array0;

        array0 = new int[10];
        for (int i = 0; i < array0.length; i++) {
            array0[i] = i * i;
        }

        method0(array0, 9);
        method0(array0, 10);

        try {
            method1(array0, 9);
            method1(array0, 10);
        } catch (ArrayIndexOutOfBoundsException ex) {
            System.out.println(ex);
        }

        try {
            method2(array0, 9);
            method2(array0, 10);
        } catch (ArrayIndexOutOfBoundsException ex) {
            System.out.println(ex);
        }

        try {
            method3(array0, 9);
            method3(array0, 10);
        } catch (ArrayIndexOutOfBoundsException ex) {
            System.out.println(ex);
        }
    MyStack stack0;

    stack0  = new MyStack();

    System.out.println (stack0.empty

    ());
    System.out.println (stack0.peek

    ());
    System.out.println (

    "Pop top item");
    System.out.println (stack0.pop

    ());
    System.out.println (

    "Push 5");
    stack0.push (

    5);
    System.out.println (stack0.empty

    ());
    System.out.println (stack0.peek

    ());
    System.out.println (

    "Pop top item");
    System.out.println (stack0.pop

    ());
    System.out.println (stack0.empty

    ());
    System.out.println (stack0.peek

    ());
    System.out.println (

    "Pop top item");
    System.out.println (stack0.pop

    ());
    System.out.println (

    "Push 10");
    stack0.push (

    10);
    System.out.println (

    "Push 15");
    stack0.push (

    15);
    System.out.println (

    "Push 20");
    stack0.push (

    20);
    System.out.println (stack0.empty

    ());
    System.out.println (stack0.peek

    ());
    System.out.println (

    "Pop top item");
    System.out.println (stack0.pop

    ());
    System.out.println (stack0.empty

    ());
    System.out.println (stack0.peek

    ());
    System.out.println (

    "Pop top item");
    System.out.println (stack0.pop

    ());
    System.out.println (stack0.empty

    ());
    System.out.println (stack0.peek

    ());
    System.out.println (

    "Pop top item");
    System.out.println (stack0.pop

    ());
    System.out.println (stack0.empty

    ());
    System.out.println (stack0.peek

    ());
    System.out.println (

    "Pop top item");
    System.out.println (stack0.pop

());
	}
}
