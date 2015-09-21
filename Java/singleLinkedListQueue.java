import java.util.NoSuchElementException;

/*
 Author: Joel Burdette
 */
class MyQueue {

    SingleLinkedList list0 = new SingleLinkedList();
    final int CAP = 4;
    int size = 0;
    int cap = 5;
    int siz = 0;
    private Node front;
    private Node rear;

    boolean add(Integer e) throws IllegalStateException {
        if (siz >= cap) {
            throw new IllegalStateException("");
        }
        if (front == null) {
            rear = new Node(e);
            front = rear;
        } else {
            rear.next = new Node(e);
            rear = rear.next;
        }
        siz++;
        return true;
    }

    boolean offer(Integer e) {
        if (size >= CAP) {
            return false;
        }
        if (front == null) {
            rear = new Node(e);
            front = rear;
        } else {
            rear.next = new Node(e);
            rear = rear.next;
        }
        size++;
        siz++;
        return true;
    }

    String element() {
        if (front == null) {
            return "java.util.NoSuchElementException";
        } else {
            return front.item.toString();
        }
    }

    String remove() {
        if (front != null) {
            Node tmp;
            tmp = front;
            front = front.next;
            return tmp.item.toString();
        } else {
            return "java.util.NoSuchElementException";
        }
    }

    Integer poll() {
        Node tmp;
        tmp = front;
        if (front == null) {
            return null;
        }
        front = front.next;
        size--;
        siz--;
        return tmp.item;
    }

    Integer peek() {
        if (size == 0) {
            return null;
        } else {
            return front.item;
        }
    }

    public void traverse() {
        for (Node curr = front; curr != null; curr = curr.next) {
            System.out.print(curr.item + " ");

        }
    }

    class Node {

        Node next;
        Integer item;

        Node(Integer item) {
            next = null;
            this.item = item;
        }
    }
}

public class SingleLinkedListQueue {

    public static void main(String[] args) {
        MyQueue queue0;
        queue0 = new MyQueue();
        System.out.println(queue0.peek());
        System.out.println(queue0.poll());
        System.out.println(queue0.offer(0));
        System.out.println(queue0.peek());
        System.out.println(queue0.poll());
        System.out.println(queue0.peek());
        System.out.println(queue0.poll());
        System.out.println(queue0.offer(5));
        System.out.println(queue0.offer(10));
        System.out.println(queue0.offer(15));
        System.out.println(queue0.offer(20));
        System.out.println(queue0.offer(25));
        System.out.println(queue0.peek());
        System.out.println(queue0.poll());
        System.out.println(queue0.peek());
        System.out.println(queue0.poll());
        System.out.println(queue0.peek());
        System.out.println(queue0.poll());
        System.out.println(queue0.peek());
        System.out.println(queue0.poll());
        System.out.println(queue0.peek());
        System.out.println(queue0.poll());
        queue0 = new MyQueue();
        try {
            System.out.println(queue0.element());
            System.out.println(queue0.remove());
            System.out.println(queue0.add(0));
            System.out.println(queue0.element());
            System.out.println(queue0.remove());
            System.out.println(queue0.element());
            System.out.println(queue0.remove());
        } catch (NoSuchElementException ex) {
            System.out.println("java.util.NoSuchElementException");
        }
        try {
            System.out.println(queue0.add(5));
            System.out.println(queue0.add(10));
            System.out.println(queue0.add(15));
            System.out.println(queue0.add(20));
            System.out.println(queue0.add(25));
        } catch (IllegalStateException ex) {
            System.out.println("java.lang.IllegalStateException");
        }
        try {
            System.out.println(queue0.element());
            System.out.println(queue0.remove());
            System.out.println(queue0.element());
            System.out.println(queue0.remove());
            System.out.println(queue0.element());
            System.out.println(queue0.remove());
            System.out.println(queue0.element());
            System.out.println(queue0.remove());
            System.out.println(queue0.element());
            System.out.println(queue0.remove());
        } catch (NoSuchElementException ex) {
            System.out.println("java.util.NoSuchElementException");
        }
    }
}
