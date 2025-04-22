public class Queue {
    private int maxSize;    // size of queue array
    private int[] queArray;
    private int front;           //front of the queue
    private int rear;           //rear of the queue
    private int nItems;  //no of items of the queue

    public Queue(int s) {// constructor

        maxSize = s;       // set array size
        queArray = new int[maxSize];
        front = 0;
        rear = -1;
        nItems = 0;             // no items
    }

    public void insert(int j) {
        // increment rear and insert an item
        if (rear == maxSize - 1) {
            System.out.println("Queue is full");
        } else {
            queArray[++rear] = j;
            nItems++;
        }
    }

    public int remove() {
        if (nItems == 0) {
            System.out.println("Queue is empty");
            return -99;
        } else {
            nItems--;
            return queArray[front++];
        }
    }

    public int peekFront() {
        if (nItems == 0) {
            System.out.println("Queue is empty");
            return -99;
        } else {
            return queArray[front];
        }
    }

    public static void main(String[] args) {
        Queue theQueue = new Queue(10);  // create a queue with max size 10

        theQueue.insert(10);  // insert given items
        // theQueue. insert(20);
        //theQueue. insert(30);


        theQueue.remove();
        int front = theQueue.peekFront();
        System.out.println("Front element is: " + front);

    }
}
