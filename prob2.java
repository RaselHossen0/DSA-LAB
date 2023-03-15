
import java.util.Scanner;

public class prob2 {
    public static void main(String args[]){
        int n;
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        Deque qu=new Deque(100);
     
        for(int i=0;i<n;i++){
            String el=sc.nextLine();
            qu.addFront(el);
        }
        //qu.display();
        for(int i=0;i<n;i++){
           String s=qu.getRear();
           qu.removeRear();
            qu.addFront(s);
        }
       
        qu.display();
    }
    
}


class Deque {
	static final int MAX = 100;
	String arr[];
	int front;
	int rear;
	int size;

	public Deque(int size)
	{
		arr = new String[MAX];
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
	void addFront(String data)
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

	void addRear(String data)
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

	
	String getFront()
	{
		
		if (isEmpty()) {
			System.out.println(" Underflow");
			return "EM";
		}
		return arr[front];
	}

	
	String getRear()
	{
		
		if (isEmpty() || rear < 0) {
			System.out.println(" Underflow\n");
			return "fj";
		}
		return arr[rear];
	}
    void display(){
        for(int i=front;i<=rear;i++){
            System.out.print(arr[i]+" ");
        }
    }

	
	
}

