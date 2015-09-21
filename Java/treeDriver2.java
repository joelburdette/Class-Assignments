import java.lang.*;
import java.io.*;
import java.util.Objects;

class Tree implements Serializable {
    private Node root;
    boolean addReturn;

    boolean add(Integer item) {
        root = add(root, item);
        return addReturn;
    }

    Node add(Node localRoot, Integer item){
        if (localRoot == null) {
            addReturn = true;
            return new Node(item);
        } else if (item.compareTo(localRoot.item) == 0 ) {
            addReturn = false;
            return localRoot;
        } else if (item.compareTo(localRoot.item) < 0 ) {
            localRoot.left = add(localRoot.left, item);
            return localRoot;
        }  else {
            localRoot.right = add(localRoot.right, item);
            return localRoot;
        }
    }
    void inorder_traverse(Node node) {
        if (node != null) {
            inorder_traverse(node.left);
            System.out.print(node.item + " ");
            inorder_traverse(node.right);
        }
    }

    void preorder_traverse(Node node) {
        if (node != null) {
            System.out.print(node.item + " ");
            preorder_traverse(node.left);
            preorder_traverse(node.right);
        }
    }

    void postorder_traverse(Node node) {
        if (node != null) {
            postorder_traverse(node.left);
            postorder_traverse(node.right);
            System.out.print(node.item + " ");
        }
    }

    boolean contain(Integer target) {
        return search(root, target);
    }

    boolean search(Node node, Integer target) {
        if(target == null){
            return false;
        }
        if (Objects.equals(node.item, target)) {
            return true;
        } else if (node.item > target) {
            return search(node.left, target);
        } else if (node.item < target) {
            return search(node.right, target);
        } else {
        return false;
        }
    }

    void traverse(int mode) {
        Node node = root;
        if (mode == 0) {
            inorder_traverse(node);
        } else if (mode == 1) {
            preorder_traverse(node);
        } else if (mode == 2) {
            postorder_traverse(node);
        }

    }

    class Node implements Serializable {

        Integer item;
        Node next, left, right;

        Node(Integer item) {
            next = null;
            left = null;
            right = null;
            this.item = item;
        }
    }
}

public class TreeDriver2 {

    public static void main(String[] args) {
        Tree tree0;

        tree0 = new Tree();
        System.out.println("in-order: ");
        //tree0.traverse(0);
        System.out.println("pre-order: ");
        //tree0.traverse(1);
        System.out.println("post-order: ");
        //tree0.traverse(2);
        System.out.println(tree0.add(40));
        System.out.println(tree0.add(10));
        System.out.println(tree0.add(50));
        System.out.println(tree0.add(45));
        System.out.println(tree0.add(55));
        System.out.println(tree0.add(5));
        System.out.println(tree0.add(25));
        System.out.println(tree0.add(15));
        System.out.println(tree0.add(45));
        System.out.println(tree0.add(5));
        System.out.println(tree0.add(20));
        System.out.println(tree0.add(35));
        System.out.println(tree0.add(10));
        System.out.println(tree0.add(30));
        System.out.print("in-order: ");
        tree0.traverse(0);
        System.out.println();
        System.out.print("pre-order: ");
        
        tree0.traverse(1);
        System.out.println();
        System.out.print("post-order: ");
        
        tree0.traverse(2);
        System.out.println();
        Integer target = 45;
        //Node target = new Node(tar);
        //Integer.parseInt(args[args.length - 1]);
        System.out.println("Search for " + target);
        System.out.println(tree0.contain(target));
        //second part
        System.out.println();
        tree0 = new Tree();
        System.out.println("in-order: ");
        //tree0.traverse(0);
        System.out.println("pre-order: ");
        //tree0.traverse(1);
        System.out.println("post-order: ");
        //tree0.traverse(2);
        System.out.println(tree0.add(40));
        System.out.println(tree0.add(10));
        System.out.println(tree0.add(50));
        System.out.println(tree0.add(45));
        System.out.println(tree0.add(55));
        System.out.println(tree0.add(5));
        System.out.println(tree0.add(25));
        System.out.println(tree0.add(15));
        System.out.println(tree0.add(45));
        System.out.println(tree0.add(5));
        System.out.println(tree0.add(20));
        System.out.println(tree0.add(35));
        System.out.println(tree0.add(10));
        System.out.println(tree0.add(30));
        System.out.print("in-order: ");
        tree0.traverse(0);
        System.out.println();
        System.out.print("pre-order: ");
        
        tree0.traverse(1);
        System.out.println();
        System.out.print("post-order: ");
        
        tree0.traverse(2);
        System.out.println();
        
        target = null;
        System.out.println("Search for 19");
        System.out.println(tree0.contain(target));
    }
}
