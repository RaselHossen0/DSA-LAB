import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Reader;

import javax.sound.sampled.Line;

public class BST {
    TreeNode root;
    public void  insertion(int val){
        if(root==null)
        {
            root=new TreeNode(val);
        }
        else 
        add(val,root);


    }
    public void add(int val,TreeNode node){
        if(val<node.val){
            if(node.left!=null)
            add(val,node.left);
            else
            node.left=new TreeNode(val);

        }
        else{
            if(node.right!=null){
                add(val,node.right);
            }
            else
            node.right=new TreeNode(val);
        }

    }
    public void printIN() throws IOException{
        inorder(root);
        
        System.out.println();
    }
      public void printPre() throws IOException{
        preorder(root);
        System.out.println();
    }
      public void printPost() throws IOException{
        postorder(root);
        System.out.println();
    }
    public void inorder(TreeNode node) throws IOException{
        if(node.left!=null){
            inorder(node.left);
        }
          BufferedWriter writer=new BufferedWriter(new FileWriter("javaOut.txt"));
        writer.write(node.val);
        writer.close();
       if(node.right!=null){
            inorder(node.right);
        }
    }
    public void postorder(TreeNode node) throws IOException{
        if(node.left!=null){
            inorder(node.left);
        }
       
       if(node.right!=null){
            inorder(node.right);
        }
         System.out.print(node.val+" ");
    }
    public void preorder(TreeNode node) throws IOException{
        BufferedWriter writer=new BufferedWriter(new FileWriter("javaOut.txt"));
        writer.write(node.val);
        writer.close();
          System.out.print(node.val+" ");
        if(node.left!=null){
            inorder(node.left);
        }
       if(node.right!=null){
            inorder(node.right);
        }
    }
    public boolean searcH(int target,TreeNode node){
        boolean ans;
        if (node==null){
            ans=false;
        }
       else  if(node.val==target){ 
        ans=true;
        }
        else if(target<node.val){
            ans=searcH(target, node.left);
        }
        else{
            ans=searcH(target, node.right);
        }
        return ans;


    }
    public void search(int val){
        boolean ans=searcH(val, root);
        System.out.println(ans);
       // searcH(val,root);
    }
    TreeNode findMin(TreeNode node){
        while(node.left!=null)
        node=node.left;
        return node;
    }
    TreeNode deleT(int Val,TreeNode node){
        if(node==null)
        return node;
        if(Val<node.val)
        node.left=deleT(Val, node.left);
        else if(Val>node.val)
        node.right=deleT(Val, node.right);
        else{
            if(node.left==null&&node.right==null)
            node=null;
            else if(node.left==null)
            node=node.right;
            else if(node.right==null)
            node=node.left;
            else{
                TreeNode successor=findMin(node.right);
                node.val=successor.val;
                node.right=deleT(successor.val, node.right);
            }
        }
        return node;


    }
    void delete (int val){
        root=deleT(val, root);
    }
     
    public  static void main(String args[]) throws IOException{
        
            // BufferedReader reader=new BufferedReader(new FileReader("/home/student/Documents/code1/DSA-LAB/javaIn.txt") );
            //   BufferedWriter writer=new BufferedWriter(new FileWriter("DSA-LAB/javaOut.txt") );
        
       
        BST tree=new BST();
        tree.insertion(7);
        tree.insertion(4);
        tree.insertion(8);
        tree.insertion(13);
        tree.insertion(3);
        tree.insertion(1);
        String num;
        // while((num=reader.readLine())!=null){
          
        //     writer.write(num+" ");
        //    writer.write(" ");

        //    tree.insertion(num);
        // }
        // reader.close();
        // writer.close();
        tree.printPost();
        tree.printPre();
        tree.printIN();
        tree.search( 13);
        tree.delete(8);
          tree.printIN();

    }


    
}
class TreeNode{
    int val;
    TreeNode left;
     TreeNode right;
     TreeNode(int val){
        this.left=null;
        this.right=null;
        this.val=val;
     }
}

// public class BST {
//     TreeNode<Integer> root;
//     public void  insertion(int val){
//         if(root==null)
//         {
//             root=new TreeNode(val);
//         }
//         else 
//         add(val,root);


//     }
//     public void add(int val,TreeNode<Integer> node){
//         if(val<node.val){
//             if(node.left!=null)
//             add(val,node.left);
//             else
//             node.left=new TreeNode(val);

//         }
//         else{
//             if(node.right!=null){
//                 add(val,node.right);
//             }
//             else
//             node.right=new TreeNode(val);
//         }

//     }
//     public void print(){
//         inorder(root);
//     }
//     public void inorder(TreeNode node){
//         if(node.left!=null){
//             inorder(node.left);
//             return;
//         }
//         System.out.println(node.val);
//        if(node.right!=null){
//             inorder(node.right);
//             return;
//         }
//     }
//     public  static void main(String args[]){
//         BST tree=new BST();
//         tree.insertion(123);
//         tree.insertion(123);
//         tree.print();


//     }


    
// }
// class TreeNode<T>{
//     T val;
//     TreeNode<T> left;
//      TreeNode<T> right;
//      TreeNode(T val){
//         this.left=null;
//         this.right=null;
//         this.val=val;
//      }
// }