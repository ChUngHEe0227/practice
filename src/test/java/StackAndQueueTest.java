import StackAndQueue.*;
import org.junit.*;

import java.util.Stack;

import static org.junit.Assert.*;
public class StackAndQueueTest {
    MyStack MyStack =new MyStack();
    StackWithMin MinStack =new StackWithMin();
    SortStackExample sortStackExample = new SortStackExample();
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
        MinStack.push('5');
        MinStack.push('6');
        MinStack.push('4');
        MinStack.push('7');
        MinStack.push('3');
        MinStack.push('8');
        MinStack.push('2');
        MinStack.push('9');
        MinStack.push('1');
        assertSame('1',MinStack.min());
        MinStack.pop();
        assertSame('2',MinStack.min());
        MinStack.pop();
        assertSame('2',MinStack.min());
        MinStack.pop();
        assertSame('3',MinStack.min());
    }
    @Ignore // 결과 값만 확인
    public void 스텍소팅(){
        Stack<Integer> Answerstack= new Stack();
        Stack<Integer> stack= new Stack();
        for(int i=0 ; i<=10 ;i++){
            stack.push(i);
            Answerstack.push(10-i);
        }
        assertSame(stack,sortStackExample.SortStack(Answerstack));
    }
}
