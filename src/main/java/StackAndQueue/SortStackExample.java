package StackAndQueue;

import java.util.Stack;

public class SortStackExample {
    public void SortStack(Stack<Integer> OrigiNalStack){
        Stack<Integer> tempStack = new Stack();
        tempStack.push(OrigiNalStack.pop());
        int CaryyNumber;

        while(!OrigiNalStack.isEmpty()){
            if(OrigiNalStack.peek()>tempStack.peek())
                tempStack.push(OrigiNalStack.pop());
            else{
                CaryyNumber = OrigiNalStack.peek();
                OrigiNalStack.pop();
                while(CaryyNumber<tempStack.peek()){
                    OrigiNalStack.push(tempStack.pop());
                }
                tempStack.push(CaryyNumber);
            }
        }
    }
}
