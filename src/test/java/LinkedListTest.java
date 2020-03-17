import LinkedList.*;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;
public class LinkedListTest {
    Node node1 = new Node(1);
    Node node2 = new Node(2);
    DeletDuplicateExample deletDuplicateExample =new DeletDuplicateExample();
    @Before
    public void 노드생성(){
        for(int i= 0 ; i<10;i++)
            node1.appendToTail(i);

        for(int i= 0 ; i<10;i++)
            node2.appendToTail(1);
    }
    @Test
    public void 노드확인(){
        assertSame(node1.getData(),1);
        assertSame(node1.getNext().getData(),0);
        assertSame(node2.getData(),2);
        assertSame(node2.getNext().getData(),1);
    }
    @Test
    public void 중복노드삭제확인(){
        deletDuplicateExample.DeletDuplicate(node2);
        assertSame(node2.getNext().getData(),1);
        assertSame(node2.getNext().getNext(),null);
    }
}
