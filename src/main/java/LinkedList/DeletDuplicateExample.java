package LinkedList;

import java.util.HashSet;

public class DeletDuplicateExample {
    public void DeletDuplicate(Node n){
        HashSet set = new HashSet<>();
        Node previous = null;
        while(n!=null)
        {
            if(set.contains((n.data)))
                previous.next = n.next;
            else {
                    set.add(n.data);
                    previous = n;
            }
            n = n.next;
        }
    }
}
