import java.lang.*;
import java.io.*;

class SingleLinkedList {

    private Node head;

    public boolean add(Integer e) {
        Node curr;

        if (head == null) {
            head = new Node(e);

            return true;
        }

        for (curr = head; curr.next != null; curr = curr.next);
        curr.next = new Node(e);

        return true;
    }

    public void addFirst(Integer e) {
        Node newNode;

        newNode = new Node(e);
        newNode.next = head;
        head = newNode;
    }

    public void add(int index, Integer element) {
        // do nothing if index out-of-bound
        Node curr;
        int i;

        if (index < 0) {
            return;
        }
        if (index == 0) {
            addFirst(element);
            return;
        }
        if (head == null) {
            add(element);
        }

        for (i = 0, curr = head; curr != null && i < index - 1;
                curr = curr.next, i++) {

        }
        if (curr == null) {
            //throw new OutOfBoundsException// out of bound
            return;
        }
        Node newNode = new Node(element);
        newNode.next = curr.next;
        curr.next = newNode;
    }

    public Integer get(int index) {
        Node curr;
        int i;

        if (index < 0) {
            return null;
        }
        for (curr = head, i = 0; curr != null && i < index; curr = curr.next, i++);
        if (curr == null) {
            return null;
        }

        return curr.item;
    }

    public Integer set(int index, Integer element) {
        Node curr;
        Integer tmp;
        int i;

        if (index < 0) {
            return null;
        }
        for (curr = head, i = 0; curr != null && i < index; curr = curr.next, i++);
        if (curr == null) {
            return null;
        }

        tmp = curr.item;
        curr.item = element;
        return tmp;
    }

    public Integer remove(int index) {
        // return null if index out-of-bound
        Node curr, tmp;
        int i;

        if (index < 0) {
            return null;
        }
        if (index == 0) {
            return remove();
        }

        for (i = 0, curr = head; curr != null && i < index - 1;
                curr = curr.next, i++);
        if (curr == null) {
            return null;
        }
        if (curr.next == null) {
            return null;
        }

        tmp = curr.next;
        curr.next = curr.next.next;
        return tmp.item;
    }

    public Integer removeLast() {
        Node curr, tmp;

        if (head == null) {
            return null;
        }
        if (head.next == null) {
            tmp = head;
            head = null;
            return tmp.item;
        }

        for (curr = head; curr.next.next != null; curr = curr.next);
        tmp = curr.next;
        curr.next = null;
        return tmp.item;
    }

    public Integer remove() {
        Node tmp;

        if (head == null) {
            return null;
        }

        tmp = head;
        head = head.next;

        return tmp.item;
    }

    public void traverse() {
        for (Node curr = head; curr != null; curr = curr.next) {
            System.out.print(curr + " ");
        }
    }

    public int indexOf(Integer o) {
        Node curr;
        int i;

        for (curr = head, i = 0; curr != null; curr = curr.next, i++) {
            if (curr.item.equals(o)) {
                return i;
            }
        }
        return -1;
    }

    class Node {

        Node next;
        Integer item;

        Node(Integer item) {
            next = null;
            this.item = item;
        }

        public String toString() {
            return item.toString();
        }
    }
}

public class SingleLinkedListDriver {

