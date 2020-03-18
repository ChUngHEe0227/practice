package LinkedList;

public class Create_groups_smaller_than_x_example {
    public Node Create_groups_smaller_than_x(Node node, int x){

        Node tail =node;
        Node head =node;
        while (node != null){
            Node next = node.next;
            if (node.data<x) {
                node.next = head;
                head = node;
            }
            else {
                tail.next = node;
                tail = node;
            }
            node = next;
        }
        tail.next = null;
        return head;
    }
}
