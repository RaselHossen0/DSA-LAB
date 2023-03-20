// import java.util.ArrayList;
// import java.util.Scanner;

import java.util.ArrayList;
import java.util.Scanner;

public class prob3 {
    public static void main(String args[]){
        int n;
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        int target=sc.nextInt();
        Queue qu=new Queue();
        // Queue q=new Queue();
        // Queue qq=new Queue();
        //int sum=0;
        for(int i=0;i<n;i++){
            int el=sc.nextInt();
            qu.enQueue(el);
            // sum+=el;
            // while(sum>=target){
            //     int y=q.top();
            //     sum-=y;
            //     if(sum<target){
            //         of(mn<q.size()){
            //             f=1;
            //             mn=q.size();
            //             ans.clear();
            //             while(!q.isEmpty()){
            //                 qq.enQueue(q.top());
            //                 arr.add(q.top());
            //                 q.pop();
            //             }
            //             break;
            //         }
            //         else{
            //             q.pop();
            //             break;
            //         }
            //     }
            //     q.pop();
            // }
            // if(f){
            //     qq.pop();
            //     while(qq.isEmpty()){
            //         q.enQueue(qq.top());
            //         qq.pop();
            //     }
            // }

        }
        //for(int i=0;i<arr.size
      
        
        int cnt=0;
        ArrayList<Integer> arr=new ArrayList<>;
      while(cnt!=n){
        int f=0;
        cnt++;
        int sum=0;
        while(cnt==1){
            int item=qu.deQueue();
            //sum+=item;
            if(item==target){
            arr[cnt].add(item);
            f=1;
            break;
        }
            qu.enQueue(item);
        }
        
       if(f==1)
       break;
      }  

        System.out.println(arr[1]);
        qu.display();

    }
    
    
}

class Queue {
    int SIZE = 5000;
    int items[] = new int[SIZE];
    int front, rear;
  
    Queue() {
      front = -1;
      rear = -1;
    }
    int top(){
        return items[rear];
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
        return -1;
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
  
   
    void display() {
      int i;
      if (isEmpty()) {
        System.out.println("Empty Queue");
      }
      else {
        for (i = front; i <= rear; i++)
          System.out.print(items[i] + "  ");
      }
    }  
  }


// public class prob3 {
//     public static void main(String args[]){
//         int n;
//         Scanner sc=new Scanner(System.in);
//         n=sc.nextInt();
//         int target=sc.nextInt();
//         Queue qu=new Queue();
//         for(int i=0;i<n;i++){
//             int el=sc.nextInt();
//             qu.enQueue(el);
//         }
//         sc.close();
        

//         int cnt=0;
//        // ArrayList<Integer>[] arr=new ArrayList[100];
//     //   while(cnt!=n){
//     //     int f=0;
//     //     cnt++;
//     //     int sum=0;
//     //     while(cnt==1){
//     //         int item=qu.deQueue();
//     //         //sum+=item;
//     //         if(item==target){
//     //         arr[cnt].add(item);
//     //         f=1;
//     //         break;
//     //     }
//     //         qu.enQueue(item);
//     //     }
        
//     //    if(f==1)
//     //    break;
//     //   }
//       //System.out.println(arr[1]);
//         qu.display();
  

        
//     }
    
    
// }

// class Queue {
//     int SIZE = 5000;
//     int items[] = new int[SIZE];
//     int front, rear;
  
//     Queue() {
//       front = -1;
//       rear = -1;
//     }
//     int top(){
//         return items[rear];
//     }
  

//     boolean isFull() {
//       if (front == 0 && rear == SIZE - 1) {
//         return true;
//       }
//       return false;
//     }
  
   
//     boolean isEmpty() {
//       if (front == -1)
//         return true;
//       else
//         return false;
//     }
  
  
//     void addFirst(int ele){
  
//     }
//     void enQueue(int element) {
  
   
//       if (isFull()) {
//         System.out.println("Queue is full");
//       }
//       else {
//         if (front == -1) {
          
//           front = 0;
//         }
  
//         rear++;
       
//         items[rear] = element;
        
//       }
//     }
  
   
//     int deQueue() {
//       int element;
  
//       // if queue is empty
//       if (isEmpty()) {
//         System.out.println("Queue is empty");
//         return -1;
//       }
//       else {
      
//         element = items[front];
  
       
//         if (front >= rear) {
//           front = -1;
//           rear = -1;
//         }
//         else {
       
//           front++;
//         }
       
//         return (element);
//       }
//     }
  
   
//     void display() {
//       int i;
//       if (isEmpty()) {
//         System.out.println("Empty Queue");
//       }
//       else {
//         for (i = front; i <= rear; i++)
//           System.out.print(items[i] + "  ");
//       }
//     }  
//   }

