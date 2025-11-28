class Solution {
    public Node insertAtEnd(Node head, int x) {
        // Case 1: Empty list
        if (head == null) {
            return new Node(x);
        }

        // Case 2: Traverse to the end
        Node temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }

        // Create new node and link it
        Node newNode = new Node(x);
        temp.next = newNode;

        return head;
    }
}