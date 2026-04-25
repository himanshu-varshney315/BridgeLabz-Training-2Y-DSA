class FileNode {
    String name;
    FileNode left, right;
    FileNode(String name) { this.name = name; }
}

public class FileSystemSolution {
    public void postorderTraversal(FileNode node) {
        if (node == null) return;
        postorderTraversal(node.left);
        postorderTraversal(node.right);
        System.out.print(node.name + " ");
    }

    public void preorderTraversal(FileNode node) {
        if (node == null) return;
        System.out.print(node.name + " "); // [cite: 86]
        preorderTraversal(node.left);
        preorderTraversal(node.right);
    }
}