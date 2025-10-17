package DSA;

public class FirstLeftChild {

    // Tree node class
    static class TreeNode {
        int data;
        TreeNode left;
        TreeNode right;

        TreeNode(int data) {
            this.data = data;
            left = null;
            right = null;
        }
    }

    /**
     * Example 1 Tree:
     *          1
     *        /   \
     *       2     3
     *      / \   / \
     *     4   5 6   7
     *    / \
     *   8   9
     *
     * The first left leaf in this tree is 8.
     */
    public static TreeNode createSampleTreeExample1() {
        TreeNode root = new TreeNode(1);

        root.left = new TreeNode(2);
        root.right = new TreeNode(3);

        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);
        root.right.left = new TreeNode(6);
        root.right.right = new TreeNode(7);

        root.left.left.left = new TreeNode(8);
        root.left.left.right = new TreeNode(9);

        return root;
    }

    /**
     * Example 2 Tree:
     *             30
     *           /    \
     *         20      40
     *        /  \    /  \
     *      15   25  35  50
     *     / \
     *    5  18
     *        \
     *        60
     *
     * The first left leaf in this tree is 5.
     */
    public static TreeNode createSampleTreeExample2() {
        TreeNode root = new TreeNode(30);

        root.left = new TreeNode(20);
        root.right = new TreeNode(40);

        root.left.left = new TreeNode(15);
        root.left.right = new TreeNode(25);
        root.right.left = new TreeNode(35);
        root.right.right = new TreeNode(50);

        root.left.left.left = new TreeNode(5);
        root.left.left.right = new TreeNode(18);
        root.left.left.right.right = new TreeNode(60);

        return root;
    }

    /**
     * Recursively finds the first node that is:
     * 1) A leaf (no children).
     * 2) A left child of its parent.
     *
     * @param node   the current node in the traversal
     * @param isLeft whether this node is the left child of its parent
     * @return the first left leaf node if found, else null
     */
    public static TreeNode findFirstLeftLeaf(TreeNode node, boolean isLeft) {
        if (node == null) {
            return null;
        }
        // Check if it's a leaf and also a left child
        if (node.left == null && node.right == null && isLeft) {
            return node;
        }
        // Traverse left subtree first
        TreeNode leftResult = findFirstLeftLeaf(node.left, true);
        if (leftResult != null) {
            return leftResult;
        }
        // Then traverse right subtree
        return findFirstLeftLeaf(node.right, false);
    }

    public static void main(String[] args) {
        // Example 1
        TreeNode root1 = createSampleTreeExample1();
        TreeNode firstLeftLeaf1 = findFirstLeftLeaf(root1, false);
        System.out.println("Example 1 output: " +
                (firstLeftLeaf1 != null ? firstLeftLeaf1.data : "No left leaf"));

        // Example 2
        TreeNode root2 = createSampleTreeExample2();
        TreeNode firstLeftLeaf2 = findFirstLeftLeaf(root2, false);
        System.out.println("Example 2 output: " +
                (firstLeftLeaf2 != null ? firstLeftLeaf2.data : "No left leaf"));
    }
}