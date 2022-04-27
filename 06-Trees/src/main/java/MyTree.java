import java.util.LinkedList;
import java.util.Queue;

public class MyTree {
    public Node root;

    public MyTree() {
    }

    public MyTree(Node root) {
        this.root = root;
    }
    public void insert(int value){
        Node newNode=new Node(value);
        if(root==null) {
            root=newNode;
            return;
        }
        Node current=root;
        while(true){
            if(value<=current.value) {
                if (current.leftChild==null) {
                    current.leftChild=newNode;
                    break;
                }
                current=current.leftChild;
            }
            else  {
                if (current.rightChild==null) {
                    current.rightChild=newNode;
                    break;
                }
                current=current.rightChild;
            }

        }
    }// end insert

    // PreOrder Traversal of Tree  Root-Left-Right

    public void preOrderTraversal(Node root){
        if (root==null) return;
        System.out.print(root.value+", ");
        preOrderTraversal(root.leftChild);
        preOrderTraversal(root.rightChild);
    }
    // In-Order Traversal of Tree  Root-Left-Right
    public void inOrderTraversal(Node root){
        if (root==null) return;
        inOrderTraversal(root.leftChild);
        System.out.print(root.value+", ");
        inOrderTraversal(root.rightChild);
    }

    // Post-Order traversal  left-right-root
    public void postOrderTraversal(Node root){
        if (root==null) return;
        postOrderTraversal(root.leftChild);
        postOrderTraversal(root.rightChild);
        System.out.print(root.value+", ");
    }// end post order traversal


    public void levelOrderTraversal() {
        if(root==null) return;
        Queue<Node> queue = new LinkedList<>();
        queue.add(root);
        while (!queue.isEmpty()) {
            Node toVisit = queue.poll();
            System.out.print(toVisit.value + ", ");
            if(toVisit.leftChild!=null) queue.add(toVisit.leftChild);
            if(toVisit.rightChild!=null) queue.add(toVisit.rightChild);
        }//end while loop
    } // end levelOrder


    // Task 1: searching Binary tree and return boolean
    public boolean containsMethod(int value) {
        if(root==null) return false;
        Node current = root;
        while (current!=null){
            if(value<current.value) current=current.leftChild;
            else if(value> current.value) current=current.rightChild;
            else return true;
        }//end of while loop
        return false;
    }

    // Task 2: return if the node is a leaf
    public boolean isLeaf(Node node) {
        return node.leftChild==null && node.rightChild==null;
        }

    // Task 3: implement a method that prints leaves
    void printLeaves(Node root) {
        if (root==null) return;
        if (isLeaf(root)) System.out.print(root.value+", ");
        printLeaves(root.leftChild);
        printLeaves(root.rightChild);
    }

    // Task 4: implement a method that counts the leaves of BTS
    public int countLeaves(Node root) {
        if (root==null) return 0;
        if (isLeaf(root)) return 1;
        return countLeaves(root.leftChild) + countLeaves(root.rightChild);
      }

    public int findSumOfLeavesR(Node root) {
        if (root==null) return 0;
        if (isLeaf(root)) return root.value;
        return findSumOfLeavesR(root.leftChild) + findSumOfLeavesR(root.rightChild);
    }

    public int height(Node root) {
        if (root==null) return -1;
        if (isLeaf(root)) return 0;
        return 1 + Math.max(height(root.leftChild), height(root.rightChild));
    }

}
