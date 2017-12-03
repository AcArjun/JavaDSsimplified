?*    intial tree
   
                 8
                 
        5                  10
        
   2         6         9
   
1


intial preorder travesal:  8 5 2 1 6 10 9

cases 1:insert node 15
                 8
                 
        5                  10
        
   2         6         9         15
   
1
   
 after insertion preorder travesal:  8 5 2 1 6 10 9 15
 
 case 2:insert node 7
 
                  8
                 
        5                  10
        
   2         6         9         15
   
1               7
   
after insertion preorder travesal:  8 5 2 1 6 7 10 9
*/



import java.util.Scanner;

public class bstInset {
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
    
    
    void insert(Node node,Node v)
    {
       
        
        if(node.data<v.data)
        {
            if(node.right==null)
            {
                node.right=v;
                return;
            }
            insert(node.right,v);
            
        }
        if(node.data>v.data)
        {
            if(node.left==null)
            {
                node.left=v;
                return;
            }
            insert(node.left,v);
        }
         
    }
    public static void main(String[] args)
    {
    bstInset t=new bstInset();
    t.root=new Node(8);
    t.root.left=new Node(5);
    t.root.right=new Node(10);
    
    t.root.left.left=new Node(2);
    t.root.left.right=new Node(6);
    
    t.root.right.left=new Node(9);
    
    t.root.left.left.left=new Node(1);
   
    
    //travesal for inorder
    t.preorder(t.root);
    
    Scanner sc=new Scanner(System.in);
        System.out.println();
        System.out.println("enter insertion element");
        int n=sc.nextInt();
    //inserting a node
        
    t.insert(t.root,new Node(n));
    t.preorder(t.root);
    }
}
