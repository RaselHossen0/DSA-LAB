import java.io.*;
import java.util.*;

public class binarySearchTree<T extends Comparable<T>> {
    TreeNode<T> root;

    public void insertion(T key) {
        if (root == null) {
            root = new TreeNode<T>(key);
        } else
            add(key, root);
    }

    public void add(T key, TreeNode<T> node) {
        if (key.compareTo(node.key) < 0) {
            if (node.left != null)
                add(key, node.left);
            else
                node.left = new TreeNode<T>(key);

        } else {
            if (node.right != null) {
                add(key, node.right);
            } else
                node.right = new TreeNode<T>(key);
        }

    }

    public void printIN() throws IOException {
        System.out.println("In Order: ");
        inorder(root);

        System.out.println();
    }

    public void printPre() throws IOException {
        System.out.println("Pre Order: ");
        preorder(root);
        System.out.println();
    }

    public void printPost() throws IOException {
        System.out.println("Post Order: ");
        postorder(root);
        System.out.println();
    }

    public void inorder(TreeNode<T> node) throws IOException {
        if (node.left != null) {
            inorder(node.left);
        }
        System.out.print(node.key + " ");
        if (node.right != null) {
            inorder(node.right);
        }
    }

    public void postorder(TreeNode<T> node) throws IOException {
        if (node.left != null) {
            postorder(node.left);
        }

        if (node.right != null) {
            postorder(node.right);
        }
        System.out.print(node.key + " ");
    }

    public void preorder(TreeNode<T> node) throws IOException {
        System.out.print(node.key + " ");
        if (node.left != null) {
            preorder(node.left);
        }
        if (node.right != null) {
            preorder(node.right);
        }
    }

    public boolean searcH(T target, TreeNode<T> node) {
        boolean ans;
        if (node == null) {
            ans = false;
        } else if (node.key.equals(target)) {
            ans = true;
        } else if (target.compareTo(node.key) < 0) {
            ans = searcH(target, node.left);
        } else {
            ans = searcH(target, node.right);
        }
        return ans;
    }

    public void search(T key) {
        boolean ans = searcH(key, root);
        System.out.println(ans);

    }

    TreeNode<T> findMin(TreeNode<T> node) {
        while (node.left != null)
            node = node.left;
        return node;
    }

    public void lSkeewed() {
        System.out.println("Right Skewwed:" + (left_skeewed(root) != false));
    }

    boolean left_skeewed(TreeNode<T> root) {

        if (root.right != null)
            return false;
        else {
            return left_skeewed(root.left);
        }
    }

    public void rSkeewed() {
        System.out.println("Right Skewwed:" + (right_skeewed(root) != false));
    }

    boolean right_skeewed(TreeNode<T> root) {
        if (root == null)
            return false;
        if (root.left != null)
            return false;
        else {
            return right_skeewed(root.right);
        }
    }

    int height(TreeNode<T> node) {
        if (node == null)
            return 0;
        else {
            int lDept = height(node.left);
            int rDept = height(node.right);
            if (lDept > rDept)
                return lDept + 1;
            else
                return rDept + 1;
        }
    }

    public void hei() {
        System.out.println(height(root));
    }

    public void isBalanced() {
        System.out.println("Your tree is Blanced!?: " + isBalanced(root));
    }

    public boolean isBalanced(TreeNode<T> node) {
        if (node == null)
            return false;
        else if (Math.abs(height(node.left) - height(node.right)) > 1)
            return false;
        else
            return true;
    }
    // public boolean isComplete(TreeNode<T> node){

    // }
    int findADepth(TreeNode<T> node) {
        int d = 0;
        while (node != null) {
            d++;
            node = node.left;
        }
        return d;
    }

    boolean isPerfectRec(TreeNode<T> root, int d, int level) {
        if (root == null)
            return true;

        if (root.left == null && root.right == null)
            return (d == level + 1);

        if (root.left == null || root.right == null)
            return false;

        int dl = findADepth(root.left);
        int dr = findADepth(root.right);
        return isPerfectRec(root.left, dl, level + 1) && isPerfectRec(root.right, dr, level + 1);
    }

    public void isPerfect() {
        int d = findADepth(root);
        System.out.println("Your tree perfect?: " + isPerfectRec(root, d, 0));
    }

    TreeNode<T> deleT(T key, TreeNode<T> node) {
        if (node == null)
            return node;
        if (key.compareTo(node.key) < 0)
            node.left = deleT(key, node.left);
        else if (key.compareTo(node.key) > 0)
            node.right = deleT(key, node.right);
        else {
            if (node.left == null && node.right == null)
                node = null;
            else if (node.left == null)
                node = node.right;
            else if (node.right == null)
                node = node.left;
            else {
                TreeNode<T> successor = findMin(node.right);
                node.key = successor.key;
                node.right = deleT(successor.key, node.right);
            }
        }
        return node;

    }

    void delete(T key) {
        root = deleT(key, root);
    }
    // public isFull(TreeNode<T> node,int level){
    //     if(isPerfect)

    // }

