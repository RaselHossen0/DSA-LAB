import java.util.ArrayList;
import java.util.Scanner;
import java.util.*;
public class kLmerge {
    public  static  void main(String args[]){
            ArrayList<Integer> arr=new ArrayList<Integer>();
            int in=0;
            Scanner sc=new Scanner(System.in);
           // int k=sc.nextInt();

             ll lst1=new ll();
              ll lst2=new ll();
              ll lst3=new ll();

              Node temp=lst1.head;
              Node temp2=lst2.head;

              ll lst4=new ll();
              int n1=sc.nextInt();
              for(int i=0;i<n1;i++){
               int d=sc.nextInt();
               lst1.push(d);
               lst3.push(d);
              }
               int n2=sc.nextInt();
              for(int i=0;i<n2;i++){
               int d=sc.nextInt();
               lst2.push(d);
               lst3.push(d);
              }
              int n3=sc.nextInt();
              for(int i=0;i<n3;i++){
               int d=sc.nextInt();
               lst4.push(d);
               lst3.push(d);
              }
              lst3.print();
             // lst2.print();
           // arr=new int[k*100];
           // int l=k;
         //   System.out.println(k);
         //    for(int j=0;j<k;j++){
         //        ll lst=new ll();
         //     //   ll cur=lst;
         //        int n=sc.nextInt();
         //        for(int i=0;i<n;i++){
         //            int d=sc.nextInt();
         //            lst.push(d);
         //        }
         //         //System.out.println(arr);
         //      //  int r=0;
         //      lst.print();
         //        for(int s=0;s<lst.size();s++){
         //            arr.add(lst.pos(s));
         //            //=lst.pos(r);
         //           // r++;
         //            in++;
         //        }

         //    }
            sc.close();
            // for(int i=0;i<in;i++){
            //     for(int e=i;e<in;e++){
            //         if(arr.get(i)<arr.get(e))
            //         {
            //                     Collections.swap(arr, i, e);

                        
            //         }
            //     }
            // }
            Collections.sort(arr);
            //System.out.println(arr);
            // ll ans =new ll();
            // for(int i=0;i<in;i++){
            //     int d=arr.get(i);
            //     ans.push(d);
            // }
            // ans.print();
    }
}
    class Node {
    public  int data;
     public Node next;

     public Node(int dat) {
         data = dat;
         next = null;
      }
   }
class ll {
  // public static final int data = 0;
int sz,SIZE;



public Node head = null;
 Node tail=null;
 public void push(int dat){
   Node n=new Node(dat);
   if(head==null){
      head=n;
      tail=n;
   }
   else{
   tail.next=n;
   tail=n;}
 }


   public void insertF(int dat) {
      sz++;
      Node newnode = new Node(dat);
      if (head == null) {
         head = newnode;
         return;
      } else {
         newnode.next = head;
         head = newnode;
      }

   }
   void deleteNode(int key)
	{
		Node temp;
        temp=head;

		if (temp == null)
			return;
		if (temp != null && temp.data == key) {
			head = head.next; 
			return;
		}
        int f=0;
		while (temp.next!= null) {
            if(temp.next.data==key){
                f=1;
                temp.next=temp.next.next;
            }
            else{
                temp=temp.next;
            }
            if(f==1)
        return;
			
		}
        
      //SIZE--;
	}
   public void delete(int key){
      if(head==null)
      return ;
      if(head.next==null&&head.data==key)
      head=null;

   }
   public int pos(int i){
      int cnt=0;
      Node current = head;
      int value=current.data;
      while (current != null) {
         if(cnt==i){
            value=current.data;
            break;
         
         }
         cnt++;
         current = current.next;
      }
      return value;
     
   }

   public int searchData(int key,int siz){
      int ex=-1;
      if(head==null)
      return ex;
      Node curr=head;
      int f=0;
      for(int i=0;i<siz;i++){
         if(curr.data==key){
            f=1;
            return curr.data;
         }
         curr=curr.next;

      }
      if(f!=1)
      return ex;
      return f;
    
      

   }

   public void insertL(int dat) {
      sz++;
      Node newnode = new Node(dat);
      if (head == null) {
         head = newnode;
         return;
      }
      Node current = head;
      while (current.next != null) {
         current = current.next;
      }

      current.next = newnode;

   }

   public void insertM(int dat, int pos) {
      sz++;
      Node newnode = new Node(dat);
      if (head == null) {
         head = newnode;
         return;
      }
      if (pos > sz || pos < 0)
         return;
      Node current = head;
      Node temp = null;
      for (int i = 0; i < sz; i++) {
         if (i == pos) {
            temp.next = newnode;   
            newnode.next = current;
            break;
         }
         temp=current;
         current = current.next;


      }

   }
   public void deleteF(){
      sz--;
      if(head==null){
         return ;
      }
      head=head.next;
   }
   public void deleteL(){
      sz--;
      if(head==null){
         return ;
      }
      if(head.next==null){
         head=null;
         return;
      }
      Node SecondLast=head;
      head=head.next;
     
      while(SecondLast.next!=null){
         
         SecondLast=SecondLast.next;
      }
      SecondLast.next=null;
      
     sz--;
   }
   

   public void print() {
      if (head == null) {
         System.out.println("Empty");
         return;
      }

      Node current = head;

      while (current != null) {
         System.out.print(current.data + " ");
         current = current.next;
      }

   }

   public int size() {

      if (head == null) {
         SIZE=0;
         return SIZE;
      }

      Node current = head;

      while (current != null) {
         SIZE++;
         current = current.next;
      }
      return SIZE;
   }
   

}

