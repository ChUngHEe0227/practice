package StackAndQueue;

import java.util.EmptyStackException;
import java.util.Stack;

public class MyQueue {
    Stack<Integer> ordStack = new Stack<Integer>();
    Stack<Integer> LazyStack = new Stack<Integer>();

    public void push(int item){
        ordStack.push(item);
    }

    public Integer pop(){
        if(!LazyStack.isEmpty()) return LazyStack.pop();
        if(ordStack.isEmpty()) throw new EmptyStackException();
        while (!ordStack.isEmpty()){
            LazyStack.push(ordStack.pop());
        }
        return LazyStack.pop();
    }
}