    public static void main(String args[]) throws IOException {
        // binarySearchTree<Character> tree = new binarySearchTree<Character>();
        binarySearchTree<Integer> tree = new binarySearchTree<Integer>();
        // BufferedReader read=new BufferedReader(new FileReader("input.txt"));
        int[] arr = new int[34];
        key Age = new key();

        tree.insertion(200);
        tree.insertion(100);
        tree.insertion(80);
        tree.insertion(88);
        tree.insertion(50);
        tree.insertion(195);
        tree.insertion(300);
        tree.insertion(250);
        tree.insertion(230);
        tree.insertion(350);
        tree.insertion(260);
        tree.insertion(395);
        tree.insertion(400);
        tree.insertion(190);
        tree.insertion(198);
        // tree.insertion(8);
        // tree.insertion(7);
        // tree.insertion(9);
        // tree.insertion(14);
        // tree.insertion(16);
        // tree.insertion(13);

        // tree.insertion('a');
        // tree.insertion('c');
        // tree.insertion('d');
        // tree.insertion('e');
        // tree.insertion(1);
        tree.printPost();
        tree.printPre();
        tree.printIN();
        // tree.search('e');
        tree.delete(8);
        tree.lSkeewed();
        tree.rSkeewed();
        tree.isBalanced();
        // tree.isPerfect();
        // writer.close();
        // tree.printIN();

    }

}

class key {
    String name;
    int roll;
    Integer age;
    Object key;
}

class TreeNode<T> {
    T data;
    T key;
    String name;
    int roll;
    Integer age;
    TreeNode<T> left;
    TreeNode<T> right;

    TreeNode(T key) {
        this.left = null;
        this.right = null;
        this.key = key;
    }
}
// public class binarySearchTree {
// TreeNode<T> root;

// public void insertion(int key) {
// if (root == null) {
// root = new TreeNode<T>(key);
// } else
// add(key, root);
// }

// public void add(int key, TreeNode<T> node) {
// if (key < node.key) {
// if (node.left != null)
// add(key, node.left);
// else
// node.left = new TreeNode<T>(key);

// } else {
// if (node.right != null) {
// add(key, node.right);
// } else
// node.right = new TreeNode<T>(key);
// }

// }

// public void printIN() throws IOException {
// inorder(root);

// System.out.println();
// }

// public void printPre() throws IOException {
// preorder(root);
// System.out.println();
// }

// public void printPost() throws IOException {
// postorder(root);
// System.out.println();
// }

// public void inorder(TreeNode<T> node) throws IOException {
// if (node.left != null) {
// inorder(node.left);
// }
// System.out.print(node.key + " ");
// if (node.right != null) {
// inorder(node.right);
// }
// }

// public void postorder(TreeNode<T> node) throws IOException {
// if (node.left != null) {
// inorder(node.left);
// }

// if (node.right != null) {
// inorder(node.right);
// }
// System.out.print(node.key + " ");
// }

// public void preorder(TreeNode<T> node) throws IOException {
// System.out.print(node.key + " ");
// if (node.left != null) {
// inorder(node.left);
// }
// if (node.right != null) {
// inorder(node.right);
// }
// }

// public boolean searcH(int target, TreeNode<T> node) {
// boolean ans;
// if (node == null) {
// ans = false;
// } else if (node.key == target) {
// ans = true;
// } else if (target < node.key) {
// ans = searcH(target, node.left);
// } else {
// ans = searcH(target, node.right);
// }
// return ans;
// }

// public void search(int key) {
// boolean ans = searcH(key, root);
// System.out.println(ans);

// }

// TreeNode<T> findMin(TreeNode<T> node) {
// while (node.left != null)
// node = node.left;
// return node;
// }

// TreeNode<T> deleT(int key, TreeNode<T> node) {
// if (node == null)
// return node;
// if (key < node.key)
// node.left = deleT(key, node.left);
// else if (key > node.key)
// node.right = deleT(key, node.right);
// else {
// if (node.left == null && node.right == null)
// node = null;
// else if (node.left == null)
// node = node.right;
// else if (node.right == null)
// node = node.left;
// else {
// TreeNode<T> successor = findMin(node.right);
// node.key = successor.key;
// node.right = deleT(successor.key, node.right);
// }
// }
// return node;

// }

// void delete(int key) {
// root = deleT(key, root);
// }

// public static void main(String args[]) throws IOException {
// binarySearchTree tree = new binarySearchTree();
// tree.insertion(-10);
// tree.insertion(-3);
// tree.insertion(0);
// tree.insertion(5);
// tree.insertion(9);
// // tree.insertion(1);
// tree.printPost();
// // tree.printPre();
// tree.printIN();
// tree.search(13);
// // tree.delete(8);
// // tree.printIN();

// }

// }

// class key{
// String name;
// int roll;
// Integer age;
// Object key;
// }
// class TreeNode<T> {
// key data;
// int key;
// TreeNode<T> left;
// TreeNode<T> right;

// TreeNode<T>(int key) {
// this.left = null;
// this.right = null;
// this.key = key;
// }
// }

// public class BST {
// TreeNode<T><Integer> root;
// public void insertion(int key){
// if(root==null)
// {
// root=new TreeNode<T>(key);
// }
// else
// add(key,root);

// }
// public void add(int key,TreeNode<T><Integer> node){
// if(key<node.key){
// if(node.left!=null)
// add(key,node.left);
// else
// node.left=new TreeNode<T>(key);

// }
// else{
// if(node.right!=null){
// add(key,node.right);
// }
// else
// node.right=new TreeNode<T>(key);
// }

// }
// public void print(){
// inorder(root);
// }
// public void inorder(TreeNode<T> node){
// if(node.left!=null){
// inorder(node.left);
// return;
// }
// System.out.println(node.key);
// if(node.right!=null){
// inorder(node.right);
// return;
// }
// }
// public static void main(String args[]){
// BST tree=new BST();
// tree.insertion(123);
// tree.insertion(123);
// tree.print();

// }

// }
// class TreeNode<T><T>{
// T key;
// TreeNode<T><T> left;
// TreeNode<T><T> right;
// TreeNode<T>(T key){
// this.left=null;
// this.right=null;
// this.key=key;
// }
// }