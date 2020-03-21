package StackAndQueue;

public class StackWithMin extends MyStack {
    MyStack MinStack;

    public StackWithMin(){
        MinStack = new MyStack();
    }
    @Override
    public void push(char item) {
        if(item<=min()) MinStack.push(item);
        super.push(item);
    }

    @Override
    public char pop() {
        char value = super.pop();
        if(value==min()){
            MinStack.pop();
        }
        return value;
    }
    public char min(){
        if(MinStack.isEmpty()){
            return Character.MAX_VALUE;
        }
        else{
            return MinStack.peek();
        }
    }
}
