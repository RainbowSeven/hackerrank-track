class LinkedList {
    public static void main(String []args){

    }

    /*
      Print elements of a linked list on console 
      head pointer input could be NULL as well for empty list
      Node is defined as 
      class Node {
         int data;
         Node next;
      }
    */
    void Print(Node head) {
        if (head != null) {
            System.out.println(head.data);
            Node next = head.next;
            
            if(next != null) {
                Print(next);
            }
        }
    }
}