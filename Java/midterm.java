package midterm;

public class DoubleLinkedListDriver {

    public static void main(String[] args) {
        DoubleLinkedList list0;

        list0 = new DoubleLinkedList();
        System.out.println("Content: ");
        list0.traverseDescend();
        System.out.println();
        System.out.println(list0.add(10));
        System.out.println("Content: ");
        list0.traverseAscend();
        System.out.println();
        System.out.println(list0.add(20));
        System.out.println("Content: ");
        list0.traverseDescend();
        System.out.println();
        System.out.println(list0.add(30));
        System.out.println("Content: ");
        list0.traverseAscend();
        System.out.println();
        System.out.println(list0.add(25));
        System.out.println("Content: ");
        list0.traverseAscend();
        System.out.println();
        System.out.println(list0.add(20));
        System.out.println("Content: ");
        list0.traverseDescend();
        System.out.println();

        return;
    }
}

class DoubleLinkedList {

    Node head;
    Node tail;

    public Integer add(Integer e) {
        if (head == null) {
            head = new Node(e);
            head.previous = tail;
            return head.item;
        }
        Node curr;
        Node a = new Node(e);
        for (curr = head; curr.next != null; curr = curr.next);
        if(curr == a){
            return -1;
        }
        curr.next = new Node(e);
        curr.next.previous = curr;
        return curr.item;
    }

    public void traverseAscend() {
        if (head == null) {
            System.out.print("");
        }
        for (Node curr = head; curr != tail; curr = curr.next) {
            System.out.print(curr.item + " ");
        }
        System.out.print(tail);
    }

    public void traverseDescend() {
        if (head == null) {
            System.out.print("");
            return;
        }
        for (Node curr = head; curr != tail; curr = curr.next) {
            System.out.print(curr + " ");
        }
    }

    class Node {

        Node next;
        Node previous;
        Integer item;

        Node(Integer item) {
            next = null;
            previous = null;
            this.item = item;
        }

        public String toString() {
            return item.toString();
        }
    }
}
