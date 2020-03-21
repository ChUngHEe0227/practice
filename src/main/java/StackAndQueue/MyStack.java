package StackAndQueue;

import java.util.EmptyStackException;

public class MyStack {
    public static class StackNode{
        private char data;
        private StackNode next;
        public StackNode(char data){
            this.data = data;
        }
    }
    private StackNode top;
    private StackNode min;

    public char pop(){
        if(top==null)throw new EmptyStackException();
        char item = top.data;
        top=top.next;
        return item;
    }
    public void push(char item){
        StackNode stackNode = new StackNode(item);
        while(stackNode.next!=null)
        {
            if (stackNode.data > item) {
                min.next = min;
                min = stackNode;
            }
            stackNode = stackNode.next;
        }
        stackNode.next=top;
        top = stackNode;
    }
    public char peek(){
        if(top==null) throw new EmptyStackException();
        return top.data;
    }
    public char popMin(){
        if(min==null)throw new EmptyStackException();
        char item = min.data;
        min=min.next;
        return item;
    }
    public boolean isEmpty(){
        return top==null;
    }
    public void printStack(){
        while(top!=null){
            System.out.printf("%c ",top.data);
            top= top.next;
        }
    }
}
