import java.lang.*;
import java.io.*;

class Node implements Serializable {

    Integer item;
    Node left, right;

    Node(Integer item) {
        //next = null;
        this.item = item;
    }
}

class Tree implements Serializable {

    Node root;

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

    void traverse(int mode) {
        if (mode == 0) {
            inorder_traverse(root);
        } else if (mode == 1) {
            preorder_traverse(root);
        } else {
            postorder_traverse(root);
        }
    }
}

public class TreeDriver {

    public static void main(String[] args) {
        Tree tree0;

        tree0 = new Tree();
        System.out.println("in-order: ");
        tree0.traverse(0);
        System.out.println();
        System.out.println("pre-order: ");
        tree0.traverse(1);
        System.out.println();
        System.out.println("post-order: ");
        tree0.traverse(2);
        System.out.println();
        try {
            ObjectInputStream stream0 = new ObjectInputStream(new FileInputStream("tree0"));
            tree0 = (Tree) stream0.readObject();
            System.out.println("in-order: ");
            tree0.traverse(0);
            System.out.println();
            System.out.println("pre-order: ");
            tree0.traverse(1);
            System.out.println();
            System.out.println("post-order: ");
            tree0.traverse(2);
            stream0.close();
        } catch (Exception e) {
            System.out.println(e);
            System.exit(1);
        }
        return;
    }
}
