
class Node {
    int data;
    Node left, right;

    Node(int data) {
        this.data = data;
        this.left = null;
        this.right = null;
    }
}

class BST {
    Node root;

    BST() {
        root = null;
    }


    void insert(int data) {
        root = insert(root, data);
    }

    private Node insert(Node node, int data) {
        if (node == null) {
            return new Node(data);
        }
        if (data < node.data) {
            node.left = insert(node.left, data);
        } else if (data > node.data) {
            node.right = insert(node.right, data);
        }
        return node;
    }


    Node findMin(Node node) {
        if (node == null) return null;
        while (node.left != null) {
            node = node.left;
        }
        return node;
    }


    Node findMax(Node node) {
        if (node == null) return null;
        while (node.right != null) {
            node = node.right;
        }
        return node;
    }


    boolean search(int data) {
        return search(root, data);
    }

    private boolean search(Node node, int data) {
        if (node == null) return false;
        if (data == node.data) return true;
        if (data < node.data) return search(node.left, data);
        return search(node.right, data);
    }


    Node findParent(int data) {
        Node current = root;
        Node parent = null;

        while (current != null && current.data != data) {
            parent = current;
            if (data < current.data) {
                current = current.left;
            } else {
                current = current.right;
            }
        }
        return (current != null) ? parent : null;
    }

 
    void delNode(int data) {
        root = delNode(root, data);
    }

    private Node delNode(Node node, int data) {
        if (node == null) {
            return null;
        }

        if (data < node.data) {
            node.left = delNode(node.left, data);
        } else if (data > node.data) {
            node.right = delNode(node.right, data);
        } else {
           
            if (node.left == null) {
                return node.right;
            } else if (node.right == null) {
                return node.left;
            }

         
            Node maxNode = findMax(node.left);
            node.data = maxNode.data;
            node.left = delNode(node.left, maxNode.data);
        }
        return node;
    }

  
    void printTree(Node node, int level) {
        if (node == null) return;

        printTree(node.right, level + 1);

        for (int i = 0; i < level; i++) {
            System.out.print("    ");
        }
        System.out.println(node.data);

        printTree(node.left, level + 1);
    }
}


public class BSTApp1 {
    public static void main(String[] args) {
        BST tree = new BST();

        
        int[] data = {20, 60, 65, 30, 40, 10, 11, 7, 3};
        for (int d : data) {
            tree.insert(d);
        }

       
        tree.printTree(tree.root, 0);
        System.out.println();

        System.out.println("Minimum Node is " + tree.findMin(tree.root).data);
        System.out.println("Maximum Node is " + tree.findMax(tree.root).data);
        System.out.println("Is 15 in BST => " + tree.search(15));

        Node parent = tree.findParent(60);
        System.out.println("Parent is " + (parent != null ? parent.data : "null"));

        System.out.println("Delete Node is 60");
        tree.delNode(60);

        tree.printTree(tree.root, 0);
    }
}
