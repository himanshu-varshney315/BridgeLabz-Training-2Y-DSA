class OrgNode {
    String role;
    OrgNode left, right;

    OrgNode(String role) {
        this.role = role;
    }
}

public class OrgChartSolution {
    public void printLeafNodes(OrgNode node) {
        if (node == null) return;
        if (node.left == null && node.right == null) {
            System.out.println("Leaf Node: " + node.role);
            return;
        }
        printLeafNodes(node.left);
        printLeafNodes(node.right);
    }
    public int getHeight(OrgNode node) {
        if (node == null) return -1; // Height of leaf is 0, so null is -1 [cite: 23]
        return 1 + Math.max(getHeight(node.left), getHeight(getHeight(node.right)));
    }
}