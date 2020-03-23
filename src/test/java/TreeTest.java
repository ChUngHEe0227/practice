import Tree.*;
import org.junit.*;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;
public class TreeTest {
    CreatMinimalBSTExample creatMinimalBSTExample = new CreatMinimalBSTExample();
    MyTree tree1 = new MyTree();
    @Before
    public void 트리만들기(){

        MyNode node= new MyNode(2);
        node.leftNode =new MyNode(1);
        node.rightNode=new MyNode(3);
        tree1.root = node;
    }
    @Test
    public void 오름차순으로졍렬된배열을BST트리로만들기(){
        int[] ary= {1,2,3};
        assertThat(creatMinimalBSTExample.CreatMinimalBST(ary).data,is(tree1.root.data));
        assertThat(creatMinimalBSTExample.CreatMinimalBST(ary).leftNode.data,is(tree1.root.leftNode.data));
        assertThat(creatMinimalBSTExample.CreatMinimalBST(ary).rightNode.data,is(tree1.root.rightNode.data));
    }
}
