class BSTNode {
    int isbn;
    BSTNode left, right;
    BSTNode(int val) { this.isbn = val; }
}

public class LibraryBST {
    public BSTNode insert(BSTNode root, int isbn) {
        if (root == null) return new BSTNode(isbn);
        if (isbn < root.isbn) root.left = insert(root.left, isbn);
        else if (isbn > root.isbn) root.right = insert(root.right, isbn);
        return root;
    }
    public boolean isValidBST(BSTNode node, Integer min, Integer max) {
        if (node == null) return true;
        if ((min != null && node.isbn <= min) || (max != null && node.isbn >= max)) return false;
        return isValidBST(node.left, min, node.isbn) && isValidBST(node.right, node.isbn, max);
    }
}