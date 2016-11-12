class MergedLinkedLists {
    public static void main(String []args) {
        /*
          Merge two linked lists
          head pointer input could be NULL as well for empty list
          Node is defined as
          class Node {
             int data;
             Node next;
          }
        */

        Node MergeLists(Node headA, Node headB) {
             // This is a "method-only" submission.
             // You only need to complete this method
            Node head = new Node();
            Node tail = head;

            while(headA != null || headB != null) {
                if(headA == null && headB != null) {
                    tail.next = headB;
                    break;
                }
                if(headA != null && headB == null) {
                    tail.next = headA;
                    break;
                }

                if(headA.data <= headB.data){
                    tail.next = headA;
                    headA = headA.next;
                } else {
                    tail.next = headB;
                    headB = headB.next;
                }
            }

            return head.next;
        }
    }
}
