class ExpNode {
    String value;
    ExpNode left, right;
    ExpNode(String val) { this.value = val; }
}

public class ExpressionTree {
    public void printPostfix(ExpNode node) {
        if (node == null) return;
        printPostfix(node.left);
        printPostfix(node.right);
        System.out.print(node.value + " ");
    }
}