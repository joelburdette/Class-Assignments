package iterator;

import java.lang.*;
import java.util.Iterator;
class SingleLinkedList {
	private Node head;
       
        
	/** append e, always returns true */
	public boolean add(Integer e) {
		Node curr;
		if(head==null) {
			head=new Node(e);
			return true;
		}
		for(curr=head; curr.next!=null; curr=curr.next);
		curr.next=new Node(e);
		return true;
	}
	/** add e at the front */
	public void addFirst(Integer e) {
		Node newNode;
		newNode=new Node(e);
		newNode.next=head;
		head=newNode;
	}
	/** add element to the specified index */
	/** do nothing (i.e., abort) if index is out-of-bound */
	public void add(int index, Integer element) { 
		// do nothing if index out-of-bound
		Node curr;
		int i;
		if(index<0) return;
		if(index==0) {
			addFirst(element);
			return;
		}
		if(head==null) add(element);
		for(i=0, curr=head; curr!=null && i<index-1; 
			curr=curr.next, i++) {		
		}
		if(curr==null) {
			//throw new OutOfBoundsException// out of bound
			return;
		}
		Node newNode = new Node(element);
		newNode.next=curr.next;
		curr.next=newNode;
	}
	/** get the element at the specified index */
	/** return null if index out-of-bound */
	public Integer get(int index) {
		Node curr;
		int i;
		if(index<0) return null;
		for(curr=head, i=0; curr!=null && i<index; curr=curr.next, i++);
		if(curr==null) return null;
		return curr.item;
	}
	/** set the item at the specified index to element */
	/** return the replaced item */
	public Integer set(int index, Integer element) {
		Node curr;
		Integer tmp;
		int i;
		if(index<0) return null;
		for(curr=head, i=0; curr!=null && i<index; curr=curr.next, i++);
		if(curr==null) return null;
		tmp=curr.item;
		curr.item=element;
		return tmp;
	}
	/** removed the item at the specified index */
	/** return the removed item */
	public Integer remove(int index) {
		// return null if index out-of-bound
		Node curr, tmp;
		int i;
		if(index<0) return null;
		if(index==0) {
			return remove();
		}
		for(i=0, curr=head; curr!=null && i<index-1; 
			curr=curr.next, i++);
		if(curr==null) return null;
		if(curr.next==null) return null;
		tmp=curr.next;
		curr.next=curr.next.next;
		return tmp.item;
	}
	/** removed the item at the end */
	/** return the removed item */
	public Integer removeLast() {
		Node curr, tmp;
		if(head==null) return null;
		if(head.next==null) {
			tmp=head;
			head=null;
			return tmp.item;
		}
		for(curr=head; curr.next.next!=null; curr=curr.next);
		tmp=curr.next;
		curr.next=null;
		return tmp.item;
	}
	/** removed the item at the front */
	/** return the removed item */
	public Integer remove() {
		Node tmp;
		if(head==null) return null;
		tmp=head;
		head=head.next;
		return tmp.item;
	}
	/** traverse the list. Print each element with a space as separator */
	public void traverse() {
		for(Node curr=head; curr!=null; curr=curr.next) {
			System.out.print(curr + " ");
		}
	}
	/** return the index of an item */
	/** return -1 if item not found on list */
	public int indexOf(Integer o) {
		Node curr;
		int i;
		for(curr=head, i=0; curr!=null; curr=curr.next, i++) {
			if(curr.item.equals(o)) 
				return i;
		}
		return -1;
	}
	class Node {
		Node next;
		Integer item;
		Node(Integer item) {
			next=null;
			this.item=item;
		}

                @Override
		public String toString() {
			return item.toString();
		}
	}
	public class MyIterator implements Iterator<Node>/* implement the Iterator interface */{
        
        public Node curr;
        public Node next;
        
        public MyIterator(){
            this.curr = head;
            this.next = curr.next;
            
            
        }

        @Override
        public boolean hasNext() {
            return curr.next !=null;
        }

//        @Override
//        public Node next() {
//            this.curr = this.curr.next;
//            return curr;
//        }

        @Override
        public Node next() {
            System.out.println(curr.next.item);
            return curr.next;
        }
        
//        @Override
//        public void remove(){
//            return void;
//        }
        
        public int currValue(){
            return curr.item;
        }

        @Override
        public void remove() {
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }
        
	}

	/** return the iterator of this list */
        public MyIterator iterator() { 
        return new MyIterator();
        }
}
public class SingleLinkedListDriver2 {
	public static void main(String[] args) {
		SingleLinkedList list0;
		list0=new SingleLinkedList();
		System.out.println("Adding 10 ...");
		list0.add(10);
		System.out.println("Adding 15 ...");
		list0.add(15);
		System.out.println("Adding 20 ...");
		list0.add(20);
		System.out.println("Adding 25 ...");
		list0.add(25);
		System.out.println("Adding 30 ...");
		list0.add(30);
		System.out.println("Adding 35 ...");
		list0.add(35);
		System.out.println("Adding 40 ...");
		list0.add(40);
		System.out.println("Adding 45 ...");
		list0.add(45);

		Iterator iter = list0.iterator();
		while(iter.hasNext()){
                  iter.next();
                }
                System.out.println();
        }
}        
