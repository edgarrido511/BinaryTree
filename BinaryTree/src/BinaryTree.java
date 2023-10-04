import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;



public class BinaryTree {
    Stack<Node> stack = new Stack<>();

    public void recorrer(Node root) {
    if (root == null) {
        return;
    }

    Queue<Node> nodes = new LinkedList<>();
    nodes.add(root);

    while (!nodes.isEmpty()) {

        Node node = nodes.remove();

        System.out.print(" " + node.value);

        if (node.left != null) {
            nodes.add(node.left);
        }

        if (node.right != null) {
            nodes.add(node.right);
        }
    }
}

}