package LinkedList;

public class Find_the_nth_element_behind_examlpe {
    public Node Find_the_nth_element_behind(Node node, int n){
        Node nodetarget=node;
        Node nodeLast=node;
        for(int i=0; i<n;i++)
        {
            if (node.next == null)
                return null;
            nodeLast=nodeLast.next;
        }
        while (nodeLast != null){
            nodeLast=nodeLast.next;
            nodetarget=nodetarget.next;
        }
        return nodetarget;
    }
}
