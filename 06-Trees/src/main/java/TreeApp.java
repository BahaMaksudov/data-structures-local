public class TreeApp {
    public static void main(String[] args) {

        MyTree tree = new MyTree();
        int[] numbers=new int[] {10, 5, 12, 3, 6, 11, 13, 2};
        for (int i=0; i<8; i++) {
            tree.insert(numbers[i]);
        }

        VisualizeTree.printTree(tree.root, null,false);

//        System.out.println("Pre-Order Traversal");
//        tree.preOrderTraversal(tree.root);
//        System.out.println();
//        System.out.println("In-Order Traversal");
//        tree.inOrderTraversal(tree.root);
//        System.out.println();
//        System.out.println("Post-Order Traversal");
//        tree.postOrderTraversal(tree.root);
        System.out.println("Breadth First Traversal");
        tree.levelOrderTraversal();

        System.out.println();
        System.out.println("Tree contains 6: "+tree.containsMethod(6));

        System.out.println();
        System.out.println("Print Leaves of the Tree");
        tree.printLeaves(tree.root);

        System.out.println();
        System.out.println("The number of leaves in a Tree: " + tree.countLeaves(tree.root));

        System.out.println();
        System.out.println("The SUM of leaves value: " + tree.findSumOfLeavesR(tree.root));

        System.out.println();
        System.out.println("The Height of the Tree of the root: " + tree.height(tree.root));

        System.out.println();
        System.out.println("The Height of the Left Child: " + tree.height(tree.root.leftChild));



    }
}
