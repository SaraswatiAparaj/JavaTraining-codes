class LinkedList1
{
class Node
{
    int data;
    Node next;
    Node previous;
    
    Node(int data)
    {
        this.data=data;      
    }  
}
Node head, last = null;

   public void add(int data)
    {
        Node newnode=new Node(data);
        //return newnode;
        
        if(head == null)
        {
            head = last = newnode;
         
        }
        else 
        {
            last.next = newnode;    
            last = newnode;
            last.next = null;
        }
    }
     
    public void DisplayNode()
    {
         Node a = head;

           while(a != null)
           {
                System.out.print(a.data + "->");
                a = a.next;
           }
          // System.out.print(a.data);        
}
}

public class Addlinkedlist
{

   public static void main(String[] args) 
   {
        // TODO Auto-generated method stub
LinkedList1 ob1= new LinkedList1();

ob1.add(5);
ob1.add(6);
ob1.add(7);
ob1.add(8);
ob1.add(9);

ob1.DisplayNode();
   }
}
