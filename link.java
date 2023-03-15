import java.util.Scanner;

public class link {

   public static void main(String[] args) {
      ll a = new ll();
      int n;
      Scanner sc=new Scanner(System.in);
      n=sc.nextInt();
      for(int i=0;i<n;i++)
      {
         int d=sc.nextInt();
         a.insertL(d);
      }
     int sizz=a.size();
      //System.out.print("\n" +sizz+"\n");
      for(int i=0;i<sizz;i++){
        
         int f=0;
        for(int j=i+1;j<sizz;j++){
         if(a.pos(i)==a.pos(j))
         {
             int val=a.pos(j);
            a.deleteNode(val);
            f=1;
         sizz-=1;
      j--;
        }
       
     }
       if(f==1)
     {
         a.deleteNode(a.pos(i));
      sizz--;
      i--;
      }
   
   }
    a.print();
     // System.out.print("\n" + sizz);

}
}
class Node {
      int data;
      Node next;

      Node(int dat) {
         data = dat;
         next = null;
      }
   }

class ll {
   int sz,SIZE;

    

 Node head = null;
 Node tail=null;
 public void push(int dat){
   Node n=new Node(dat);
   if(head==null){
      head=n;
      tail=n;
   }
   else{
   tail.next=n;
   tail=n;
   }
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
