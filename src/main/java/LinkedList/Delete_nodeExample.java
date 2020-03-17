package LinkedList;

public class Delete_nodeExample {
    public Boolean Delete_node(Node node){

        if(node==null||node.next==null){
            return false;
        }
        Node nextnode = node.next;
        node.next = nextnode.next;
        node.setData(nextnode.getData());
        return true;
    }
}
