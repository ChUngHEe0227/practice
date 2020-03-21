import StackAndQueue.*;
import org.junit.*;
import static org.junit.Assert.*;
public class StackAndQueueTest {
    MyStack MyStack =new MyStack();
    StackWithMin MinStack =new StackWithMin();
    @Before
    public void 스텍이잘만들어졌는지확인(){
        MyStack.push('1');
        MyStack.push('9');
        MyStack.push('2');
        MyStack.push('8');

        MinStack.printStack();
    }
    @Test
    public void 미니멈확인(){
        MinStack.push('0');
        MinStack.push('6');
        MinStack.push('4');
        MinStack.push('7');
        MinStack.push('3');
        MinStack.push('8');
        MinStack.push('2');
        MinStack.push('9');
        MinStack.push('1');
        assertSame('0',MinStack.min());
        MinStack.pop();
        assertSame('1',MinStack.min());
        MinStack.pop();
        assertSame('2',MinStack.min());
        MinStack.pop();
        assertSame('3',MinStack.min());
    }
}
