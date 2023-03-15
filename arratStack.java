public class arratStack {
    public static void main(String args[]){
        stack a=new stack();
        a.push(10);
        a.push(10);
        a.push(10);
        a.pop();
        a.print();
        Car d=new Car(null);
    }
}

class stack{
    
    public int max_size=100000;
    public int[] arr=new int[max_size];
    public int top=-1;
    public void push(int dat){
        top++;
        if(top==-1)
        return;
        
        arr[top]=dat;
    }
    public int pop(){
        int dat=arr[top];
         if(top==-1)
        System.out.println("Empty already");
        top--;
        return dat;
    }
    public void print(){
        for(int i=0;i<=top;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    public boolean isEmpty(){
        return top<0;
    }
    public int top(){
        return arr[top];
    }
    public int size(){
        return top+1;
    }


}
