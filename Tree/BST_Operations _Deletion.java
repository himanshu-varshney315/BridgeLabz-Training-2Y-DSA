public class AttendanceBST {
    public BSTNode deleteNode(BSTNode root, int key) {
        if (root == null) return null;
        if (key < root.isbn) root.left = deleteNode(root.left, key);
        else if (key > root.isbn) root.right = deleteNode(root.right, key);
        else {
            if (root.left == null) return root.right;
            else if (root.right == null) return root.left;
            root.isbn = minValue(root.right);
            root.right = deleteNode(root.right, root.isbn);
        }
        return root;
    }

    private int minValue(BSTNode root) {
        int minv = root.isbn;
        while (root.left != null) {
            minv = root.left.isbn;
            root = root.left;
        }
        return minv;
    }
}