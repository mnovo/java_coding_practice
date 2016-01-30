/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author michael
 */
public class Node {
    
   Node next = null;
   int data;
   
   public Node(int d)
   {
       data = d;
   }
   
   
   void appendToTail(int d)
   {
       Node end = new Node(d);
       Node n = this;
       while (n.next != null) {
           n = n.next;
       }
       n.next = end;  
     }
   
   Node deleteNode(Node head, int d)
   {
       Node n = head;
       
       if (n.data == d){
           return head.next; /* moved head */
       }
       
       while (n.next != null) {
           if (n.next.data == d) {
               n.next = n.next.next;
               return head; /* head didn't change */
           }
           n = n.next;
       }
       return head;       
   }
   
   // Question 2.1
   void removeDuplicates(Node head)
   {
       // Make another pointer that will be used for inner loop
       Node pointer = head;
       
       // Make a pointer that will be used for outer loop
       
       
       
       // Iterate through whole list
       while (head.next != null)
       {
           
       }
         
       
   }
  
   // With extra space, use arraylist and insert values as traversing list
   // for the first time
   // Then traverse linked list, check if duplicate, and delete accordingly
   
   // Follow up to Question 2.1
   void removeDuplicatesNoBuffer(Node head)
   {
       
   }
}
