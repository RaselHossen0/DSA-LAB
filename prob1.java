public class prob1{
    public static void main(String[] args)
	{

		Deque dq = new Deque(59);
		dq.addFront(3);
		dq.addRear(5);
		dq.addRear(10);
		System.out.println(dq.getRear());
		dq.removeRear();
		System.out.println(dq.getRear());
		dq.addFront(15);
		System.out.println(dq.getFront());
		dq.removeFront();
		System.out.println(dq.getFront());
	}
}
class Deque {
	static final int MAX = 100;
	int arr[];
	int front;
	int rear;
	int size;

	public Deque(int size)
	{
		arr = new int[MAX];
		front = -1;
		rear = 0;
		this.size = size;
	}

	boolean isFull()
	{
		return ((front == 0 && rear == size - 1)|| front == rear + 1);
	}

	
	boolean isEmpty() {
        return (front == -1); 
    }
	void addFront(int data)
	{
		
		if (isFull()) {
			System.out.println("Overflow");
			return;
		}

		
		if (front == -1) {
			front = 0;
			rear = 0;
		}

		else if (front == 0)
			front = size - 1;

		else 
			front = front - 1;
		arr[front] = data;
	}

	void addRear(int data)
	{
		if (isFull()) {
			System.out.println(" Overflow ");
			return;
		}

		
		if (front == -1) {
			front = 0;
			rear = 0;
		}

		
		else if (rear == size - 1)
			rear = 0;

		
		else
			rear = rear + 1;
		arr[rear] = data;
	}


	void removeFront()
	{
		
		if (isEmpty()) {
			System.out.println("Queue Underflow\n");
			return;
		}

	
		if (front == rear) {
			front = -1;
			rear = -1;
		}
		else
		
			if (front == size - 1)
			front = 0;

		else 
			front = front + 1;
	}

	
	void removeRear()
	{
		if (isEmpty()) {
			System.out.println(" Underflow");
			return;
		}

		
		if (front == rear) {
			front = -1;
			rear = -1;
		}
		else if (rear == 0)
			rear = size - 1;
		else
			rear = rear - 1;
	}

	
	int getFront()
	{
		
		if (isEmpty()) {
			System.out.println(" Underflow");
			return -1;
		}
		return arr[front];
	}

	
	int getRear()
	{
		
		if (isEmpty() || rear < 0) {
			System.out.println(" Underflow\n");
			return -1;
		}
		return arr[rear];
	}

	
	
}
