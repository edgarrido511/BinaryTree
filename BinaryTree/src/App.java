
public class App {
    public static void main(String[] args) throws Exception {
    	
    	BinaryTree tree = new BinaryTree();
    	
    	
 
        Node a = new Node (1);
        Node b = new Node (2);
        Node c = new Node (3);
        Node d = new Node (4);
        Node e = new Node (5);
        Node f = new Node (6);
        Node g = new Node (7);
        Node h = new Node (8);
        Node i = new Node (9);
        Node j = new Node (10);
 
        
 
        a.left = b;
        a.right = c;
        b.left = d;
        b.right = e;
        c.right = g;
        c.left = f;
        d.left = h;
        d.right = i;
        e.left = j;
        
        
        
        tree.recorrer(a);        
        
 
 
        //         a
        //       /   \
        //      b     c
        //     /  \    \
        //    d    e     f       
 
 
    }
}