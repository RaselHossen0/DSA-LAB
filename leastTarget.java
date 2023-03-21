import java.util.ArrayList;
import java.util.Arrays;
import java.util.Deque;
import java.util.LinkedList;

import java.util.Scanner;

import javax.management.Query;
import javax.swing.text.AbstractDocument;

public class leastTarget {
    public static void main(String[] args) {
        Integer n;
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        Integer target=sc.nextInt();
     
        Deque deq=new LinkedList<>();
       
        for(int i=0;i<n;i++){
            int el=sc.nextInt();
            deq.addLast(el);
        }
        int min=100000;
        int cnt=0;
        ArrayList<Integer> arr=new ArrayList<Integer>();
        ArrayList<ArrayList<Integer>> ar2=new ArrayList<>();
     
     for(int i=0;i<n-1;i++){
        int sum=0;
        Deque temp=new LinkedList<>();
        ArrayList<Integer> row=new ArrayList<>();
        int c=0;try {
            while(sum<target){
                int item=(int) deq.pollFirst();
                sum+=item;
                temp.addLast(item);
                row.add(item);
                c++;
              }
        } catch (Exception e) {
            System.out.println("Null");
        }
            
      ar2.add(row);
      temp.pollFirst();
      while(temp!=null){
        try{
        int item=(int) temp.pollLast();
        deq.addFirst(item);
        }
        catch(Exception e){
            break;
        }
      }
     }
     for(int k=0;k<ar2.size();k++){
        min=Math.min(min,(ar2.get(k).size()));
     }
     for(int k=0;k<ar2.size();k++){
        if(ar2.get(k).size()==min){
            System.out.println(ar2.get(k));
            break;
        }
     }
     sc.close();
    }
}
