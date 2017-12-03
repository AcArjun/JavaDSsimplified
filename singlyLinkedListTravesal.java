/*  
 single linked created by inserting 4 nodes and travesed using recursion
 
 10 20 30 60


*/





public class link {
     Node head;
     void print(Node node)
     {
         if(node==null)
         return;
         
         System.out.print(node.data+" ");
         node=node.next;
         print(node);
     }
    public static void main(String[] args) {
       link ll=new link();
       ll.head=new Node(10);
       Node second=new Node(20);
       Node third=new Node(30);
       Node fourth=new Node(60);
       
       ll.head.next=second;
       second.next=third;
       third.next=fourth;
       
       ll.print(ll.head);
    }

    
}
