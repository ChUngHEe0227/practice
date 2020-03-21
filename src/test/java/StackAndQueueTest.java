import StackAndQueue.*;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class StackAndQueueTest {
    MyStack myStack =new MyStack();
    @Test
    public void 스텍이잘만들어졌는지확인(){
        myStack.push('1');
        myStack.push('9');
        myStack.push('2');
        myStack.push('8');
        myStack.push('3');
        myStack.push('7');
        myStack.push('4');
        myStack.push('6');
        myStack.push('5');
        myStack.printStack();
    }
}
