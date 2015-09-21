package treedriver3;

import java.lang.*;
import java.io.*;
import java.util.Objects;

class Tree implements Serializable {

    private Node root;
    boolean addReturn;
    Integer deleteReturn;

    boolean add(Integer target) {
        root = add(root, target);
        return addReturn;
    }

    Node add(Node localRoot, Integer item) {
        if (localRoot == null) {
            addReturn = true;
            return new Node(item);
        } else if (item.compareTo(localRoot.item) == 0) {
            addReturn = false;
            return localRoot;
        } else if (item.compareTo(localRoot.item) < 0) {
            localRoot.left = add(localRoot.left, item);
            return localRoot;
        } else {
            localRoot.right = add(localRoot.right, item);
            return localRoot;
        }
    }

    Integer remove(Integer target) {
        root = remove(root, target);
        return deleteReturn;
    }

    Node remove(Node localRoot, Integer item) {
        if (localRoot == null) {
            deleteReturn = null;
            return localRoot;
        }
        int compResult = item.compareTo(localRoot.item);
        if (compResult < 0) {
            localRoot.left = remove(localRoot.left, item);
            return localRoot;
        } else if (compResult > 0) {
            localRoot.right = remove(localRoot.right, item);
            return localRoot;
        } else {
            deleteReturn = localRoot.item;
            if (localRoot.left == null) {
                return localRoot.right;
            } else if (localRoot.right == null) {
                return localRoot.left;
            } else {
                if (localRoot.left.right == null) {
                    localRoot.item = localRoot.left.item;
                    localRoot.left = localRoot.left.left;
                    return localRoot;
                } else {
                    localRoot.item = findLargestChild(localRoot.left);
                    return localRoot;
                }
            }
        }
    }

    Integer findLargestChild(Node parent) {
        if (parent.right.right == null) {
            Integer returnValue = parent.right.item;
            parent.right = parent.right.left;
            return returnValue;
        } else {
            return findLargestChild(parent.right);
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
        if (target == null) {
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

public class TreeDriver3 {

    public static void main(String[] args) {
        Tree tree0;

        tree0 = new Tree();
        for (int i = 0; i < args.length; i++) {
            System.out.println(tree0.add(Integer.parseInt(args[i])
            ));
            System.out.println();
        }
        tree0.traverse(0);
        System.out.println();
        for (int i = 0; i < args.length; i = i + 2) {
            System.out.println();
            System.out.print("Removing " + Integer.parseInt(args[i]) + ": ");
            System.out.println(tree0.remove(Integer.parseInt(args[i])
            ));
            System.out.println();
            tree0.traverse(0);
            System.out.println();
        }
        //System.out.println();
        for (int i = 0; i < args.length; i++) {
            System.out.println();
            System.out.print("Removing " + Integer.parseInt(args[i]) + ": ");
            System.out.println(tree0.remove(Integer.parseInt(args[i])
            ));
            System.out.println();
            tree0.traverse(0);
            System.out.println();
        }
    }
}
