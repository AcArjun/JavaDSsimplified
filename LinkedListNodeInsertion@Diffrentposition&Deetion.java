public class insertfront {
    Node head;
     void print(Node node)
     {
         if(node==null)
         return;
         
         System.out.print(node.data+" ");
         node=node.next;
         print(node);
     }
     void insf(Node n)
     {
         n.next=head;
         head=n;
         
     }
     void inse(Node node,Node n)
     {
         if(node.next==null)
         {
             node.next=n;
             return;
         }
          node=node.next;
          inse(node,n);
     }
     
     void insm(Node node,Node node2,Node n)
     {
         node.next=n;
         n.next=node2;
     }
     
     
     void delete(int d,Node node)
     {
        
         Node prev;
         if(head.data==d)
         {
            head=head.next; 
            return;
         }
         
         prev=node;
         node=node.next;
         if(node.data==d)
         {
           prev.next=node.next;
           return;
         }
         delete(d,node);
         
     }
     public static void main(String[] args) {
         insertfront ll=new insertfront();
       ll.head=new Node(10);
       Node second=new Node(20);
       Node third=new Node(30);
       Node fourth=new Node(60);
       
       ll.head.next=second;
       second.next=third;
       third.next=fourth;
       
       ll.print(ll.head);
       
       
         System.out.println("inserting node at front");
         Node k=new Node(22);
         ll.insf(k);
         
         ll.print(ll.head);
         
         
         System.out.println("inseting node at end");
         
         ll.inse(ll.head,new Node(99));   
         ll.print(ll.head);
         
         
         System.out.println("inserting node at middle");
         ll.insm(third,fourth,new Node(88));
         ll.print(ll.head);
         
         
         System.out.println("deleting node element 60");
         ll.delete(30,ll.head);
         ll.print(ll.head);
         
    }
    
}
