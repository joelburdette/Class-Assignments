public class CircularArrayQueue<Integer> { 

    private int front;
    private int rear;
    private int size;
    private int capacity;
    private static final int DEFAULT_CAPACITY = 4;
    private Integer[] theData;

        public CircularArrayQueue() {
            this(DEFAULT_CAPACITY);
	}

    public CircularArrayQueue(int initCapacity) {
        capacity = initCapacity;
        theData = (Integer[]) new Object[capacity];
        front = 0;
        rear = capacity - 1;
        size = 0;
    }

    public boolean offer(Integer item) {
        if(size == capacity){
            return false;
        }
        size++;
        rear = (rear + 1) % capacity;
        theData[rear] = item;
        return true;
    }

    public String add(Integer item) {
        if(size == capacity){
            return "java.lang.IllegalStateException";
        }
        size++;
        rear = (rear + 1) % capacity;
        theData[rear] = item;
        return "true";
    }
    
    public String remove() {
        if(size == 0){
            return "java.util.NoSuchElementException";
        }
        Integer result = theData[getFront()];
        setFront((getFront() + 1) % capacity);
        size--;
        return result.toString();
    }

    public Integer poll() {
        if(size == 0){
            return null;
        }
        Integer result = theData[getFront()];
        setFront((getFront() + 1) % capacity);
        size--;
        return result;
    }

    public String element() {
        if(size == 0){
            return "java.util.NoSuchElementException";
        } else {
            return theData[getFront()].toString();
        }
    }

    public Integer peek() {
        if(size == 0){
            return null;
        } else {
            return theData[getFront()];
        }
    }
    
    public void str(){
        System.out.print("head=" + getFront() + ", tail=" + rear + ", size=" + size + ", [ ");
        for (int i = 0; i < DEFAULT_CAPACITY; i++){  
            System.out.print(theData[i] + " ");           
        }
        System.out.print("]");
        System.out.println();  
    }
    @Override
    public String toString() {
        return " ";    
    }

    public static void main(String[] args) {
        CircularArrayQueue queue0;

        queue0 = new CircularArrayQueue();

        queue0.str();
        System.out.println(queue0.peek());/**	examine 	*/
		System.out.println(queue0.poll());/**	remove 		*/
		System.out.println(queue0.offer(0));/**	insert 0 	*/
	queue0.str();//System.out.println("head=" + queue0.front + ", tail=" + queue0.rear + ", size=" + queue0.size + ", " + queue0);
		System.out.println(queue0.peek());/**	examine 	*/
		System.out.println(queue0.poll());/**	remove 		*/
		System.out.println(queue0.peek());/**	examine 	*/
		System.out.println(queue0.poll());/**	remove 		*/
		System.out.println(queue0.offer(5));/**	insert 5 	*/
        queue0.str();//System.out.println("head=" + queue0.front + ", tail=" + queue0.rear + ", size=" + queue0.size + ", " + queue0);
		System.out.println(queue0.offer(10));/**	insert 10 	*/
        queue0.str();//System.out.println("head=" + queue0.front + ", tail=" + queue0.rear + ", size=" + queue0.size + ", " + queue0);
		System.out.println(queue0.offer(15));/**	insert 15 	*/
        queue0.str();//System.out.println("head=" + queue0.front + ", tail=" + queue0.rear + ", size=" + queue0.size + ", " + queue0);
		System.out.println(queue0.offer(20));/**	insert 20 	*/
        queue0.str();//System.out.println("head=" + queue0.front + ", tail=" + queue0.rear + ", size=" + queue0.size + ", " + queue0);
		System.out.println(queue0.offer(25));/**	insert 25 	*/
        queue0.str();//System.out.println("head=" + queue0.front + ", tail=" + queue0.rear + ", size=" + queue0.size + ", " + queue0);
		System.out.println(queue0.peek());/**	examine 	*/
		System.out.println(queue0.poll());/**	remove 		*/
        queue0.str();//System.out.println("head=" + queue0.front + ", tail=" + queue0.rear + ", size=" + queue0.size + ", " + queue0);
		System.out.println(queue0.offer(30));/**	insert 30 	*/
        queue0.str();//System.out.println("head=" + queue0.front + ", tail=" + queue0.rear + ", size=" + queue0.size + ", " + queue0);
		System.out.println(queue0.peek());/**	examine 	*/
		System.out.println(queue0.poll());/**	remove 		*/
        queue0.str();//System.out.println("head=" + queue0.front + ", tail=" + queue0.rear + ", size=" + queue0.size + ", " + queue0);
		System.out.println(queue0.peek());/**	examine 	*/
		System.out.println(queue0.poll());/**	remove 		*/
        queue0.str();//System.out.println("head=" + queue0.front + ", tail=" + queue0.rear + ", size=" + queue0.size + ", " + queue0);
		System.out.println(queue0.peek());/**	examine 	*/
		System.out.println(queue0.poll());/**	remove 		*/
        queue0.str();//System.out.println("head=" + queue0.front + ", tail=" + queue0.rear + ", size=" + queue0.size + ", " + queue0);
		System.out.println(queue0.peek());/**	examine 	*/
		System.out.println(queue0.poll());/**	remove 		*/
        queue0.str();//System.out.println("head=" + queue0.front + ", tail=" + queue0.rear + ", size=" + queue0.size + ", " + queue0);
		System.out.println(queue0.offer(35));/**	insert 35 	*/
		System.out.println(queue0.peek());/**	examine 	*/
        queue0.str();//System.out.println("head=" + queue0.front + ", tail=" + queue0.rear + ", size=" + queue0.size + ", " + queue0);
		System.out.println(queue0.peek());/**	examine 	*/
		System.out.println(queue0.poll());/**	remove 		*/
        queue0.str();//System.out.println("head=" + queue0.front + ", tail=" + queue0.rear + ", size=" + queue0.size + ", " + queue0);
		System.out.println(queue0.peek());/**	examine 	*/
		System.out.println(queue0.poll());/**	remove 		*/

                /** perform following ops with the version of */
                /**     methods that throws exceptions. */
                /**     do not catch exceptions that are not */
                /**     expected to be thrown by a method */
                /**     according to the */
                /**     method specifications in Javadoc */
		//queue0 = new CircularArrayQueue();
        queue0.str();//System.out.println("head=" + queue0.front + ", tail=" + queue0.rear + ", size=" + queue0.size + ", " + queue0);
		System.out.println(queue0.element());/**	examine 	*/
		System.out.println(queue0.remove());/**	remove 		*/
		System.out.println(queue0.add(0));/**	insert 0 	*/
        queue0.str();//System.out.println("head=" + queue0.front + ", tail=" + queue0.rear + ", size=" + queue0.size + ", " + queue0);
		System.out.println(queue0.element());/**	examine 	*/
		System.out.println(queue0.remove());/**	remove 		*/
		System.out.println(queue0.element());/**	examine 	*/
		System.out.println(queue0.remove());/**	remove 		*/
		System.out.println(queue0.add(5));/**	insert 5 	*/
        queue0.str();//System.out.println("head=" + queue0.front + ", tail=" + queue0.rear + ", size=" + queue0.size + ", " + queue0);
		System.out.println(queue0.add(10));/**	insert 10 	*/
        queue0.str();//System.out.println("head=" + queue0.front + ", tail=" + queue0.rear + ", size=" + queue0.size + ", " + queue0);
		System.out.println(queue0.add(15));/**	insert 15 	*/
        queue0.str();//System.out.println("head=" + queue0.front + ", tail=" + queue0.rear + ", size=" + queue0.size + ", " + queue0);
		System.out.println(queue0.add(20));/**	insert 20 	*/
        queue0.str();//System.out.println("head=" + queue0.front + ", tail=" + queue0.rear + ", size=" + queue0.size + ", " + queue0);
		System.out.println(queue0.add(25));/**	insert 25 	*/
        queue0.str();//System.out.println("head=" + queue0.front + ", tail=" + queue0.rear + ", size=" + queue0.size + ", " + queue0);
		System.out.println(queue0.element());/**	examine 	*/
		System.out.println(queue0.remove());/**	remove 		*/
        queue0.str();//System.out.println("head=" + queue0.front + ", tail=" + queue0.rear + ", size=" + queue0.size + ", " + queue0);
		System.out.println(queue0.add(30));/**	insert 30 	*/
        queue0.str();//System.out.println("head=" + queue0.front + ", tail=" + queue0.rear + ", size=" + queue0.size + ", " + queue0);
		System.out.println(queue0.element());/**	examine 	*/
		System.out.println(queue0.remove());/**	remove 		*/
        queue0.str();//System.out.println("head=" + queue0.front + ", tail=" + queue0.rear + ", size=" + queue0.size + ", " + queue0);
		System.out.println(queue0.element());/**	examine 	*/
		System.out.println(queue0.remove());/**	remove 		*/
        queue0.str();//System.out.println("head=" + queue0.front + ", tail=" + queue0.rear + ", size=" + queue0.size + ", " + queue0);
		System.out.println(queue0.element());/**	examine 	*/
		System.out.println(queue0.remove());/**	remove 		*/
        //queue0.str();//System.out.println("head=" + queue0.front + ", tail=" + queue0.rear + ", size=" + queue0.size + ", " + queue0);
		System.out.println(queue0.element());/**	examine 	*/
		System.out.println(queue0.remove());/**	remove 		*/
        queue0.str();//System.out.println("head=" + queue0.front + ", tail=" + queue0.rear + ", size=" + queue0.size + ", " + queue0);
		System.out.println(queue0.offer(35));/**	insert 35 	*/
		System.out.println(queue0.element());/**	examine 	*/
        queue0.str();//System.out.println("head=" + queue0.front + ", tail=" + queue0.rear + ", size=" + queue0.size + ", " + queue0);
		System.out.println(queue0.element());/**	examine 	*/
		System.out.println(queue0.remove());/**	remove 		*/
        queue0.str();//System.out.println("head=" + queue0.front + ", tail=" + queue0.rear + ", size=" + queue0.size + ", " + queue0);
		System.out.println(queue0.element());/**	examine 	*/
		System.out.println(queue0.remove());/**	remove 		*/

    }

    /**
     * @return the front
     */
    public int getFront() {
        return front;
    }

    /**
     * @param front the front to set
     */
    public void setFront(int front) {
        this.front = front;
    }
}
