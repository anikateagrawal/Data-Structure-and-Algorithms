package binary_tree;

class Node
{
    int data;
    Node left;
    Node right;
    int height;
    int balance;
    public Node(int data)
    {
        this.data = data;
    }
}
public class AvlDemo {

    public static Node rightrotation(Node A)
    {
        Node B = A.left;
        Node Bright = B.right;
        B.right = A;
        A.left = Bright;
        updateheightandbalance(A);
        updateheightandbalance(B);
        return B;
    }
    public static Node leftrotation(Node A)
    {
        Node B = A.right;
        Node Bleft = B.left;
        B.left = A;
        A.right = Bleft;
        updateheightandbalance(A);
        updateheightandbalance(B);
        return B;
    }
    public static Node getrotation(Node node)
    {
        updateheightandbalance(node);
        if(node.balance ==2 )
        {
            if(node.left.balance == 1)
            {
                return rightrotation(node);
            }
            else
            {
                node.left = leftrotation(node.left);
                return rightrotation(node);
            }
        }
        else if (node.balance== -2)
        {
            if(node.right.balance==-1)
            {
                return leftrotation(node);
            }
            else
            {
                node.right = rightrotation(node.right);
                return leftrotation(node);
            }
        }
        return node;
    }
    public static void updateheightandbalance(Node troot)
    {
        int lh = -1;
        int rh = -1;
        if (troot.left != null)
            lh = troot.left.height;
        if(troot.right !=null)
            rh = troot.right.height;
        troot.balance =lh-rh;
        troot.height = Math.max(lh,rh)+1;
    }
    public static void display(Node node)
    {
        if(node== null)
        {
            return;
        }
        String str ="";
        str += node.left!= null?node.left.data+" " : ".";
        str+="< -"+ node.data+"->";
        str+=  node.right!= null?node.right.data+" " : ".";
        System.out.println(str);
        display(node.left);
        display(node.right);
    }
    public static Node insert(Node root, Node newnode) {
        if (root == null) {
            root = newnode;
            return root;
        } else if (newnode.data < root.data) {
            if (root.left == null) {
                root.left = newnode;
            } else {
                root.left=insert(root.left, newnode);

            }
        } else if (newnode.data > root.data) {
            if (root.right == null) {
                root.right = newnode;
            } else {
                root.right= insert(root.right, newnode);

            }
        }
        root= getrotation(root);
        return root;
    }
    public static void main(String[] args) {
        Node n1 = new Node(30);

        Node n2 = new Node(20);

        Node n3 = new Node(10);

        insert(null, n1);
        Node root = insert(n1, n2);
        root = insert(root,new Node(25));
        root= insert(root, n3);
        root = insert(root,new Node(11));
        root= insert(root,new Node(5));
        System.out.println("display data");
        display(root);

    }
}