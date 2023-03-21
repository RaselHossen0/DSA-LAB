import java.util.Scanner;
import java.util.Stack;

public class inTOpost {
    public static void main(String[] args){
        String s;
        String post="";
        stack st=new stack();

        Scanner sc=new Scanner(System.in);
        s=sc.nextLine();
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(ch>='a'&&ch<='z'||ch>='A'&&ch<='Z'||ch>='0'&&ch<='1')
            post+=ch;
            else if(ch=='(')
            st.push(ch);
            else if(ch==')'){
                while(st.peek()!='('){
                    post+=st.pop();
                }
                st.pop();
            }
            else{
                while(!st.isEmpty() && !(st.peek()=='(') && prec(ch) <= prec(st.peek())){
                    post+=st.pop();
                }
                st.push(ch);
            }
        }
        while(!st.isEmpty()){
            post+=st.pop();
        }
        System.out.println(post);
        sc.close();

    }
      static int prec(char x)  
       {  
            if (x == '+' || x == '-')
            return 1;
            if (x == '*' || x == '/' )
            return 2;
            return 0;
            }

}
 class Node{
        char data;
        Node next;
        Node(char dat) {
         data = dat;
         next = null;
      }
    }
 class stack {
    
     public int top=-1;
    public Node head=null;
  
    public void push(char dat){
        Node newnode=new Node(dat);
        if(top==-1)
      {  
          head=newnode;
        top++;
        return;
        }
       newnode.next=newnode;
       head=newnode;
        top++;
    }
    public boolean isEmpty(){
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
    public char pop(){
        
        if(top==-1)
        {
            System.out.println("Underflow");
        }
       char val=head.data;
       head=head.next;
       top--;
       return val;
    }
   
    public int size(){
        return top+1;
    }
    public char peek(){
        
        return head.data;

    }
    public int at(char ind){
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