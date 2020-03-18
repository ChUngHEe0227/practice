import LinkedList.*;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;
public class LinkedListTest {
    Node node1 = new Node(1);
    Node node2 = new Node(2);
    Node node3 = new Node(3);
    Node node4 = new Node(1);

    DeletDuplicateExample deletDuplicateExample =new DeletDuplicateExample();
    Find_the_nth_element_behind_examlpe findTheNthElementBehindExamlpe= new Find_the_nth_element_behind_examlpe();
    Delete_nodeExample delete_nodeExample = new Delete_nodeExample();
    Create_groups_smaller_than_x_example create_groups_smaller_than_x_example =new Create_groups_smaller_than_x_example();
    CheckPalindromeExample checkPalindromeExample = new CheckPalindromeExample();
    @Before
    public void 노드생성(){
        for(int i= 0 ; i<10;i++)
            node1.appendToTail(i);

        for(int i= 0 ; i<10;i++)
            node2.appendToTail(1);

        node3.appendToTail(5);
        node3.appendToTail(8);
        node3.appendToTail(5);
        node3.appendToTail(10);
        node3.appendToTail(2);
        node3.appendToTail(1);

        node4.appendToTail(2);
        node4.appendToTail(3);
        node4.appendToTail(3);
        node4.appendToTail(3);
        node4.appendToTail(2);
        node4.appendToTail(1);

    }
    @Test
    public void 노드출력(){
        node1.printnode();
        node2.printnode();
        node3.printnode();

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
    @Test
    public void 끝에서_n번째_노드확인(){
        assertSame(findTheNthElementBehindExamlpe.Find_the_nth_element_behind(node1,1).getData(),9);
        assertSame(findTheNthElementBehindExamlpe.Find_the_nth_element_behind(node1,8).getData(),2);
    }
    @Test
    public void 노드삭제가능여부확인(){
        deletDuplicateExample.DeletDuplicate(node2);
        assertTrue(delete_nodeExample.Delete_node(node1.getNext()));
        assertFalse(delete_nodeExample.Delete_node(node2.getNext().getNext()));
    }
    @Test
    public void 특정x보다작은그룹만들기(){
        create_groups_smaller_than_x_example.Create_groups_smaller_than_x(node3,5).printnode();
    }
    @Test
    public void 회문여부확인하기(){
        assertTrue(checkPalindromeExample.CheckPalindrome(node4));
        node4.appendToTail(1);
        assertFalse(checkPalindromeExample.CheckPalindrome(node4));
    }

}
