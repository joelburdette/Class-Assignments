package heap;

/**
 * Assumptions 1. the heap stores non-negative integers 2. the heap cannot
 * contain more than 7 nodes 3. max heap
 *
 * Operations 1. Append add a new value to the right-most node on the first
 * non-empty level do not maintain heap properties after the operation 2. Offer
 * add a new value to the right-most node on the first non-empty level maintain
 * heap properties after the operation 3. Poll 4. Build Heap build a heap from a
 * binary complete tree 5. Peek
 *
 * Usage: java HeapDriver
 *
 * To append a number, type 'a', <Enter>, [number], and <Enter>
 * To offer a number, type 'o', <Enter>, [number], and <Enter>
 * To poll the heap, type 'p', and <Enter>
 * To build a heap, type 'b', and <Enter>
 * To peek at a heap, type 'e', and <Enter>
 *
 */

import java.io.*;
import java.lang.*;
import java.util.ArrayList;

class Heap {

    ArrayList<Integer> myList = new ArrayList<Integer>(7);

    /**
     * data fields
     */
    /**
     * fill here
     */

    /**
     * Note: you may add additional methods
     */

    /**
     * return true if succeed, false if fail
     */
    boolean append(int child) {
        child = myList.get(myList.size() - 1);
        int parent = (myList.get(myList.size() - 1) / 2);
        while (parent >= 0 && myList.get(parent) > myList.get(child)) {
            int swap = myList.get(parent);
            int swip = myList.get(child);
            swip = myList.get(parent);
            swap = myList.get(child);
            child = parent;
            parent = (child - 1) / 2;

        }
        return true;
    }

    /**
     * return true if succeed, false if fail
     */
    boolean offer(int i) {
        /**
         * fill here
         */
        return true;
    }

    /**
     * return -1 if heap empty
     */
    int poll() {
        /**
         * fill here
         */
        return 0;
    }

    void buildHeap() {
        /**
         * fill here
         */
    }

    /**
     * return -1 if heap empty
     */
    int peek() {
        /**
         * fill here
         */
        return 0;
    }
}

public class HeapDriver {

    public static void main(String[] args) {
        Heap h0;

        h0 = new Heap();
        try {
            char command;
            BufferedReader bufferRead = new BufferedReader(new InputStreamReader(System.in));
            do {
                int i;
                String input = bufferRead.readLine();
                command = input.charAt(0);
                switch (command) {
                    case 'a'://append
                        input = bufferRead.readLine();
                        i = Integer.parseInt(input);
                        System.out.println(
                                h0.append(i));
                        System.out.println(h0);

                        break;
                    case 'o'://offer
                        input = bufferRead.readLine();
                        i = Integer.parseInt(input);
                        System.out.println(
                                h0.offer(i));
                        System.out.println(h0);
                        break;
                    case 'p'://poll
                        System.out.println(h0.poll());
                        System.out.println(h0);
                        break;
                    case 'b'://buildheap
                        h0.buildHeap();
                        System.out.println(h0);
                        break;
                    case 'e'://peek
                        System.out.println(h0.peek());
                        System.out.println(h0);
                        break;
                    default:
                        break;
                }
            } while (command != 'x');
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