    public static void main(String[] args) {
        SingleLinkedList list0;

        list0 = new SingleLinkedList();
        System.out.println("Removing 1st item ...");
        System.out.println("The deleted item is " + list0.remove());
        System.out.println("Removing last item ...");
        System.out.println("The deleted item is " + list0.removeLast());
        System.out.println("Adding 5 at index 0 ...");
        list0.add(0, 5);
        System.out.print("list0: ");
        list0.traverse();
        System.out.println();
        System.out.println("Removing last item ...");
        System.out.println("The deleted item is " + list0.removeLast());
        System.out.print("list0: ");
        list0.traverse();
        System.out.println();
        System.out.println("Adding 10 ...");
        list0.add(10);
        System.out.println("Adding 15 ...");
        list0.add(15);
        System.out.println("Adding 20 ...");
        list0.add(20);
        System.out.println("Adding 3 at front ...");
        list0.addFirst(3);
        System.out.print("list0: ");
        list0.traverse();
        System.out.println();
        System.out.println("Adding 10 at index -1 ...");
        list0.add(-1, 10);
        System.out.println("Adding 1 at index 0 ...");
        list0.add(0, 1);
        System.out.println("Adding 7 at index 4 ...");
        list0.add(4, 7);
        System.out.println("Adding 30 at index 6 ...");
        list0.add(6, 30);
        System.out.println("Adding 40 at index 8 ...");
        list0.add(8, 40);
        System.out.println("Adding 50 at index 10 ...");
        list0.add(10, 50);
        System.out.print("list0: ");
        list0.traverse();
        System.out.println();
        System.out.println("Deleting 1st item ...");
        System.out.println("The deleted item is " + list0.remove());
        System.out.print("list0: ");
        list0.traverse();
        System.out.println();
        System.out.println("Deleting item at index -1 ...");
        System.out.println("The deleted item is " + list0.remove(-1));
        System.out.print("list0: ");
        list0.traverse();
        System.out.println();
        System.out.println("Deleting item at index 0 ...");
        System.out.println("The deleted item is " + list0.remove(0));
        System.out.print("list0: ");
        list0.traverse();
        System.out.println();
        System.out.println("Deleting item at index 5 ...");
        System.out.println("The deleted item is " + list0.remove(5));
        System.out.print("list0: ");
        list0.traverse();
        System.out.println();
        System.out.println("Deleting item at index 2 ...");
        System.out.println("The deleted item is " + list0.remove(2));
        System.out.print("list0: ");
        list0.traverse();
        System.out.println();
        System.out.println("Adding 17 at index 2 ...");
        list0.add(2, 17);
        System.out.print("list0: ");
        list0.traverse();
        System.out.println();
        System.out.println("indexOf(10)= " + list0.indexOf(10));
        System.out.println("indexOf(15)= " + list0.indexOf(15));
        System.out.println("indexOf(30)= " + list0.indexOf(30));
        System.out.println("get(-1)= " + list0.get(-1));
        System.out.println("get(0)= " + list0.get(0));
        System.out.println("get(2)= " + list0.get(2));
        System.out.println("get(4)= " + list0.get(4));
        System.out.println("get(6)= " + list0.get(6));
        System.out.println("get(7)= " + list0.get(7));
        System.out.println("set(-1,5) replaced " + list0.set(-1, 5));
        System.out.println("set(0,11) replaced " + list0.set(0, 11));
        System.out.println("set(2,16) replaced " + list0.set(2, 16));
        System.out.println("set(4,31) replaced " + list0.set(4, 31));
        System.out.println("set(6,100) replaced " + list0.set(6, 100));
        System.out.println("set(7,100) replaced " + list0.set(7, 100));
        System.out.println("Adding 40 ...");
        list0.add(40);
        System.out.print("list0: ");
        list0.traverse();
        System.out.println();
        System.out.println("Deleting item at index 6 ...");
        System.out.println("The deleted item is " + list0.remove(6));
        System.out.print("list0: ");
        list0.traverse();
        System.out.println();
        System.out.println("Deleting item at index 7 ...");
        System.out.println("The deleted item is " + list0.remove(7));
        System.out.print("list0: ");
        list0.traverse();
        System.out.println();
        System.out.println("Deleting item at index 5 ...");
        System.out.println("The deleted item is " + list0.remove(5));
        System.out.print("list0: ");
        list0.traverse();
        System.out.println();
        System.out.println("Deleting last item ...");
        System.out.println("The deleted item is " + list0.removeLast());
        System.out.print("list0: ");
        list0.traverse();
        System.out.println();
        System.out.println("Deleting item at index 1 ...");
        System.out.println("The deleted item is " + list0.remove(1));
        System.out.print("list0: ");
        list0.traverse();
        System.out.println();
        System.out.println("indexOf(50)= " + list0.indexOf(50));
    }
}
