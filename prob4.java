import java.util.Scanner;

public class prob4 {
    public static void main(String args[]){
        int n;
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        Queue qu=new Queue();
        for(int i=0;i<n;i++){
            int el=sc.nextInt();
            qu.enQueue(el);
        }
        int k=sc.nextInt();int cn=0,sum=0;
     //   qu.display();
        while(!qu.isEmpty()){
            int f=0;
            int ad=qu.deQueue();
            if(cn==k){
                sum+=ad;
                cn=0;
                f=1;

            }
            if(f==0)
            cn++;
        }
        System.out.println(sum);
      qu.display();
    }
    
}
class Queue {
    int SIZE = 500;
    int items[] = new int[SIZE];
    int front, rear;
  
    Queue() {
      front = -1;
      rear = -1;
    }
  

    boolean isFull() {
      if (front == 0 && rear == SIZE - 1) {
        return true;
      }
      return false;
    }
  
   
    boolean isEmpty() {
      if (front == -1)
        return true;
      else
        return false;
    }
  
  
    void addFirst(int ele){
  
    }
    void enQueue(int element) {
  
   
      if (isFull()) {
        System.out.println("Queue is full");
      }
      else {
        if (front == -1) {
          
          front = 0;
        }
  
        rear++;
       
        items[rear] = element;
        
      }
    }
  
   
    int deQueue() {
      int element;
  
      // if queue is empty
      if (isEmpty()) {
        System.out.println("Queue is empty");
        return (-1);
      }
      else {
      
        element = items[front];
  
       
        if (front >= rear) {
          front = -1;
          rear = -1;
        }
        else {
       
          front++;
        }
       
        return (element);
      }
    }
  
    // display element of the queue
    void display() {
      int i;
      if (isEmpty()) {
        //System.out.println("Empty Queue");
      }
      else {
     
     
  
  
        System.out.println("Items -> ");
        for (i = front; i <= rear; i++)
          System.out.print(items[i] + "  ");
  
      
       
      }
    }
  
    
  }
