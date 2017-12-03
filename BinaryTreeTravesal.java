public class Binarytree {
Node root;
void preorder(Node node)
{
   if(node==null)
   {
       return;
   }
   
    System.out.print(node.data+" ");
    preorder(node.left);
    preorder(node.right);
}

void inorder(Node node)
{
    if(node==null)
    {
        return;
    }
    
    inorder(node.left);
    System.out.print(node.data+" ");
    inorder(node.right);
}

void postorder(Node node)
{
    if(node==null)
            {
             return;   
            }
    
    postorder(node.left);
    postorder(node.right);
    System.out.print(node.data+" ");
}
    
    public static void main(String[] args) 
    {
    Binarytree t=new Binarytree();
    t.root=new Node(1);
    t.root.left=new Node(2);
    t.root.right=new Node(3);
    
    t.root.left.left=new Node(4);
    t.root.left.right=new Node(5);
    
    t.root.right.left=new Node(6);
    
    t.root.left.left.left=new Node(7);
    t.root.left.left.right=new Node(8);
    
    
    //pre oder travesal
    t.preorder(t.root);
        System.out.println();
    //indorder travesal
    t.inorder(t.root);
        System.out.println();
        
        //postorder travesal
        t.postorder(t.root);
    
    }
}
