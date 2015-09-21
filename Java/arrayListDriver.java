import java.io.*;
import java.lang.*;
import java.util.*;

public class ArrayListDriver {
    private void traverse(ArrayList arrayList0)  {
        for (Object arrayList01 : arrayList0) {
            System.out.print(arrayList01 + " ");
        }   
    }

    public ArrayListDriver() {
        ArrayList arrayList0;
        Integer tmpInteger;
        boolean tmpBoolean;

        arrayList0=new ArrayList();

        System.out.println("Appending 5");
        arrayList0./** fill here */add(5);
        System.out.print("arrayList0:");
        traverse(arrayList0);
        System.out.println();

        System.out.println("Appending 15");
        arrayList0./** fill here */add(15);
        System.out.print("arrayList0:");
        traverse(arrayList0);
        System.out.println();

        System.out.println("Adding 10 at index 1");
        arrayList0./** fill here */add(1,10);
        System.out.print("arrayList0:");
        traverse(arrayList0);
        System.out.println();

        System.out.println("Appending 25, 30, 35");
        arrayList0./** fill here */add(25);
        arrayList0./** fill here */add(30);
        arrayList0./** fill here */add(35);
        System.out.print("arrayList0:");
        traverse(arrayList0);
        System.out.println();

        System.out.println("Size= " + arrayList0./** fill here */size());
        System.out.println("3rd element: " + arrayList0./** fill here */get(3));

        System.out.println("The index of 10 is " + 
            arrayList0./** fill here */indexOf(10));

        System.out.println("The index of 20 is " + 
            arrayList0./** fill here */indexOf(20));

                 System.out.println("Removing the element at index 2");
                 tmpInteger = (int) arrayList0./** fill here */remove(2);
                 System.out.println(tmpInteger + " removed");
                 System.out.print("arrayList0:");
                 traverse(arrayList0);
                 System.out.println();
         
                 System.out.println("Removing the element at index 4");
                 tmpInteger = (int) arrayList0./** fill here */remove(4);
                 System.out.println(tmpInteger + " removed");
                 System.out.print("arrayList0:");
                 traverse(arrayList0);
                 System.out.println();

        System.out.println("Appending 5, 10, 15");
        arrayList0./** fill here */add(5);
        arrayList0./** fill here */add(10);
        arrayList0./** fill here */add(15);
        System.out.print("arrayList0:");
        traverse(arrayList0);
        System.out.println();

        System.out.println("Removing 5");
        tmpBoolean = arrayList0./** fill here */remove(new Integer(5));
        System.out.println("return value: " + tmpBoolean);
        System.out.print("arrayList0:");
        traverse(arrayList0);
        System.out.println();

        System.out.println("Removing 20");
        tmpBoolean = arrayList0./** fill here */remove(new Integer(20));
        System.out.println("return value: " + tmpBoolean);
        System.out.print("arrayList0:");
        traverse(arrayList0);
        System.out.println();

                 System.out.println("Replacing element at index 1");
                 tmpInteger = (int) arrayList0./** fill here */set(1,10);
                 System.out.println("replaced:" + tmpInteger);
                 System.out.print("arrayList0:");
                 traverse(arrayList0);
                 System.out.println();
    }

    public static void main(String[] args) {
        ArrayListDriver arrayListDriver = new ArrayListDriver();
    }
}
