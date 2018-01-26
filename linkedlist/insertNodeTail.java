/*
  Insert Node at the end of a linked list 
  head pointer input could be NULL as well for empty list
  Node is defined as 
  class Node {
     int data;
     Node next;
  }
*/
public class Solution{
    public Node insertNodeTail(Node head, int data){
        /*Define the new node at the beginning*/
        Node newNode = new Node();
        newNode.data = data;
        newNode.next = null;
        
        if(head == null){
            /*For the case that the list is null.
             Inserting new node is still feasible*/
            head = newNode;
            return head;
        }
        
        Node current = head;
        while(current.next != null) {
            current = current.next;
        }
        current.next = newNode;
        
        return head;
    }
}
