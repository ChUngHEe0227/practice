package LinkedList;
import lombok.Data;

@Data
public class Node {
    Node next = null;
    int data;
    public Node (int inputdata){
        data= inputdata;
    }
    public void appendToTail(int inputdata){
        Node end = new Node(inputdata);
        Node n =this;
        while(n.next != null){
            n=n.next;
        }
        n.next = end;
    }
    public void printnode(){
        Node n =this;
        while(n !=null){
            System.out.printf("%d ",n.data);
            n=n.next;
        }
    }
}
