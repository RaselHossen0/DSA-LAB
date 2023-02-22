 class Stack {
    class Node{
        int data;
        Node next;
    }
    public int top=-1;
    public Node head=null;
    public void push(int data){
        Node newnode=new Node();
        newnode.data=data;
        newnode.next=null;
        if(top==-1){
        head=newnode;
        top++;
        return;
        }
        Node current=head;
        while(current.next!=null){
            current=current.next;
        }
        current.next=newnode;
        top++;
    }
    public boolean empty(){
        if(top<0)
        return true;
        else
        return false;
    }
    public void print(){
        if(head==null){
            return;
        }
        Node current=head;
        while(current!=null){
            System.out.print(current.data+" ");
            current=current.next;
        }
      //  System.out.print(top);
        System.out.print("\n");
    }
    public void pop(){
        Node current=head;
        if(top==-1)
        {
            return;
        }
        int i=0;
        while(i<top-1){
            current=current.next;
            i++;
        }
        current.next=null;
        top--;
    }
    public int size(){
        return top+1;
    }
    public int top(){
        Node current=head;
        int i=0;
        while(i<top){
            i++;
            current=current.next;
        }
        return current.data;

    }
    public int at(int ind){
        Node current=head;
        int i=0;
        int ans=-1;
        for(;i<=top;i++){
            if(i==ind)
            ans=current.data;
            current=current.next;
        }
        return ans;
    }
}
public class stack{
    public static void main(String[] args){
        Stack stck=new Stack();
        stck.push(10);
         stck.push(170);
            stck.push(760);
            stck.push(160);
            stck.push(174);
            //stck.print();
         stck.pop();
         stck.pop();
        stck.print();
        System.out.print(stck.at(3));
    }
}
