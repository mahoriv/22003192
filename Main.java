class Node {
    int data;
    Node left;
    Node right;

}
class search {
    public Node createNewNode(int t){
        Node v = new Node();
        v.data = t;
        v.left = null;
        v.right = null;
        return v;
    }
    public Node insert (Node node, int val){
        if(node == null){
            return createNewNode(val);

        }
        if(val<=node.data){
            node.left = insert(node.left,val);
        }else if (val> node.data){
            node.right = insert(node.right,val);

        }
        return node;
    }
}
public class comFinal {
    public static void main(String[] args) {
        tree v = new tree();
        Node root = null;
        // i enter root value
        root = v.insert(root,104);// 104,105,106,107,101,102,103
        root = v.insert(root,105);
        root = v.insert(root,106);
        root = v.insert(root,107);
        root = v.insert(root,101);
        root = v.insert(root,102);
        root = v.insert(root,103)
        ;
    }
}