package LinkedList;

import java.util.Stack;

public class CheckPalindromeExample {
    public boolean CheckPalindrome(Node node){
        Node Slowrunner = node;
        Node Fasternode = node;

        Stack <Integer> stack = new Stack();
        while (Fasternode !=null && Fasternode.next!=null){
            stack.push(Slowrunner.data);
            Slowrunner = Slowrunner.next;
            Fasternode = Fasternode.next.next;
        }
        if(Fasternode != null){
            Slowrunner = Slowrunner.next;
        }
        while(Slowrunner!=null){
            if(Slowrunner.data!= stack.pop()) {
                return false;
            }
            Slowrunner=Slowrunner.next;
        }
        return true;
    }
}
