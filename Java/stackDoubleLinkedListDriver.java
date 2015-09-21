package stackdoublelinkedlistdriver;
/**
 *
 * @author Joel Burdette
 */
import java.io.*;
import java.lang.*;

class StackDblList {
	private Node head;
        private Node tail;
        private Node prev;

	public boolean empty() {
            if(head == null) {
                return true;
            }
            return false;
        }

	public Integer push(Integer item) {
	Node newNode;
		newNode=new Node(item);
		newNode.next=head;
		head=newNode;
                return newNode.item;
        }

	public Integer peek() {
            if(empty()) {
                return null;
            }
            return head.item;
	}

	public Integer pop() {
            Node tmp;
            if(head==null) return null;
            tmp=head;
            head=head.next;
            return tmp.item;
	}
        
	class Node {
		Node next;
		Node prev;
		Integer item;

		Node(Integer item) {
			next=null;
			prev=null;
			this.item=item;
		}

		public String toString() {
			return item.toString();
		}
	}
}

public class StackDoubleLinkedListDriver {
	public static void main(String[] args) {
		StackDblList stack0;

		stack0=new StackDblList();
		System.out.println(stack0.empty());
		System.out.println(stack0.peek());
		System.out.println(stack0.pop());
		System.out.println(stack0.push(5));
		System.out.println(stack0.empty());
		System.out.println(stack0.peek());
		System.out.println(stack0.pop());
		System.out.println(stack0.empty());
		System.out.println(stack0.push(10));
		System.out.println(stack0.push(15));
		System.out.println(stack0.push(20));
		System.out.println(stack0.push(25));
		System.out.println(stack0.peek());
		while(stack0.empty()==false) 
			System.out.println(stack0.pop());
		System.out.println(stack0.empty());
		System.out.println(stack0.peek());
	}
}
