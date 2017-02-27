package base;

/**
 * Created by Dave on 2/26/2017.
 */
public class BinaryTree {

    Nodes root;

    public void addNode(int key, String name) {

        Nodes newNode = new Nodes(key, name);

        if(root == null) {

            root = newNode;
        } else {
            Nodes focusNode = root;
            Nodes parent;

            while(true) {
                parent = focusNode;
                if(key <  focusNode.key) {
                    focusNode = focusNode.leftChild;
                    if (focusNode == null) {
                        parent.leftChild = newNode;
                        return;
                    }
                } else {
                    focusNode = focusNode.rightChild;
                    if(focusNode == null) {
                        parent.rightChild = newNode;
                        return;
                    }
                }
            }
        }
    }

    //Travels through the order of the key, increasing as it goes.
    public void inOrderTraverseTree(Nodes focusNode) {
        if(focusNode != null) {
            inOrderTraverseTree(focusNode.leftChild);
            System.out.println(focusNode);
            inOrderTraverseTree(focusNode.rightChild);
        }
    }

    //Travles through the left side the the right side of the tree
    public void inPreOrderTraverseTree(Nodes focusNode) {
        if (focusNode != null) {
            System.out.println(focusNode);
            inOrderTraverseTree(focusNode.leftChild);
            inOrderTraverseTree(focusNode.rightChild);
        }
    }

    public void postOrderTraverseTree(Nodes focusNode) {
        if (focusNode != null) {
            inOrderTraverseTree(focusNode.leftChild);
            inOrderTraverseTree(focusNode.rightChild);
            System.out.println(focusNode);
        }
    }


    public Nodes findNode(int key) {

        Nodes focusNode = root;

        while(focusNode.key != key) {

            if(key < focusNode.key) {
                focusNode = focusNode.leftChild;
            } else {
                focusNode = focusNode.rightChild;
            }

            if(focusNode == null) {
                return null;
            }
        }

        return focusNode;
    }

    public static void main(String[] args) {

        BinaryTree theTree = new BinaryTree();

        theTree.addNode(50, "Boss");
        theTree.addNode(25, "Vice Pres");
        theTree.addNode(15, "Office manager");
        theTree.addNode(30, "Secretary");
        theTree.addNode(75, "Sales Manager");
        theTree.addNode(85, "Salesman 1");

        //theTree.inOrderTraverseTree(theTree.root);
        //theTree.inPreOrderTraverseTree(theTree.root);
        theTree.postOrderTraverseTree(theTree.root);

        System.out.println("Search for 30");

        System.out.println(theTree.findNode(30));

    }
}

class Nodes {

    int key;
    String name;

    Nodes leftChild;
    Nodes rightChild;

    public Nodes(int key, String name) {
        this.key = key;
        this.name = name;
    }

    public String toString() {

        return name + " has a key " + key;
    }
}
