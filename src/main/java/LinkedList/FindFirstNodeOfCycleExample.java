package LinkedList;

public class FindFirstNodeOfCycleExample {
    public Node  FindFirstNodeOfCycle(Node node){
        Node SlowRunner= node;
        Node FastRunner = node;

        while (FastRunner!=null&&FastRunner.next!=null)
        {
            SlowRunner= SlowRunner.next;
            FastRunner= FastRunner.next.next;
            if(SlowRunner==FastRunner)break;
        }
        while(SlowRunner==node){
             node=node.next;
             SlowRunner = SlowRunner.next;
        }
        return node;
    }
}
