import java.io.*;

// Java program to implement
// a Singly Linked List
public class Employee_LL {

 Node head; // head of list

 // Linked list Node.
 // This inner class is made static
 // so that main() can access it
 static class Node {
 String name;
 String phone;
 double salary;
 int ssn;
 Node next;

 // Constructor
 Node(String s,String p,double sal,int d)
 {
 name = s;
 phone=p;
 salary=sal;
 ssn=d;
 next = null;
 }
 }

 // Method to insert a new node
 public static Employee_LL insertLast(Employee_LL list, String s,String p,double sal,int d )
 {
 // Create a new node with given data
 Node new_node = new Node(s,p,sal,d);
 new_node.next = null;

 // If the Linked List is empty,
 // then make the new node as head
 if (list.head == null) {
 list.head = new_node;
 }
 else {
 // Else traverse till the last node
 // and insert the new_node there
 Node last = list.head;
 while (last.next != null) {
 last = last.next;
 }

 // Insert the new_node at last node
 last.next = new_node;
 }

 // Return the list by head 
 return list;
 }
 public static Employee_LL insertBegin(Employee_LL list, String s,String p,double sal,int d )
 {
 // Create a new node with given data
 Node new_node = new Node(s,p,sal,d);
 new_node.next = null;

 // If the Linked List is empty,
 // then make the new node as head
 if (list.head == null) {
 list.head = new_node;
 }
 else {
 // Else traverse till the last node
 // and insert the new_node there
 Node first = list.head;
 new_node.next=list.head;
 list.head=new_node;
 }

 // Return the list by head 
 return list;
 }
 /*
public static void delete(Employee_LL list, int p){
    Node temp=list.head;
    temp.next=list.head;
    
    if(list.head==null){
        return;
    }
    else{
        int count=0;
        while(count!=p && temp.next!=null){
            temp=temp.next;
            count++;
        }
        if(count==p){
            Node temp2=temp.next;
            temp.next=temp2.next;
            //delete temp2;
            
        }
        else{
            return;
        }
    }
}
*/
 public static void deleteNode(Employee_LL list,int position) 
    { 
        // If linked list is empty 
        if (list.head == null) 
            return; 
  
        // Store head node 
        Node temp = list.head; 
  
        // If head needs to be removed 
        if (position == 0) 
        { 
            list.head = temp.next;   // Change head 
            return; 
        } 
  
        // Find previous node of the node to be deleted 
        for (int i=0; temp!=null && i<position-1; i++) 
            temp = temp.next; 
  
        // If position is more than number of nodes 
        if (temp == null || temp.next == null) 
            return; 
  
        // Node temp->next is the node to be deleted 
        // Store pointer to the next of node to be deleted 
        Node next = temp.next.next; 
  
        temp.next = next;  // Unlink the deleted node from list 
    } 

 // Method to print the Employee_LL.
 public static void printList(Employee_LL list)
 {
 Node currNode = list.head;

//System.out.print("Employees: ");

 // Traverse through the Employee_LL
 while (currNode != null) {
 // Print the data at current node
 System.out.println(currNode.name + " "+currNode.phone + " "+currNode.salary + " "+currNode.ssn + " ");

 // Go to next node
 currNode = currNode.next;
 }
 }

 // Driver code
 public static void main(String[] args)
 {
 /* Start with the empty list. */
 Employee_LL list = new Employee_LL();

 //
 // ******INSERTION******
 //

 // Insert the values
 list = insertBegin(list,"Ross","9989554629",25000.50,458);
 list = insertLast(list,"Chandler","9524522185",100000.86,100); 
 list = insertBegin(list,"Monica","985845255",50000.86,100);
 list = insertLast(list,"Joey","9854852145",750000.86,100);
 list = insertBegin(list,"Rachel","966655385",600000.86,100);
 list = insertLast(list,"Pheobe","9848524235",10000.86,100);
 deleteNode(list,2);
 

 // Print the Employee_LL
 printList(list);
 }
} 